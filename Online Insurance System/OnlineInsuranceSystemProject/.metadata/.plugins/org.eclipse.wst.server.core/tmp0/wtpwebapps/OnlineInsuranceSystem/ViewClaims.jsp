<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*"%>
    <%@page import="com.manipal.model.*"%>
    <%@page import="com.manipal.service.*"%>
    <%@page import="com.manipal.service.impl.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #C0C0C0;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover:not(.active) {
    background-color: #008080;
}

.active {
    background-color: #008080;
}
</style>
</head>



<h1>Online Insurance System</h1>
<body>


<h3> TABLE</h3>

<table border="2px">
<tr>
<td>Claim ID </td>
<td> ClaimDate</td>

<td>PolicyHolderName</td>
<td>Policy Coverage</td>
<td>Policy Amount</td>
<td>Policy date</td>

</tr>


<%
ClaimsService view=new ClaimsServiceImpl();
List<ClaimsModel> list=view.viewAll1();
List<Policy> list1=view.viewAll();
int i=0;
System.out.println(list.size());
System.out.println(list1.size());
for(i=0;i<list.size();i++)
{
	
	%>
	<tr>
	<td><%=list.get(i).getClaimid() %></td>
	<td><%=list.get(i).getClaimdate() %></td>
	
	<td><%=list1.get(i).getPolicyHolderName() %></td>
	<td><%=list1.get(i).getCoverage()%></td>
	<td><%=list1.get(i).getAmount() %></td>
	<td><%=list1.get(i).getPolicyDate() %></td>
	
	</tr>
<% }%>


</table>
</body>
</html>
	
