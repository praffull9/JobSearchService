package com.jobs.employer.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.jobs.employer.entities.JobResponseEntity;
import com.jobs.employer.repositories.JobResponseEntityRepository;

@Service
public class JobReader {
	@Autowired
	private JobResponseEntityRepository jobResponseEntityRepository; 
	
	JobResponseEntity opening;
	
	@KafkaListener(topics="newjobs",groupId = "jobs")
	public void retrieveFromKafka(JobResponseEntity opening)
	{
		this.opening=opening;
		jobResponseEntityRepository.save(opening);
		System.out.println("Job object saved in DB : "+opening);
	}
	
	public List<JobResponseEntity> searchJobsOnSkills(String skill)
	{
		return jobResponseEntityRepository.findBySkills(skill);
	}
	
	public List<JobResponseEntity> searchJobsOnLocations(String location)
	{
		return jobResponseEntityRepository.findByLocations(location);
	}

	public List<JobResponseEntity> searchJobsOnSkillAndLocations(String skill,String location)
	{
		return jobResponseEntityRepository.findBySkillsAndLocations(skill,location);
	}

}
