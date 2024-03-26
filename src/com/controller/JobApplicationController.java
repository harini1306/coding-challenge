package com.controller;

import java.sql.SQLException;
import java.time.LocalDate;

import java.util.List;
import java.util.Scanner;

import com.model.JobApplication;
import com.service.JobApplicationService;



public class JobApplicationController {
	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		JobApplicationService jobApplicationService = new JobApplicationService();
		
		while(true) {
			System.out.println("applicatantdetails");
			System.out.println("press 1 view applicantdetails");
			System.out.println("press 2 to add new Applicant");
			
			
			System.out.println("press 0 to exit");
			
			int input = sc.nextInt();
			if(input==0) {
				System.out.println("exiting ...Thankyou..");
				break;
			}
			switch(input) {
			case 1:
				List<JobApplication> list;
				
				
					list = jobApplicationService.fetchAllApplicant();
					System.out.println("enter Account id");
					int id=sc.nextInt();
					JobApplication a= jobApplicationService.fetchAllApplicantById(list,id);
					System.out.println(String.format("%-15s%-15s%-15s%-15s",
					        "id", "jobid", "appid", "coverletter"));

					System.out.println(String.format("%-15d%-15s%-15s%-15s",
					        a.getId(),a.getJobId(),a.getApplicantId(),a.getCoverLetter()));

				
				break;
			case 2:
				 
					 System.out.println("new Appicant's application form");
						System.out.println("Enter jobId");
						int jobId=sc.nextInt();
						System.out.println("Enter ApplicantId:");
						int appId=sc.nextInt();
						System.out.println("Enter date");
						sc.nextLine(); 
						
						String dateInput = sc.nextLine();
						System.out.println("Input received: " + dateInput); 
						LocalDate appdate = LocalDate.parse(dateInput);

						System.out.println("Enter CoverLetter");
						String coverLetter=sc.next();
						
						jobApplicationService.createApplicant(jobId,appId,appdate,coverLetter);
						System.out.println("Registration Successfull!!");
				       
				 
						
			}		
			
			}
sc.close();
	}
}






