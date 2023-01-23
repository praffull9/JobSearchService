package com.jobs.employer.controllers;

//Developed by Praffull Manekar on 22 January 2023
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobs.employer.entities.Job;
import com.jobs.employer.entities.JobResponseEntity;
import com.jobs.employer.services.JobReader;

@RestController
@RequestMapping("/jobs")
@ComponentScan("com.jobs.employer.services")
public class OpeningController {
	
	@Autowired
	private JobReader jobReader;
	
	@GetMapping("/skill/{skill}")
	public List<JobResponseEntity> getBySkill(@PathVariable("skill") String skill)
	{
		return jobReader.searchJobsOnSkills(skill);
	}
	
	@GetMapping("/location/{location}")
	public List<JobResponseEntity> getByLocation(@PathVariable("location") String location)
	{
		return jobReader.searchJobsOnLocations(location);
	}
	
	@PostMapping("/search")
	public List<JobResponseEntity> getByLocation(@RequestBody Job job)
	{
		return jobReader.searchJobsOnSkillAndLocations(job.getSkills().get(0),job.getLocations().get(0));
	}
	

}
