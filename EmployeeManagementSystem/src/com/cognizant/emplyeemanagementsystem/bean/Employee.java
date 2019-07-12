package com.cognizant.emplyeemanagementsystem.bean;

public class Employee {
private int empid;
private String firstname;
private String lastname;
private int salary;
private String designation;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public Employee(int empid, String firstname, String lastname, int salary, String designation) {
	super();
	this.empid = empid;
	this.firstname = firstname;
	this.lastname = lastname;
	this.salary = salary;
	this.designation = designation;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

}
