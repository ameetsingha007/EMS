package com.cognizant.employeemanagementsystem.service;

import com.cognizant.emplyeemanagementsystem.bean.LoginBean;

public interface LoginService {
	public String insertLogin(LoginBean login );


    public boolean authenticateLogin(LoginBean login);
}
