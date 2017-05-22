<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insurance</title>
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
}
</style>
</head>
<body>
<h1>Online Insurance System</h1>


  <div class="row header">
    <h3>ADD INSURANCE &nbsp;</h3>
  
<form action="InsuranceInsertController" method="post">
 <ul>
        <!-- 
        <li>
          <p>
            <label for="t1">Enter Insurance Id:</label> &nbsp; &nbsp; &nbsp; 
            <input type="text" name="t1" required=""/>
          </p> 
          <hr>-->
          <p>
            <label for="t2">Enter Insurance Type:</label> &nbsp; &nbsp; &nbsp;
            <input type="text" name="t2" required=""/>      
          </p>
          <hr>
          <p>
            <label for="t3">Enter Description:</label> &nbsp;
            <input type="text" name="t3" required=""/>
          </p>
          <hr> 
        </li> 
       <input type="submit" value="Add Insurance"> &nbsp;
       <input type="reset" value="clear"> <br>
       </ul>

<input type="button" onclick="document.location.href='InsuranceUpdate.jsp'" value="Update Insurance"> &nbsp;
<input type="button" onclick="document.location.href='InsuranceDelete.jsp'" value="Delete Insurance"> &nbsp;
<input type="button" onclick="document.location.href='ViewInsurance.jsp'" value="View Insurance">


</form>
</div>

</body>
</html>