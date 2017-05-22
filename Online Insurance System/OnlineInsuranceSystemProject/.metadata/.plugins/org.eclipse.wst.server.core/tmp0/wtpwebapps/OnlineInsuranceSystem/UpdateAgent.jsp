

<%@ page import="com.manipal.DAO.*,com.manipal.DAO.jdbc.*,java.util.List,com.manipal.model.*" %>
<%@ page import="com.manipal.service.impl.*,com.manipal.service.*" %>
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
<form method="POST" action="UpdateAgentController">

		<% AgentService c=new AgentServiceImpl();
		AgentModel a=new AgentModel(); %>
Agent Id  <input type="number" name="can_id" value="<%= request.getParameter("x") %>"/>
Name:      <input type="text" name="t2" required=""><br>
DOB:       <input type="date" name="t3" required="" ><br>
<label>Gender</label><br>
			Male:<input name="gen" type="radio" value="Male" required=""/>
			Female:<input name="gen" type="radio" value="Female" />
			Other:<input name="gen" type="radio"value="Other" /><br>
PanNo:     <input type="text" name="t5" required=""><br>
Salary:    <input type="number" name="t6" required="" ><br>
MobNo:     <input type="number" name="t7" required=""><br>
Nationality: <input type="text" name="t8" required=""><br>
Password:    <input type="password" name="t9" maxlength="20" required=""><br>
			
			
			

			<input data-enhanced="true" type="submit" value="Update" id="button-1"/>
		
			<input data-enhanced="true" type="reset" value="Clear" id="button-2"/>
	</form>
	</div>

</body>
</html>