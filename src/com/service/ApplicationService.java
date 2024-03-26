package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.ApplicationDao;
import com.dao.ApplicationDaoImpl;
import com.exception.DatabaseConnectionException;
import com.exception.FileUploadException;
import com.exception.InvalidEmailFormatHandlingException;
import com.model.Application;



public class ApplicationService {
	ApplicationDao applicationDao = new ApplicationDaoImpl();

	public List<Application> fetchAllApplication() throws SQLException {
		List<Application> list = applicationDao.fetchAllApplication();
		return list;
	}

	public Application fetchAllApplicationById(List<Application> list, int id) throws DatabaseConnectionException {
		for (Application a : list) {
			if (a.getId()== id)
				return a;
	}
		throw new DatabaseConnectionException("check database connection");
		
	}

	public void registerApplicant(String firstName, String lastName, String email, String phoneNumber, String resume) throws SQLException, InvalidEmailFormatHandlingException,FileUploadException {
		applicationDao.registerApplicant(firstName, lastName, email, phoneNumber, resume);
	
	
	
	
	}
}
	


