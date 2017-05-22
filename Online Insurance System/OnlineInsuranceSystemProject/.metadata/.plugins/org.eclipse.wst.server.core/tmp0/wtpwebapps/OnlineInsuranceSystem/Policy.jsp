<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RenewPolicy</title>
</head>
<body>
<form action="RenewPolicyController" method="POST">
Enter new policy id: <input type="text" name="t1"> <br>
Enter old policy id: <input type="text" name="t2"> <br>
Enter claim date: <input type="text" name="t3"> <br>
<input type="submit" value="add claim"> 
<input type="reset" value="clear"> <br>

</form>
</body>
</html>