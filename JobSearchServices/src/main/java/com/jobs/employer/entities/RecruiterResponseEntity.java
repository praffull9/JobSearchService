package com.jobs.employer.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RecruiterResponseEntity {
	private int recruiterid;
	private String recruitername;
	private int companyid;
	private String mobilenumber;
	private String emailid;
	private String city;
	private Company company;
}
