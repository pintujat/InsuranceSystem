<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<body>
<ul data-role="listview" id="listview-1">
			<li><a href="AdminHome.jsp">Home</a></li>
			<li><a href="ViewAgent.jsp">Agents</a>
			<li><a href="UserDetails.jsp">User Details</a></li>
			<li><a href="ViewInsurance.jsp">Insurance Details</a></li>
			<li><a href="ViewPolicyAdmin.jsp">Policy Details</a></li>
			
			<!-- <li><a href="PolicyDetails.jsp">Policy Details</a></li>
			
			<li><a href="reg.jsp">Register Candidate</a></li>
			<li><a href="UserRegistration.jsp">Register Customer</a></li>
			<li><a href="course.jsp">Course</a></li>
			<li><a href="questions.jsp">Exam Questions</a></li>
			<li><a href="schedule.jsp">Schedule</a></li>
			<li><a href="report.jsp">Report</a></li> -->
			<li><a href="Home.jsp">Logout</a>
		</ul>
<%-- <% long id=Long.parseLong(request.getParameter("x")); %> --%>
<form method="post" action="PolicyDeleteController">
Enter policy id : <input type="text" name="t1" value="<%= request.getParameter("x")%>">
<input type="submit" value="delete">


</form>
</body>
</html>