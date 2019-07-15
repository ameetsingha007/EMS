package com.cognizant.employeemanagementsystem.service;

import com.cognizant.employeemanagementsystem.dao.EmployeeDAO;
import com.cognizant.employeemanagementsystem.dao.EmployeeDAOImpl;
import com.cognizant.emplyeemanagementsystem.bean.EmployeeBean;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAO employeeDAO=new EmployeeDAOImpl();
	
	@Override
	public boolean insertDetails(EmployeeBean bean) {
		
		return employeeDAO.insertDetails(bean);
	}

	@Override
	public boolean employeeDetails(EmployeeBean bean) {
		
		return employeeDAO.employeeDetails(bean);
	}

}
