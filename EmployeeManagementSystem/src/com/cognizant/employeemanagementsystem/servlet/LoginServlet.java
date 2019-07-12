package com.cognizant.employeemanagementsystem.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.employeemanagementsystem.service.LoginService;
import com.cognizant.employeemanagementsystem.service.LoginServiceImpl;
import com.cognizant.emplyeemanagementsystem.bean.LoginBean;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName=request.getParameter("userName");
		String psw=request.getParameter("psw");
		
//		if ("admin".equals(userName) && "admin".equals(psw))
//		{
//			System.out.println("Successfully Logged In!!");
//		}
//		else
//			System.out.println("Login Failed!!");
//		
		
		LoginBean bean=new LoginBean();
		bean.setUserName(userName);
		bean.setPsw(psw);
		
		LoginService loginService=new LoginServiceImpl();
		if(loginService.authenticateLogin(bean))
		{
			System.out.println("successful login");
		}
		else
		{
			System.out.println("failed!!");
		}
		
	}

}
