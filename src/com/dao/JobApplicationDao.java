package com.dao;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import com.model.JobApplication;

public interface JobApplicationDao {

	List<JobApplication> fetchAllApplicant() throws SQLException;

	void createApplicant(int jobId, int appId, LocalDate appdate, String coverLetter) throws SQLException;

}
