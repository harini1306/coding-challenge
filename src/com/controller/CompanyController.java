package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.model.Company;
import com.service.CompanyService;



public class CompanyController {
	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		CompanyService companyService = new CompanyService();
		
		while(true) {
			System.out.println("Comapny details");
			System.out.println("press 1 view company details");
			
			System.out.println("press 0 to exit");
			
			int input = sc.nextInt();
			if(input==0) {
				System.out.println("exiting ...Thankyou..");
				break;
			}
			switch(input) {
			case 1:
				List<Company> list;
				
					list = companyService.fetchAllCompany();
					System.out.println("enter Account id");
					int id=sc.nextInt();
					Company c= companyService.fetchCompanyById(list,id);
					System.out.println(String.format("%-15s%-15s%-15s",
					        "id ","CompanyName", "location"));

					System.out.println(String.format("%-15d%-15s%-15s",c.getId(),c.getCompanyName(),c.getLocation()
					        ));

				
				
						
						
			
			}

}
		sc.close();
}

}
