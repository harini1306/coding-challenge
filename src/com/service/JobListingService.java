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

	public double calculateSalary(List<JobListing> list, int id,double averageSalary) throws SQLException, SalaryCalculationHandlingException, DatabaseConnectionException {
		jobListingDao.calculateSalary(list, id,averageSalary);
		return averageSalary;
	    }

	public void updateJob(int cid, String jobtitle, String jobDescription, String location, double salary,
			String jobType) throws SQLException {
		
		jobListingDao.updateJob(cid, jobtitle,jobDescription,  location,salary,
		jobType);
	}
		
			
		
		}
	


	

	

	

	


