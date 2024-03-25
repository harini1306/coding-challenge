package com.controller;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.exception.DatabaseConnectionException;
import com.exception.SalaryCalculationHandlingException;
import com.model.JobListing;
import com.service.JobListingService;

public class JobListingController {

	public static void main(String[] args) throws DatabaseConnectionException {
		
			Scanner sc = new Scanner(System.in);
			
			JobListingService jobListingtService = new JobListingService();
			
			while(true) {
				System.out.println("Listing all Job details");
				System.out.println("press 1 list All Jobs");
				System.out.println("press 2 calculate avg salary");
				System.out.println("press 3 to enter new job");
				System.out.println("press 0 to exit");
				
				int input = sc.nextInt();
				if(input==0) {
					System.out.println("exiting ...Thankyou..");
					break;
				}
				switch(input) {
				case 1:
					List<JobListing> list;
					try {
						list = jobListingtService.fetchAllJobs();
						System.out.println("enter Account id");
						int id=sc.nextInt();
						JobListing j= jobListingtService.fetchAllJobsbyId(list,id);
						
						System.out.println(String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s", "jobd",
								"CompanyId", "Job title", "Job description", "joblocation", "salary","type",
								"postedDate"));
						System.out.println(String.format("%-15d%-15s%-15s%-15s%-15s%-15s%-15s",j.getJobId(),j.getCompanyId(),j.getJobTitle(),
								j.getJobDesc(),j.getJobLocation(),j.getSalary(),j.getJobType(),j.getPostedDate().toString()));
					} catch (SQLException e) {
						// TODO Auto-generate block
						e.printStackTrace();
					}
					
				case 2:
					System.out.println("salary details");
					
						try {
							list = jobListingtService.fetchAllJobs();
						
						System.out.println("enter Account id");
						int id=sc.nextInt();
					
						 jobListingtService.calculateSalary(list,id);
						}
						 catch (SalaryCalculationHandlingException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
								
					 catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				
				case 3:
					System.out.println("new job lists");
					System.out.println("enter company id");
					int cid=sc.nextInt();
					System.out.println("job title:");
					String jobtitle=sc.next();
					System.out.println("job description");
					String jobDescription=sc.next();
					System.out.println("location");
					String location=sc.next();
					System.out.println("salary");
					double salary = sc.nextDouble();					
					System.out.println("job type");
					String jobTypee=sc.next();
					try {
						jobListingtService.updateJob(cid,jobtitle,jobDescription,location,salary,jobTypee);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					
				}
	}
sc.close();
	}
}