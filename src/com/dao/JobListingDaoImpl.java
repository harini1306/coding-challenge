package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.exception.SalaryCalculationHandlingException;
import com.model.JobListing;
import com.util.DBUtility;



public class JobListingDaoImpl implements JobListingDao {
	
		

	@Override
	public List<JobListing> fetchAllJobs() throws SQLException {
		List<JobListing> list = new ArrayList<>();
		Connection conn = DBUtility.getDBConn();

		String sql = "select * from joblisting";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		ResultSet rst = pstmt.executeQuery();
	
	while (rst.next()) 
	{
		int jobid = rst.getInt("id");
		int companyid = rst.getInt("companyid");
		
		String jobtitle = rst.getString("jobtitle");
		String jobdesc = rst.getString("jobdescription");
		
		String joblocation = rst.getString("joblocation");
		
		double salary = rst.getDouble("salary");
		
		String jobtype = rst.getString("jobtype");
		
		LocalDate postedDate = rst.getDate("posteddate").toLocalDate();
		JobListing j = new JobListing(jobid,companyid, jobtitle, jobdesc, joblocation, salary,jobtype, 
				postedDate);
		list.add(j);
	}

	DBUtility.dbClose();
	return (list);

}

	@Override
	public void calculateSalary(List<JobListing> list, int id) throws SQLException, SalaryCalculationHandlingException {
		
	}

	@Override
	public void updateJob(int companyid,String jobtitle,String jobdescription,String joblocation,double salary,String jobtype) throws SQLException {

		Connection conn = DBUtility.getDBConn();

		String sql = "INSERT INTO joblisting (companyid, jobtitle, jobdescription, joblocation, salary, jobtype) values(?,?,?,?,?,?)";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		
		pstmt.setInt(1, companyid);
		pstmt.setString(2, jobtitle);
		pstmt.setString(3, jobdescription);
		pstmt.setString(4, joblocation);
		pstmt.setDouble(5, salary);
		pstmt.setString(6, jobtype);


		pstmt.executeUpdate();


		DBUtility.dbClose();
		
	}
}
