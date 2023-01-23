package com.jobs.employer.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;

import com.jobs.employer.entities.JobResponseEntity;

public interface JobResponseEntityRepository extends MongoRepository<JobResponseEntity, String> {

	//@Query(value = "{ { 'job.skills' : ?0 } }")
	public List<JobResponseEntity> findBySkills(String skill);
	
	public List<JobResponseEntity> findByLocations(String location);
	
	public List<JobResponseEntity> findBySkillsAndLocations(String skill,String location);
}
