package com.cognizant.emplyeemanagementsystem.bean;

public class EmployeeBean {

private String firstname;
private String lastname;
private String empid;
private String psw;
private String designation;
private String salary;
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
public String getEmpid() {
	return empid;
}
public void setEmpid(String empid) {
	this.empid = empid;
}
public String getPsw() {
	return psw;
}
public void setPsw(String psw) {
	this.psw = psw;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((designation == null) ? 0 : designation.hashCode());
	result = prime * result + ((empid == null) ? 0 : empid.hashCode());
	result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
	result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
	result = prime * result + ((psw == null) ? 0 : psw.hashCode());
	result = prime * result + ((salary == null) ? 0 : salary.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	EmployeeBean other = (EmployeeBean) obj;
	if (designation == null) {
		if (other.designation != null)
			return false;
	} else if (!designation.equals(other.designation))
		return false;
	if (empid == null) {
		if (other.empid != null)
			return false;
	} else if (!empid.equals(other.empid))
		return false;
	if (firstname == null) {
		if (other.firstname != null)
			return false;
	} else if (!firstname.equals(other.firstname))
		return false;
	if (lastname == null) {
		if (other.lastname != null)
			return false;
	} else if (!lastname.equals(other.lastname))
		return false;
	if (psw == null) {
		if (other.psw != null)
			return false;
	} else if (!psw.equals(other.psw))
		return false;
	if (salary == null) {
		if (other.salary != null)
			return false;
	} else if (!salary.equals(other.salary))
		return false;
	return true;
}
@Override
public String toString() {
	return "EmployeeBean [firstname=" + firstname + ", lastname=" + lastname + ", empid=" + empid + ", psw=" + psw
			+ ", designation=" + designation + ", salary=" + salary + "]";
}



}

