package com.jobs.employer.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Company {
	private int companyid;
	private String companyname;
	private String category;
	private String industry;
	private String country;
	private int employees;
	private String companydesc;
	

}
