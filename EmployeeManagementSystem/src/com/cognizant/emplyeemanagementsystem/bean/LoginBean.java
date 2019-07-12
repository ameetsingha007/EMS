package com.cognizant.emplyeemanagementsystem.bean;

public class LoginBean {
private String userName;
private String psw;


public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPsw() {
	return psw;
}
public void setPsw(String psw) {
	this.psw = psw;
}
public LoginBean(String userName, String psw) {
	super();
	this.userName = userName;
	this.psw = psw;
}
public LoginBean() {
	super();
	// TODO Auto-generated constructor stub
}

}
