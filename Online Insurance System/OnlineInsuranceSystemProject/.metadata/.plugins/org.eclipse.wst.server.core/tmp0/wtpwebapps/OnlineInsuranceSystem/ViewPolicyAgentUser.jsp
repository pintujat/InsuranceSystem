<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.*,com.manipal.model.*"%>

<%@page import="com.manipal.service.impl.PolicyServiceImpl"%>
<%@page import="com.manipal.service.PolicyService"%>
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
PolicyService service = new PolicyServiceImpl();
List<Policy> policyList = new ArrayList<Policy>();
policyList = service.viewPolicyService();
	%>

<table>
<tr>
	<th>Policy id</th>
	<th>Insurance Id</th>
	<th>PolicyHoldername</th>
	<th>Coverage</th>
	<th>Amount</th>
	<th>PolicyDate</th>
	<th>Agent id</th>
	<th>User id</th>
<!-- 	<th>Update</th>
	<th>Delete</th> -->
</tr>
<% java.util.Iterator it=policyList.iterator();
while(it.hasNext())
{
	Policy obj=(Policy)it.next();
%>
<tr>
	<td><%= obj.getPolicyId() %></td>
	<td><%= obj.getInsuranceId() %></td>
	<td><%= obj.getPolicyHolderName() %></td>
	<td><%= obj.getCoverage() %></td>
	<td><%= obj.getAmount() %></td>
	<td><%= obj.getPolicyDate() %></td>
	<td><%= obj.getAgentId() %></td>
	<td><%= obj.getUserId() %></td>
	<!--  <td><a href="UpdatePolicy.jsp?x=<%= obj.getPolicyId() %>">Update</a></td>
	<td><a href="DeletePolicy.jsp?x=<%= obj.getPolicyId() %>">Delete</a></td>
-->
</tr>
<%} %>
</body>
</html>