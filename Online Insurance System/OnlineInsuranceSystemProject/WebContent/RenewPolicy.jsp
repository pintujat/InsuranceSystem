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
<!-- 

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
    <h3>Renew Policy &nbsp;</h3>
  
    <form method="post" action="RenewPolicyController">
 <ul>
        <!-- 
        <li>
          <p>
            <label for="t1">Enter Claim Id:</label> &nbsp; &nbsp; &nbsp; 
            <input type="text" name="t1" required=""/>
          </p>
           -->
          <hr>
          <p>
            <label for="t2">Enter Old Policy Id:</label> &nbsp; &nbsp; &nbsp;
            <input type="text" name="t2" value="<%= request.getParameter("x") %>" required="" readonly="readonly"/>      
          </p>
          <hr>
          <p>
            <label for="t3">Enter Renew Date:</label> &nbsp;
            <input type="text" name="t3" value="20-04-2017" required=""readonly="readonly"/>
          </p>
          <hr> 
        </li> 
       <input type="button" onclick="document.location.href='UpdatePolicy.jsp'" value="Renew Policy"> &nbsp;
      <!--  <input type="reset" value="clear"> <br> -->
       </ul>
<!-- 
<input type="button" onclick="document.location.href='ClaimsUpdate.jsp'" value="Update Claim"> &nbsp;
<input type="button" onclick="document.location.href='ClaimsDelete.jsp'" value="Delete Claim"> &nbsp;
<input type="button" onclick="document.location.href='ViewClaims.jsp'" value="View Claim"> -->


</form>
</div>



</body>
</html>
