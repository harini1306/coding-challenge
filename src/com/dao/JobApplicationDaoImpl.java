package com.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;


import com.model.JobApplication;
import com.util.DBUtility;

public class JobApplicationDaoImpl implements JobApplicationDao {

	@Override
	public List<JobApplication> fetchAllApplicant() throws SQLException {
		List<JobApplication> list = new ArrayList<>();
		Connection conn = DBUtility.getDBConn();

		String sql = "select * from job_app";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		ResultSet rst = pstmt.executeQuery();
	
	while (rst.next()) 
	{
		int id = rst.getInt("id");
		int jobid = rst.getInt("job_id");
		
		int applicantid = rst.getInt("applicant_id");
		
		String coverletter = rst.getString("cover_letter");
		
		
		
		JobApplication j = new JobApplication(id,jobid,applicantid,coverletter);
			
		list.add(j);
	}

	DBUtility.dbClose();
	return (list);
	}

}
