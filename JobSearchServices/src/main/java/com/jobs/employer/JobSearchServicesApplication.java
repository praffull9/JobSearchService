package com.jobs.employer;

//Developed by Praffull Manekar on 22 January 2023
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jobs.employer.controllers")
public class JobSearchServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobSearchServicesApplication.class, args);
	}

}
