package com.jobs.employer.entities;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection="jobopenings")
public class JobResponseEntity {
	
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
	private RecruiterResponseEntity recruiterResponseEntity;

}
