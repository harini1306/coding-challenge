package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.CompanyDao;
import com.dao.CompanyDaoImpl;
import com.model.Company;



public class CompanyService {
	CompanyDao companyDao = new CompanyDaoImpl();

	public List<Company> fetchAllCompany() throws SQLException {
		
			List<Company> list = companyDao.fetchAllCompany();
			return list;
		}
	

	public Company fetchCompanyById(List<Company> list, int id) {
		for (Company c : list) {
			if (c.getId()== id)
				return c;
	}
		return null;
	
	}

}
