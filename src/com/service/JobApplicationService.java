package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.JobApplicationDao;
import com.dao.JobApplicationDaoImpl;


import com.model.JobApplication;


public class JobApplicationService {
	JobApplicationDao jobAppdao=new JobApplicationDaoImpl();

	public List<JobApplication> fetchAllApplicant() throws SQLException {
		
			
			List<JobApplication> list = jobAppdao.fetchAllApplicant();
			return list;
		
	}

	public JobApplication fetchAllApplicantById(List<JobApplication> list, int id) {
		for (JobApplication a : list) {
			if (a.getId()== id)
				return a;
	}
		return null;
	}

}
