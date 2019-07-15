package com.cognizant.employeemanagementsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cognizant.employeemanagementsystem.util.DBUtils;
import com.cognizant.emplyeemanagementsystem.bean.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public boolean insertDetails(EmployeeBean bean) {
		// TODO Auto-generated method stub
Connection connection=null;
		
		PreparedStatement preparedstatement = null;
		
		
		try{
		connection = DBUtils.getConnection();
		String query="insert into employee(firstname,lastname,empid,psw,designation,salary) values(?,?,?,?,?,?)";
		preparedstatement = connection.prepareStatement(query);
		preparedstatement.setString(1,bean.getFirstname());
		preparedstatement.setString(2,bean.getLastname());
		preparedstatement.setString(3,bean.getEmpid());
		preparedstatement.setString(4,bean.getPsw());
		preparedstatement.setString(5,bean.getDesignation());
		preparedstatement.setString(6,bean.getSalary());
		preparedstatement.executeUpdate();
		connection.commit();
		}
		
		catch (SQLException e){
			e.printStackTrace();
		}
		
		finally{
			DBUtils.closeConnection(connection);
		}
		
		return true;
	}

	@Override
	public boolean employeeDetails(EmployeeBean bean) {
		// TODO Auto-generated method stub
		
		Connection connection=null;
		
		PreparedStatement preparedstatement = null;
		
		ResultSet resultset=null;
		
		try{
			connection = DBUtils.getConnection();
			String query="select * from employee where firstname=? and lastname=? and empid=? and psw=? and designation=? and salary=?";
			preparedstatement = connection.prepareStatement(query);
			preparedstatement.setString(1,bean.getFirstname());
			preparedstatement.setString(2,bean.getLastname());
			preparedstatement.setString(3,bean.getEmpid());
			preparedstatement.setString(4,bean.getPsw());
			preparedstatement.setString(5,bean.getDesignation());
			preparedstatement.setString(6,bean.getSalary());
			resultset = preparedstatement.executeQuery();
			if(resultset.next())
			{
				return true;
			}
			return false;
		}
		
		catch (SQLException e){
			e.printStackTrace();
		}
		
		finally{
			DBUtils.closeConnection(connection);
		}
		
		return false;
	}

}
