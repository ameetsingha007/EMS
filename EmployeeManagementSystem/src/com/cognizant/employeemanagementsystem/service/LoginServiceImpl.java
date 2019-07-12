package com.cognizant.employeemanagementsystem.service;

import com.cognizant.employeemanagementsystem.dao.LoginDAO;
import com.cognizant.employeemanagementsystem.dao.LoginDAOImpl;
import com.cognizant.emplyeemanagementsystem.bean.LoginBean;

public class LoginServiceImpl implements LoginService {

	LoginDAO loginDAO=new LoginDAOImpl();
	
	@Override
	public String insertLogin(LoginBean login) {

		
		return loginDAO.insertLogin(login);
	}

	@Override
	public boolean authenticateLogin(LoginBean login) {

		
		return loginDAO.authenticateLogin(login);
	}

}
