<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<f:form action="modified.obj" modelAttribute="tdetails">
<table>
<tr><td>Trainee Id:</td><td><f:input path="traineeId" readonly="true"/></td></tr>
<tr><td>Trainee Name:</td><td><f:input path="traineeName"/></td></tr>
<tr><td>Trainee Location:</td>

    <td><f:radiobutton value="Chennai" label="Chennai" path="traineeLocation"/></td>
    <td><f:radiobutton value="Bangalore" label="Bangalore" path="traineeLocation"/></td>
    <td><f:radiobutton value="Pune" label="Pune" path="traineeLocation"/></td>
    <td><f:radiobutton value="Mumbai" label="Mumbai" path="traineeLocation"/></td>
    
  <tr><td>Trainee Domain:</td>
  <td colspan="4" align="left">
  			<f:select path="traineeDomain" label= "Please Select">
               <option value = "JEE">JEE</option>
               <option value = "BI">BI</option>
               <option value = "ADAPT">ADAPT</option>
               <option value = "POWER BI">POWER BI</option>
             </f:select>
             </td></tr>
             <tr><td><input type="submit" value="Modify Trainee"/></td></tr>
             </table>

</f:form>
</body>
</html>