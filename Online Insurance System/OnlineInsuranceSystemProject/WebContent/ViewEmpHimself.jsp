<%@include file="header.jsp" %>
<%@page import="com.manipal.service.EmployeeService"%>
<%@page import="com.manipal.service.impl.EmployeeServiceImpl"%>
<%@page import="com.manipal.DAO.jdbc.JdbcEmployeeDAO"%>
<%@page import="com.manipal.DAO.EmployeeDAO"%>
<%@page import="java.util.*"%>
<%@page import="com.manipal.model.Employee"%>
<%@page import="com.manipal.controller.DeleteEmployeeController"%>
<div class="container">
<form>
<div class="form-group" style="max-width:1000px;">
<h2 align="center"><b> PERSONAL DETAILS </b></h2>
<hr>
    
              
      


<%
 
	 // String s=request.getParameter("employeeId");
	String s = "2";
	long employeeId = Long.parseLong(s);
	EmployeeService  employeeservice=new EmployeeServiceImpl();
	  List<Employee> employeeList=employeeservice.getEmployeeById(employeeId); 
	 
	  for(Employee employee : employeeList)
	  {
	  
	  if (employee.getIsActive().equals("TRUE")){
  %>
  
   <div class="form-group">
                    <label for="firstName">FIRST NAME</label> 
  <input type="text" class="form-control" name="firstName" value="<%= employee.getFirstName() %>" readonly/>
	 </div>
	 
	 
	<div class="form-group">
       <label for="middleName">MIDDLE NAME</label>   <input type="text" class="form-control"  name="middleName" value="<%= employee.getMiddleName() %>" readonly/>     
 
	 </div>
	 
	 
	<div class="form-group">
                    <label for="lastName">LAST NAME </label>    
  <input type="text" class="form-control"  name="lastName" value="<%= employee.getLastName() %>" readonly/>
	 </div>
	 


<div class="form-group">
                    <label for="email">EMAIL</label>
                    <input type="email" class="form-control" name="email" value="<%= employee.getEmail() %>" readonly/>
</div>

<div class="form-group">
                    <label for="dateOfBirth">DATE OF BIRTH </label>
                    <input type="text" class="form-control" name="dateOfBirth" value="<%= employeeservice.dateConvert(employee.getDateOfBirth()) %>" readonly/>
</div>

                 
<div class="form-group">
                    <label for="contact_no">Contact Number</label>
                    <input type="text"  name="mobileNumber"class="form-control" value="<%=employee.getMobileNumber() %>" readonly />
                      
</div>

<div class="form-group">
                    <label for="address">Address</label>
                    <input type="text" name="street" class="form-control" value="<%=employee.getAddress() %>" readonly/>
</div>

<div class="form-group">
                    <label for="city">City</label>
                    <input type="text" name="city" class="form-control" value="<%=employee.getCity() %>" readonly/>
</div>

<div class="form-group">
                    <label for="state">State</label>
                    <input type="text" name="state" class="form-control" value="<%=employee.getState() %>" readonly/>
</div>
<div class="form-group">
                    <label for="pincode">Pincode</label>
                    <input type="number" name="pincode" class="form-control" value="<%=employee.getPincode() %>" readonly/>
                      
</div>


<div class="form-group">
                    <label for="departmentId">Department Id</label>
                    <input type="text" name="departmentId" class="form-control" value="<%=employee.getDepartmentId() %>" readonly />
</div>



<div class="form-group">
                    <label for="roleId">Role Id</label>
                    <input type="text" name="roleId" class="form-control" value="<%=employee.getRoleId() %>" readonly/>
</div>




      <a class="btn btn-primary btn-circle" href="updateEmpHimself.jsp?employeeId=<%= employee.getEmployeeId() %>" data-toggle="tooltip" data-placement="bottom" title="Edit">
      		 <i class="glyphicon glyphicon-edit"></i></a>
     		 
   	<% }} 
%>
    
            
 
               
</div>
<!-- <script>
$(document).ready(function() {
    $('#example').DataTable();
} );
</script>  -->

</form>
</div>
<%@include file="footer.jsp" %>