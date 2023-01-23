package com.jobs.employer.entities;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection="jobs")
@Data
public class Job {
	@Id
	private String id;
	private String jobtitle;
	private int recruiterid;
	private List<String> qualifications;
	private List<String> locations;
	private List<String> skills;
	private List<String> responsibilities;
	private double annualpackage;
	private String experience;
	private String postdate; 
	private String jobstatus;
	
	public Job() {
		LocalDate ldt=LocalDate.now();
		this.postdate = ldt.toString();
		
	}

	
	
}
