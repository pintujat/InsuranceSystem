<%@page import="com.manipal.service.impl.PolicyServiceImpl"%>
<%@page import="com.manipal.service.*"%>
<%@page import="com.manipal.model.*"%>
<%! Policy pobj=null; %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<pre>
<form method="POST" action="UpdatePolicyController">

		<% PolicyService c=new PolicyServiceImpl();
Policy a=new Policy(); %>
Policy Id   <%= request.getParameter("x") %>

Insurance id:		<input type="number" name="t2" value="<%= request.getParameter("a") %>">

Policy holder name:	<input type="text" name="t3" value="<%= request.getParameter("d") %>">

Coverage:		<input type="number" name="t4" value="<%= request.getParameter("c") %>">

Amount:			<input type="number" name="t5" value="<%= request.getParameter("b") %>">

Policy Date:		<input type="date" name="t6" value="<%= request.getParameter("e") %>">

Agent id:		<%= request.getParameter("y") %>

User id:		<%= request.getParameter("z") %>
			
<input type="submit" value="Update">
</form>
</pre>
</body>
</html>