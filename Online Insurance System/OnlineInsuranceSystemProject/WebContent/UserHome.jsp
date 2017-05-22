<html>
<head>
<title>User Home Page</title>
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


<h1>Online Insurance System</h1>

<%
if(session.getAttribute("User_id")==null)
{
	response.sendRedirect("UsersLogin.jsp");
}
%>
<ul data-role="listview" id="listview-1">
			<li><a href="UserHome.jsp">Home</a></li>
			<li><a href="ViewUserById.jsp">My Profile</a>
			
			
			<li><a href="ViewInsurance.jsp">Insurance Details</a></li>
			<li><a href="ViewPolicyAgentUser.jsp">Policy Details</a></li>

			<li><a href="Home.jsp">Logout</a>
		</ul>
</body>
</html>