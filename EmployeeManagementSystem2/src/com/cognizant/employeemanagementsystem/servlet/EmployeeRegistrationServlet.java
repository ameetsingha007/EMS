package com.cognizant.employeemanagementsystem.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.employeemanagementsystem.service.EmployeeService;
import com.cognizant.employeemanagementsystem.service.EmployeeServiceImpl;
import com.cognizant.emplyeemanagementsystem.bean.EmployeeBean;

/**
 * Servlet implementation class EmployeeRegistrationServlet
 */
public class EmployeeRegistrationServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeRegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void dispatch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String empid=request.getParameter("empid");
		String psw=request.getParameter("psw");
		String designation=request.getParameter("designation");
		String salary=request.getParameter("salary");
		
		
		EmployeeBean bean = new EmployeeBean();
		
		
		bean.setFirstname(firstname);
		bean.setLastname(lastname);
		bean.setEmpid(empid);
		bean.setPsw(psw);
		bean.setDesignation(designation);
		bean.setSalary(salary);
		
		EmployeeService employeeService=new EmployeeServiceImpl();
		
		if(employeeService.insertDetails(bean))
		{
			System.out.println("successful");
		}
		else
		{
			System.out.println("failed!!");
		}
		
		
		
		
	}
	}


