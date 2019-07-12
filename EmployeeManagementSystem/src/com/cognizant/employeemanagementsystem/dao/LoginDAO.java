package com.cognizant.employeemanagementsystem.dao;

import java.util.logging.LoggingMXBean;

import com.cognizant.emplyeemanagementsystem.bean.LoginBean;

public interface LoginDAO {

	
	public String insertLogin(LoginBean login );


    public boolean authenticateLogin(LoginBean login);

}
