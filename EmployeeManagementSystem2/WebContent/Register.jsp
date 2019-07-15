<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<h3> Register Here</h3>
<form action="FrontController?Register" method="post">
  First name:<br>
  <input type="text" name="firstname"><br><br>
  Last name:<br>
  <input type="text" name="lastname"><br><br>
  emailId:<br>
  <input type="text" name="empid"><br><br>
   password:<br>
  <input type="text" name="psw"><br><br>
  designation:<br>
  <input type="text" name="designation"><br><br>
  salary:<br>
  <input type="text" name="salary"><br><br>
  
  
  <input type="submit" value="Submit">
</form>
</body>
</html>
