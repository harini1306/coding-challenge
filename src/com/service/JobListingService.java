package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.JobListingDao;
import com.dao.JobListingDaoImpl;
import com.exception.DatabaseConnectionException;
import com.exception.SalaryCalculationHandlingException;
import com.model.JobListing;

public class JobListingService {
	JobListingDao jobListingDao = new JobListingDaoImpl();

	public List<JobListing> fetchAllJobs() throws SQLException, DatabaseConnectionException {
		List<JobListing> list = jobListingDao.fetchAllJobs();
		return list;
	}

	public JobListing fetchAllJobsbyId(List<JobListing> list, int id) {
		for (JobListing j : list) {
			if (j.getJobId()== id)
				return j;
	}
		return null;
	

	}

	public double calculateSalary(List<JobListing> list, int id) throws SQLException, SalaryCalculationHandlingException, DatabaseConnectionException {
		  List<JobListing> list1 =jobListingDao.fetchAllJobs();
	        double totalSalary = 0;
	        int validCount = 0;

	        for (JobListing j : list1) {
	            if (j.getSalary() < 0) {
	                throw new SalaryCalculationHandlingException("Invalid salary for job listing at ");
	            } else {
	                totalSalary += j.getSalary();
	                validCount++;
	            }
	        }

	        System.out.println( totalSalary / validCount);
	        return totalSalary / validCount;
	        
	    }

	public void updateJob(int cid, String jobtitle, String jobDescription, String location, double salary,
			String jobType) throws SQLException {
		
		jobListingDao.updateJob(cid, jobtitle,jobDescription,  location,salary,
		jobType);
	}
		
			
		
		}
	


	

	

	

	


