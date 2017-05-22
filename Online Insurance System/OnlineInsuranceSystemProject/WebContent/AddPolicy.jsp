<html>
<head>
<style>
h1 {
 background-color: black;
color: white;
font-family: verdana;
    font-size: 300%;
  font-weight: 100;
  border-bottom: 1px solid hsla(100%, 100%, 100%, 0.3);
  margin: 0 0 0.1em 0;
  padding: 0 0 0.4em 0;
}
h3 {
 color:black;
  font-size: pxtoem(20, 16);
  margin: 1em 0 0.4em 0;
}

body
{
background: #e2dedb;
  color: #b3aca7;
}
       
      input[type=submit]{
 display: inline-block;
	color: black;
	background-color: white;
	text-transform: uppercase;
	letter-spacing: 2px;
	font-size: 12px;
	padding: 10px 30px;
	border-radius: 5px;
	border: 1px solid rgba(0,0,0,0.3);
	border-bottom-width: 3px;
 
}      input[type=reset]{
 display: inline-block;
	color: black;
	background-color: white;
	text-transform: uppercase;
	letter-spacing: 2px;
	font-size: 12px;
	padding: 10px 30px;
	border-radius: 5px;
	border: 1px solid rgba(0,0,0,0.3);
	border-bottom-width: 3px;
 
}
      input[type=button]{
 display: inline-block;
	color: black;
	background-color: white;
	text-transform: uppercase;
	letter-spacing: 2px;
	font-size: 12px;
	padding: 10px 30px;
	border-radius: 5px;
	border: 1px solid rgba(0,0,0,0.3);
	border-bottom-width: 3px;
 
}
form {
color:black;
  max-width: 100%;
  display: block;
  ul {
    margin: 0;
    padding: 0;
    li {
    color:black;
      margin: 0 0 0.25em 0; 
      clear: both;
      display: inline-block;
      width: 100%;
     
        p {
        color:black;
          margin: 0;
          padding: 0;
          float: left;
         
        }     
        .divider {
        color:black;
          margin: 0.5em 0 0.5em 0;
          border: 0;
          height: 1px;
          width: 100%;
          display: block;
          background-color: blue;
         
        }
}

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

  <div class="row header">
    <h3>Apply Policy &nbsp;</h3>
  
<form action="PolicyController" method="post">
<!-- 
Policy id:		    <input type="text" name="t1"  required=""></br></br>
 -->
Insurance id:	    <input type="number" name="t2" value="<%=request.getParameter("x") %>" required=""></br></br>

Policy holder name:	<input type="text" name="t3" required=""></br></br>

Coverage:		    <input type="number" name="t4" required=""></br></br>

Amount:			    <input type="number" name="t5" required=""></br></br>

Policy Date:		<input type="date" name="t6" required=""></br></br>

Agent id:		    <input type="number" name="t7" value="<%=request.getParameter("a") %>" required=""></br></br>

User id:		    <input type="number" name="t8" value="<%=request.getParameter("b") %>" required=""></br></br>
			
<input type="submit" value="add">
</form>
</pre>

</body>
</html>