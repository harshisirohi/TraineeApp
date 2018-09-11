<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="traineemanagement.obj">
<h1>Trainee Management System</h1>
<table border="1">

<tr>
    <th>Pick your operation</th>   
  </tr>
<tr><td><a href="traineemanagement.obj?choice=1">Add a trainee</a></td></tr>
<tr><td><a href="traineemanagement.obj?choice=2">Delete a trainee</a></td></tr>
<tr><td><a href="traineemanagement.obj?choice=3">Modify a trainee</a></td></tr>
<tr><td><a href="traineemanagement.obj?choice=4">Retrieve a trainee</a></td></tr>
<tr><td><a href="traineemanagement.obj?choice=5">Retrieve all trainees</a></td></tr>
</table>
</form>
</body>
</html>