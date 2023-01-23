package com.jobs.employer.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Recruiter {
	private int recruiterid;
	private String recruitername;
	private int companyid;
	private String mobilenumber;
	private String emailid;
	private String city;
	
	//Constructors, Setters and Getters are covered by lombok
	

}
