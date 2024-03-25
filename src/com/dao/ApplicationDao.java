package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.exception.InvalidEmailFormatHandlingException;
import com.model.Application;

public interface ApplicationDao {

	List<Application> fetchAllApplication() throws SQLException;

	void registerApplicant(String firstName, String lastName, String email, String phoneNumber, String resume) throws SQLException,InvalidEmailFormatHandlingException;

}
