package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.exception.InvalidEmailFormatHandlingException;
import com.model.Application;

import com.service.ApplicationService;


public class ApplicationController {

	public static void main(String[] args) throws SQLException {
		
			Scanner sc = new Scanner(System.in);
			
			ApplicationService applicationService = new ApplicationService();
			
			while(true) {
				System.out.println("application details");
				System.out.println("press 1 view application details");
				System.out.println("press 2 registration");
				System.out.println("press 0 to exit");
				
				int input = sc.nextInt();
				if(input==0) {
					System.out.println("exiting ...Thankyou..");
					break;
				}
				switch(input) {
				case 1:
					List<Application> list;
					
						list = applicationService.fetchAllApplication();
						System.out.println("enter Account id");
						int id=sc.nextInt();
						Application a= applicationService.fetchAllApplicationById(list,id);
						System.out.println(String.format("%-15s%-15s%-15s%-15s%-15s%-15s",
						        "id", "firstName", "lastName", "email", "phone", "resume"));

						System.out.println(String.format("%-15d%-15s%-15s%-15s%-15s%-15s",
						        a.getId(), a.getFirstName(), a.getLastName(), a.getEmail(), a.getPhone(), a.getResume()));

				case 2:
					System.out.println("registration process");
					
					System.out.println("Enter First Name:");
					String firstName=sc.next();
					System.out.println("Enter Last Name:");
					String lastName=sc.next();
					System.out.println("Enter Email Id:");
					String email=sc.next();
					System.out.println("Enter Phone Number:");
					String phoneNumber=sc.next();
					System.out.println("Enter Resume:");
					String resume=sc.next();
					
					
					try {
						applicationService.registerApplicant(firstName,lastName,email,phoneNumber,resume);
						System.out.println("Registration Successfull!!");
					
					} catch (InvalidEmailFormatHandlingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						
					break;
					
					
							
							
				
				}

	}
sc.close();
	}

}
