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
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}
input[type=reset] {
    width: 100%;
    background-color: #4CAF50;
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
    background-color: #f2f2f2;
    padding: 20px;
}
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
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
<h1>Online Test</h1>
<ul data-role="listview" id="listview-1">
			<li><a href="adminhome.jsp">Home</a></li>
			<li><a href="reg.jsp">Register Candidate</a></li>
			<li><a href="course.jsp">Course</a></li>
			<li><a href="questions.jsp">Exam Questions</a></li>
			<li><a href="schedule.jsp">Schedule</a></li>
			<li><a href="report.jsp">Report</a></li>
			<li><a href="adminlogin.jsp">Logout</a>
		</ul>
		<div>
<form method="POST" action="CandidateRegistrationServlet">
			<label for="text-1">Enter Candidate ID</label>
			<input name="can_id" id="text-1" data-clear-btn="true" value="" placeholder="Enter CandidateID" maxlength="20" type="number"/>
		
			<label for="text-2">Enter Candidate Password</label>
			<input name="can_pwd" id="text-2" data-clear-btn="true" value="" placeholder="Enter Password" maxlength="8" type="text"/>
		
			<label for="text-3">Enter Candidate Name</label>
			<input name="can_name" id="text-3" data-clear-btn="true" value="" placeholder="Enter Name" maxlength="20" type="text"/>
		
			<label for="email-1">Enter Candidate Email ID</label>
			<input name="can_eid" id="email-1" data-clear-btn="true" value="" placeholder="Enter email id" maxlength="30" type="email"/>
			
			<label for="text-4">Enter Address</label>
			<input name="can_addr" id="text-4" data-clear-btn="true" value="" placeholder="Enter Address" type="text"/>
			
			<label for="date-1">Select Date of Birth</label> <!-- DOB to be validated -->
			<input name="can_dob" id="date-1" data-clear-btn="true" value="" type="date"/>
		
			<label for="text-5">Enter Phone No.</label>
			<input name="can_ph_no" id="text-5" data-clear-btn="true" value="" placeholder="Enter Phone No." maxlength="10" type="number"/>
			
			<label>Gender</label><br>
			Male:<input name="gen" type="radio" value="Male"/>
			Female:<input name="gen" type="radio" value="Female"/>
			Other:<input name="gen" type="radio"value="Other"/>
			
		
			<input data-enhanced="true" type="submit" value="Add" id="button-1"/>
		
			<input data-enhanced="true" type="reset" value="Clear" id="button-2"/>
	</form>
	</div>
	
	<div>
	<form method="POST" action="CandidateRegistrationServlet">
			<label for="select-1">Select Candidate ID</label>
		<select name="select-1" id="select-1">
			<option value="A">101</option>
			<option value="B">103</option>
			<option value="C">107</option>
		</select>
		
			<label for="text-2">Enter Candidate Password</label>
			<input name="can_pwd" id="text-2" data-clear-btn="true" value="" placeholder="Enter Password" maxlength="8" type="text"/>
		
			<label for="text-3">Enter Candidate Name</label>
			<input name="can_name" id="text-3" data-clear-btn="true" value="" placeholder="Enter Name" maxlength="20" type="text"/>
		
			<label for="email-1">Enter Candidate Email ID</label>
			<input name="can_eid" id="email-1" data-clear-btn="true" value="" placeholder="Enter email id" maxlength="30" type="email"/>
			
			<label for="text-4">Enter Address</label>
			<input name="can_addr" id="text-4" data-clear-btn="true" value="" placeholder="Enter Address" type="text"/>
			
			<label for="date-1">Select Date of Birth</label> <!-- DOB to be validated -->
			<input name="can_dob" id="date-1" data-clear-btn="true" value="" type="date"/>
		
			<label for="text-5">Enter Phone No.</label>
			<input name="can_ph_no" id="text-5" data-clear-btn="true" value="" placeholder="Enter Phone No." maxlength="10" type="number"/>
			
			<label>Gender</label><br>
			Male:<input name="gen" type="radio" value="Male"/>
			Female:<input name="gen" type="radio" value="Female"/>
			Other:<input name="gen" type="radio"value="Other"/>
			
		
			<input data-enhanced="true" type="submit" value="Update" id="button-1"/>
		
			<input data-enhanced="true" type="reset" value="Clear" id="button-2"/>
	</form>
	</div>
	
	<div>
	<form>
		<label for="select-1">Select Candidate ID</label>
		<select name="select-1" id="select-1">
			<option value="A">103</option>
			<option value="B">105</option>
			<option value="C">106</option>
		</select>
	
	 	<input data-enhanced="true" type="submit" value="Delete" id="button-1"/>
		
	</form>
	
	</div>
</body>
</html>
