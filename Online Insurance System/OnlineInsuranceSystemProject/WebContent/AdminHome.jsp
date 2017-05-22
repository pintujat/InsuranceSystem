<html>
<head>
<title>Admin Home Page</title>
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
<%--uncomment later for session check  <% 
if(session.getAttribute("admin_id")==null)
{
	response.sendRedirect("index.jsp");
}
%> --%> 

<h1>Online Insurance System</h1>

<%
if(session.getAttribute("admin_id")==null)
{
	response.sendRedirect("AdminLogin.jsp");
}
%>

<ul data-role="listview" id="listview-1">
			<li><a href="AdminHome.jsp">Home</a></li>
			<li><a href="ViewAgentUpdateDelete.jsp">Agents</a>
			<li><a href="ViewUserUpdateDelete.jsp">User Details</a></li>
			<li><a href="ViewInsuranceUpdateDelete.jsp">Insurance Details</a></li>
			<li><a href="ViewPolicyUpdateDelete.jsp">Policy Details</a></li>
			<li><a href="ViewClaims.jsp">ClaimDetails</a></li>
			<li><a href="ViewPaymentDetails.jsp">PaymentDetails</a></li>
			<!-- <li><a href="PolicyDetails.jsp">Policy Details</a></li>
			
			<li><a href="reg.jsp">Register Candidate</a></li>
			<li><a href="UserRegistration.jsp">Register Customer</a></li>
			<li><a href="course.jsp">Course</a></li>
			<li><a href="questions.jsp">Exam Questions</a></li>
			<li><a href="schedule.jsp">Schedule</a></li>
			<li><a href="report.jsp">Report</a></li> -->
			<li><a href="Home.jsp">Logout</a>
		</ul>
</body>
</html>