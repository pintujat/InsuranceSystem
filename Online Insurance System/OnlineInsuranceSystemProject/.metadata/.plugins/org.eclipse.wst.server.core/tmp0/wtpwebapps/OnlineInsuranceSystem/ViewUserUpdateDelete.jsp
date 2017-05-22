<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.*,com.manipal.model.*"%>

<%@page import="com.manipal.service.impl.*"%>
<%@page import="com.manipal.service.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style> 
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
</head>
<body>
<%
	UserService service = new UserServiceImpl();
	List<UserModel> userList = new ArrayList<UserModel>();
	userList = service.findAllUsers();
	%>

<table>
<tr>
	<th>User id</th>
	<th>User Name</th>
	<th>DOB</th>
	<th>Gender</th>
	<th>Pan_no</th>
	<th>Salary</th>
	<th>Mobile No</th>
	<th>Nationally</th>
	<th>Update</th>
	<th>Delete</th>
</tr>
<% java.util.Iterator it=userList.iterator();
while(it.hasNext())
{
	UserModel obj=(UserModel)it.next();
%>
<tr>
	<td><%= obj.getUserId() %></td>
	<td><%= obj.getName() %></td>
	<td><%= obj.getDOB() %></td>
	<td><%= obj.getGender() %></td>
	<td><%= obj.getpanNo() %></td>
	<td><%= obj.getSalary() %></td>
	<td><%= obj.getmobNo() %></td>
	<td><%= obj.getNationality() %></td>
	<td><a href="UpdateAgent.jsp?x=<%= obj.getUserId() %>">Update</a></td>
	<td><a href="DeleteAgent.jsp?x=<%= obj.getUserId() %>">Delete</a></td>

</tr>
<%} %>
</body>
</html>