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
</head>
<body>

<table>
<tr>
<td>Insurance ID</td>
<td>Insurance Type</td>
<td>Description</td>
<td>Insurance Status</td>
</tr>
<%
	InsuranceViewService view=new InsuranceViewServiceImpl();
	List<InsuranceModel> list=view.getinsurance();
	for(InsuranceModel cal:list){
		%>
		<tr>
		<td><%=cal.getInsuranceid()%></td>
		<td><%=cal.getInsurancetype()%></td>
		<td><%=cal.getDescription()%></td>
		</tr>
	<%}
%>
</table>
</body>
</html>