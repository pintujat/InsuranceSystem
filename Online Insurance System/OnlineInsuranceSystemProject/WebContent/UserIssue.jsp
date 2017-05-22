<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/Admin.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log in Unsuccessful</title>
</head>
<body>
<h1>Online Insurance System</h1>

<ul data-role="listview" id="listview-1">
			<li><a href="Home.jsp">Home</a></li>
</ul>
		<div>
		<%
		String error=request.getParameter("error");
		%>
<h3><%= error%></h3>
</div>
</body>
</html>