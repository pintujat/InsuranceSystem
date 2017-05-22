<html>
<head>
<title>update claim</title>
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

 background-color: black;
color: white;
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
}

</style>
</head>
<body>


<div class="container">
  <div class="row header">
    <h1>UPDATE CLAIM &nbsp;</h1>
    <h3>Fill out to update claim</h3>
  </div>
  <div class="row body">
    <form method="post" action="ClaimsUpdateController">
      <ul>
        
        <li>
          <p class="left">
            <label for="t1">Enter Claim Id:</label>
            <input type="text" name="t1" required=""readonly="readonly"/>
          </p>
          <hr>
          <p class="pull-right">
            <label for="t2">Enter Policy Id:</label>
            <input type="text" name="t2" required=""/>      
          </p>
          <hr>
          <p>
            <label for="t3">Enter Claim Date:</label>
            <input type="text" name="t3" required=""/>
          </p>
          <hr> 
        </li> 
       <input type="submit" value="Update Claim">
       </ul>
    </form>  
  </div>
  </div>
</body>
</html>
