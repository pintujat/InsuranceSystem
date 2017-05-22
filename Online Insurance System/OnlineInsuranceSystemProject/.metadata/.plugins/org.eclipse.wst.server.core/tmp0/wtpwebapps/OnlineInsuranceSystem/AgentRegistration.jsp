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
<h1>New Registration</h1>
<ul data-role="listview" id="listview-1">
			
			<li><a href="reg.jsp">Register Agent</a></li>
			
		</ul>
		<div>
<form method="POST" action="AgentController">
			<label for="text-1">Enter Agent ID</label>
			<input name="agent_id" id="text-1" data-clear-btn="true" value="" placeholder="Enter CandidateID" maxlength="20" type="number"/>
		
			<label for="text-3">Enter Agent Name</label>
			<input name="agent_name" id="text-3" data-clear-btn="true" value="" placeholder="Enter Name" maxlength="20" type="text"/>
		
		    <label for="date-1">Select Date of Birth</label> <!-- DOB to be validated -->
			<input name="agent_dob" id="date-1" data-clear-btn="true" value="" type="date"/>
			
			
				<label>Gender</label><br>
			Male:<input name="gen" type="radio" value="Male"/>
			Female:<input name="gen" type="radio" value="Female"/>
			Other:<input name="gen" type="radio"value="Other"/>
			<br><br><br>
			
			<label for="text-3">Enter Pan No</label>
			<input name="agent_panno" id="text-3" data-clear-btn="true" value="" placeholder="Enter Pan No." maxlength="20" type="text"/>
		
			<label for="text-3">Enter Salary</label>
			<input name="agent_salary" id="text-3" data-clear-btn="true" value="" placeholder="Enter Name" maxlength="20" type="text"/>
		
		
			<label for="text-5">Enter Mobile No.</label>
			<input name="agent_mob_no" id="text-5" data-clear-btn="true" value="" placeholder="Enter Phone No." maxlength="10" type="number"/>
			
			
			
		
		
			<label>Nationality</label><br>
			Indian:<input name="Ind" type="radio" value="Indian"/>
			Other:<input name="Ind" type="radio" value="Other"/><br>
		
			
			<!-- <label for="email-1">Enter Agent Email ID</label>
			<input name="agent_eid" id="email-1" data-clear-btn="true" value="" placeholder="Enter email id" maxlength="30" type="email"/>
			 -->
			<!-- <label for="text-4">Enter Address</label>
			<input name="agent_addr" id="text-4" data-clear-btn="true" value="" placeholder="Enter Address" type="text"/>
			 -->
			
			<label for="text-2">Enter Agent Password</label>
			<input name="agent_pwd" id="text-2" data-clear-btn="true" value="" placeholder="Enter Password" maxlength="8" type="password"/>
		
			
		
		
			
			<input data-enhanced="true" type="submit" value="Submit" id="button-1"/>
		
			<input data-enhanced="true" type="reset" value="Clear" id="button-2"/>
	</form>
	</div>
	
	<div>
	
	</div>
</body>
</html>
