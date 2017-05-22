<html>
<head>
<style>
input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
input[type=date], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
input[type=number], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
input[type=email], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}


input[type=submit] {
    width: 100%;
    background-color: #0000FF;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}
input[type=reset] {
    width: 100%;
    background-color: #FF0000;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}
input[type=reset]:hover {
    background-color: #45a049;
}

div {
    border-radius: 5px;
    background-color: 	#C0C0C0;
    padding: 20px;
}
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #800000;
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
    background-color: #111;
}

.active {
    background-color: #4CAF50;
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

<ul data-role="listview" id="listview-1">
<ul data-role="listview" id="listview-1">
			<li><a href="AgentHome.jsp">Home</a></li>
			<li><a href="ViewAgentById.jsp">My Profile</a>
			<li><a href="UserRegistration.jsp">Register Customer</a></li>
			<li><a href="ViewInsurance.jsp">Insurance Details</a></li>
			<li><a href="ViewPolicyAgentUser.jsp">Policy Details</a></li>
			<li><a href="ViewUser.jsp">Users</a></li>
			<li><a href="Home.jsp">Logout</a>
		</ul>
		</ul>

<h1>New User Registration</h1>
<ul data-role="listview" id="listview-1">
			
			<li><a href="reg.jsp">Register User</a></li>
			
		</ul>
		<div>
<form method="POST" action="UserController">
		<!-- 	<label for="text-1">Enter User ID</label>
			<input name="can_id" id="text-1" data-clear-btn="true" value="" placeholder="Enter CandidateID" maxlength="20" type="number" required=""/>
		 -->
		<label for="text-3">Enter User Name</label>
			<input name="can_name" id="text-3" data-clear-btn="true" value="" placeholder="Enter Name" maxlength="20" type="text" required pattern="[a-zA-Z][a-zA-Z\s]*" title="Please enter valid name"/>
		
		<label for="date-1">Select Date of Birth</label> <!-- DOB to be validated -->
			<input name="can_dob" id="date-1" data-clear-btn="true" value="" type="date" required/>
		
		
			<label>Gender</label><br>
			Male:<input name="gen" type="radio" value="Male" required=""/>
			Female:<input name="gen" type="radio" value="Female" required=""/>
			Other:<input name="gen" type="radio"value="Other" required=""/>
			<br><br><br>
			
				<label for="text-3">Enter Pan No</label>
			<input name="can_panNo" id="text-3" data-clear-btn="true" value="" placeholder="Enter Pan No." maxlength="12" type="text" required="" title="Please enter valid pan no"/>
		
				
		<label for="text-3">Enter Salary</label>
			<input name="can_sal" id="text-3" data-clear-btn="true" value="" placeholder="Enter Name" maxlength="20" type="text" required=""/>
		
			
			<label for="text-5">Enter Mobile No.</label>
			<input name="can_mob_no" id="text-5" data-clear-btn="true" value="" placeholder="Enter Mobile No." maxlength="10" type="number" required pattern="[0-9]{10}" title="Plese enter valid no"/>


	
			<label>Nationality</label><br>
			Indian:<input name="Ind" type="radio" value="Indian" required=""/>
			Other:<input name="Ind" type="radio" value="Other" required=""/><br>
		
				
			<label for="text-2">Enter User Password</label>
			<input name="can_pwd" id="text-2" data-clear-btn="true" value="" placeholder="Enter Password" maxlength="8" type="password" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{4}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 4 or more characters"/>
		
		<!-- <label for="email-1">Enter User Email ID</label>
			<input name="can_eid" id="email-1" data-clear-btn="true" value="" placeholder="Enter email id" maxlength="30" type="email"/>
			
			<label for="text-4">Enter Address</label>
			<input name="can_addr" id="text-4" data-clear-btn="true" value="" placeholder="Enter Address" type="text"/>
			
		 -->	
			
		
		
			<input data-enhanced="true" type="submit" value="Submit" id="button-1"/>
		
			<input data-enhanced="true" type="reset" value="Clear" id="button-2"/>
	</form>
	</div>
	
	<div>
	
	</div>
</body>
</html>
