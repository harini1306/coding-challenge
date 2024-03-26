package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.exception.DatabaseConnectionException;
import com.exception.SalaryCalculationHandlingException;
import com.model.JobListing;

public interface JobListingDao {

	List<JobListing> fetchAllJobs() throws SQLException,DatabaseConnectionException;
	
	

	 void updateJob(int companyid,String jobtitle,String jobdescription,String joblocation,double salary,String jobtype) throws SQLException;

	void calculateSalary(List<JobListing> list, int id, double averageSalary) throws SalaryCalculationHandlingException, SQLException;

}
