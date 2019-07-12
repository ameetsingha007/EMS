package com.cognizant.employeemanagementsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cognizant.employeemanagementsystem.util.DBUtils;
import com.cognizant.emplyeemanagementsystem.bean.LoginBean;



public class LoginDAOImpl implements LoginDAO {

	
	
	@Override
	public String insertLogin(LoginBean login) {
		
		Connection connection=null;
		
		PreparedStatement preparedstatement = null;
		
		
		try{
		connection = DBUtils.getConnection();
		String query="insert into login(userName,psw) values (?,?)";
		preparedstatement = connection.prepareStatement(query);
		preparedstatement.setString(1,login.getUserName());
		preparedstatement.setString(2,login.getPsw());
		connection.commit();
		}
		
		catch (SQLException e){
			e.printStackTrace();
		}
		
		finally{
			DBUtils.closeConnection(connection);
		}
		return null;
	}

	
	@Override
	public boolean authenticateLogin(LoginBean login){
		
		Connection connection=null;
		
		PreparedStatement preparedstatement = null;
		
		ResultSet resultset=null;
		
		try{
			connection = DBUtils.getConnection();
			String query="select * from login where userName=? and psw=?";
			preparedstatement = connection.prepareStatement(query);
			preparedstatement.setString(1,login.getUserName());
			preparedstatement.setString(2,login.getPsw());
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
