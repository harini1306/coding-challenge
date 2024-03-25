package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.model.Company;
import com.util.DBUtility;

public class CompanyDaoImpl implements CompanyDao {

	@Override
	public List<Company> fetchAllCompany() throws SQLException {
		List<Company> list = new ArrayList<>();
		Connection conn = DBUtility.getDBConn();

		String sql = "select * from Company";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		ResultSet rst = pstmt.executeQuery();
	
	while (rst.next()) 
	{
		int id = rst.getInt("id");
		String companyname = rst.getString("companyname");
		
		String companylocation = rst.getString("location");
		
		
		Company c = new Company(id,companyname,companylocation);
			
		list.add(c);
	}

	DBUtility.dbClose();
	return (list);
	}

}
