<%@page import="com.manipal.service.impl.*"%>
<%@page import="com.manipal.model.*"%>
<%@page import="java.util.*"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Agent Profile Page</title>
<style>
h1
{
background-color: black;
color: white;
font-family: verdana;
    font-size: 300%;
  font-weight: 100;
  border-bottom: 1px solid hsla(100%, 100%, 100%, 0.3);
  margin: 0 0 0.1em 0;
  padding: 0 0 0.4em 0;
}
body {
background: #e2dedb;
  color: #b3aca7;
  
  font-family: "Roboto", helvetica, arial, sans-serif;
  font-size: 16px;
  font-weight: 400;
  text-rendering: optimizeLegibility;
}

div.table-title {
   display: block;
  margin: auto;
  max-width: 600px;
  padding:5px;
  width: 100%;
}

.table-title h3 {
   color: orange;
   font-size: 30px;
   font-weight: 400;
   font-style:normal;
   font-family: "Roboto", helvetica, arial, sans-serif;
   text-shadow: -1px -1px 1px rgba(0, 0, 0, 0.1);
   text-transform:uppercase;
}


/*** Table Styles **/

.table-fill {
  background: white;
  border-radius:3px;
  border-collapse: collapse;
  height: 320px;
  margin: auto;
  max-width: 600px;
  padding:5px;
  width: 100%;
  box-shadow: 0 5px 10px rgba(0, 0, 0, 0.1);
  animation: float 5s infinite;
}
 
th {
  color:orange;
  background:#1b1e24;
  border-bottom:4px solid #9ea7af;
  border-right: 1px solid #343a45;
  font-size:23px;
  font-weight: 100;
  padding:24px;
  text-align:left;
  text-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
  vertical-align:middle;
}

th:first-child {
  border-top-left-radius:3px;
}
 
th:last-child {
  border-top-right-radius:3px;
  border-right:none;
}
  
tr {
  border-top: 1px solid #C1C3D1;
  border-bottom-: 1px solid #C1C3D1;
  color:black;
  font-size:16px;
  font-weight:normal;
  text-shadow: 0 1px 1px rgba(256, 256, 256, 0.1);
}
 
tr:hover td {
  background:#4E5066;
  color:#FFFFFF;
  border-top: 1px solid #22262e;
  border-bottom: 1px solid #22262e;
}
 
tr:first-child {
  border-top:none;
}

tr:last-child {
  border-bottom:none;
}
 
tr:nth-child(odd) td {
  background:#EBEBEB;
}
 
tr:nth-child(odd):hover td {
  background:#4E5066;
}

tr:last-child td:first-child {
  border-bottom-left-radius:3px;
}
 
tr:last-child td:last-child {
  border-bottom-right-radius:3px;
}
 
td {
  background:white;
  padding:20px;
  text-align:left;
  vertical-align:middle;
  font-weight:300;
  font-size:18px;
  text-shadow: -1px -1px 1px rgba(0, 0, 0, 0.1);
  border-right: 1px solid #C1C3D1;
}

td:last-child {
  border-right: 0px;
}

th.text-left {
  text-align: left;
}

th.text-center {
  text-align: center;
}

th.text-right {
  text-align: right;
}

td.text-left {
  text-align: left;
}

td.text-center {
  text-align: center;
}

td.text-right {
  text-align: right;
}
</style>

<h1>Online Insurance System</h1>

<table border=2px >

         <marquee><b>Agent TABLE INFORMATION</b></marquee><br><br>
         <% 
         AgentServiceImpl c =new AgentServiceImpl();
         List<AgentModel> get= c.viewDetails();
        for(AgentModel re:get)
        {
        	
        	out.println("<tr>");
    		out.println("<td>");
    		out.println(re.getAgentId());
    		out.println("</td>");
    		out.println("<td>");
    		out.println(re.getName());
    		out.println("</td>");
    		out.println("<td>");
    		out.println(re.getDOB());
    		out.println("</td>");
    		out.println("<td>");
    		out.println(re.getGender());
    		out.println("</td>");
    		out.println("<td>");
    		out.println(re.getPanNo());
    		out.println("</td>");
    		out.println("<td>");
    		out.println(re.getSalary());
    		out.println("</td>");
    		out.println("<td>");
    		out.println(re.getMobNo());
    		out.println("</td>");
    		out.println("<td>");
    		out.println(re.getNationality());
    		out.println("</td>");
    		out.println("</tr>");
    		
    		

    		
    		
        } 
        
       
     %>
</table>
<form action="UpdateAgentController" method="post">

<input type="submit" value="update My Deatils">

</form>       
</body>
</html>