package com.controller;

import java.sql.SQLException;
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

				
				
			
						
			}		
			
			}
sc.close();
	}
}






