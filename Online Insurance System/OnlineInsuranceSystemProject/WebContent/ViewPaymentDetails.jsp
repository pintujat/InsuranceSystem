<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.*,com.manipal.model.*"%>

<%@page import="com.manipal.service.impl.PaymentModeServiceImpl"%>
<%@page import="com.manipal.service.PaymentModeService"%>
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
	PaymentModeService service = new PaymentModeServiceImpl();
	List<PaymentModel> policyList = new ArrayList<PaymentModel>();
	policyList = service.viewPolicyService();
	%>

<table>
<tr>
	<th>Policy id</th>
	<th>Payment Id</th>
	<th>Payment Date</th>
	<th>Amount</th>
	<th>PaymentMode</th>
 	<th>Status</th> 
	
</tr>
<% java.util.Iterator it=policyList.iterator();
while(it.hasNext())
{
	PaymentModel obj=(PaymentModel)it.next();
%>
<tr>
	<td><%= obj.getPolicyId() %></td>
	<td><%= obj.getPaymentId() %></td>
	<td><%= obj.getPaymentDate() %></td>
<%-- 	<td><%= obj.getCoverage() %></td> --%>
	<td><%= obj.getAmount() %></td>
	<td><%= obj.getPaymentMode() %></td>
	<td><%= obj.getStatus() %></td>  
<%-- 	<td><%= obj.getUserId() %></td> --%>
<%-- 	<td><a href="PolicyUpdate.jsp?x=<%= obj.getPolicyId() %>">Update</a></td> --%>
<%-- 	<td><a href="PolicyDelete.jsp?x=<%= obj.getPolicyId() %>">Delete</a></td> --%>
</tr>
<%} %>
</body>
</html>