<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lgin Page</title>
  <meta charset="UTF-8">
  <title>Flat UI Login</title>
  <style>
  .box{
  position:absolute;
  height:100%;
  width:100%;
  font-family:Helvetica;
  color:#fff;
  background:rgba(0,0,0,0.13);
  padding:30px 0px;
}
.box h1{
  text-align:center;
  margin:30px 0;
  font-size:30px;
}
.box input{
  display:block;
  width:300px;
  margin:20px auto;
  padding:15px;
  background:rgba(0,0,0,0.2);
  color:#fff;
  border:0;
}
.box input:focus,.box input:active,.box button:focus,.box button:active{
  outline:none;
}
.box button{
  background:#742ECC;
  border:0;
  color:#fff;
  padding:10px;
  font-size:20px;
  width:330px;
  margin:20px auto;
  display:block;
  cursor:pointer;
}
.box button:active{
  background:#27ae60;
}
.box p{
  font-size:14px;
  text-align:center;
}
.box p span{
  cursor:pointer;
  color:#666;
}
  </style>
<link rel="stylesheet" href="css/style.css">
</head>
<body>



<body>
  <div id="wrap">
  <div id="regbar">
    <div id="navthing">
      <h2><a href="UsersLogin.jsp" id="loginform">Login</a> | <a href="AgentRegistration.jsp">Register</a></h2>
    <div class="login">
      <div class="arrow-up"></div>
      <div class="formholder">
        <div class="randompad">
          <div class="vid-container">
<form method="POST" action="adminhome.jsp">
    <div class="box">
      <h1>Customer Login</h1>
      <input type="text"  name="t1" placeholder="Customer ID" required=""/>
      <input type="text" name="t2" placeholder="Password" required=""/>
      <button>Login</button>
     </form>
    </div>
  </div>
</div>


        </div>
      </div>
    </div>
    </div>
  </div>
</div>
</body>
</html>