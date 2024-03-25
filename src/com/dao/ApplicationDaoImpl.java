package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import com.exception.InvalidEmailFormatHandlingException;
import com.model.Application;

import com.util.DBUtility;

public class ApplicationDaoImpl implements ApplicationDao {

	@Override
	public List<Application> fetchAllApplication() throws SQLException {
		List<Application> list = new ArrayList<>();
		Connection conn = DBUtility.getDBConn();

		String sql = "select * from application";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		ResultSet rst = pstmt.executeQuery();
	
	while (rst.next()) 
	{
		int id = rst.getInt("app_id");
		String firstname = rst.getString("firstname");
		
		String lastname = rst.getString("lastname");
		String email = rst.getString("email");
		
		String phone = rst.getString("phone");
		
		String resume = rst.getString("resume");
		
		Application a = new Application(id,firstname,lastname,email, phone,resume);
			
		list.add(a);
	}

	DBUtility.dbClose();
	return (list);
	}

	@Override
	public void registerApplicant(String firstName, String lastName, String email, String phoneNumber, String resume) throws SQLException,InvalidEmailFormatHandlingException{
		Connection conn = DBUtility.getDBConn();

		String sql = "INSERT INTO application (firstname, lastname, email, phone, resume) values(?,?,?,?,?)";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, firstName);
		pstmt.setString(2, lastName);
		pstmt.setString(3, email);
		pstmt.setString(4, phoneNumber);
		pstmt.setString(5, resume);
		

		pstmt.executeUpdate();

		DBUtility.dbClose();
		
	}

}
