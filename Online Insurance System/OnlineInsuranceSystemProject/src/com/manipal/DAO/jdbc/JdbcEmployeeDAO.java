package com.manipal.DAO.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.manipal.DAO.EmployeeDAO;
import com.manipal.model.Employee;

public class JdbcEmployeeDAO implements EmployeeDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(JdbcEmployeeDAO.class);
	
	List<Employee> employees = new ArrayList<Employee>();
	
	
	@Override
	public int addemploy(Employee emp) {

		Connection con = null;
		
		PreparedStatement stmt = null;
		
		int cnt = 0;
		
		System.out.println("In DAO");
				
		try {
			con = ConnectionHelper.getMySqlConnection();
			System.out.println("con created");
			
			System.out.println(emp);
			
			String query = "insert into employees values (seq_emp.nextval,?,?,?,?,?,to_date(?,'YYYY-MM-DD'),?,?,?,?,?,?,null,?,?,null,'TRUE')";
			
			stmt = con.prepareStatement(query);
			System.out.println("stmt created");
			
			stmt.setString(1, emp.getFirstName());
			System.out.println("1");
			stmt.setString(2, emp.getMiddleName());
			System.out.println("2");
			stmt.setString(3, emp.getLastName());			
			stmt.setString(4, emp.getEmail());
			stmt.setLong(5, emp.getMobileNumber());
			System.out.println("5");
			stmt.setString(6, emp.getDateOfBirth());
			System.out.println("6");
			stmt.setString(7, emp.getGender());
			stmt.setString(8, emp.getAddress());
			stmt.setString(9, emp.getCity());
			stmt.setString(10, emp.getState());
			stmt.setInt(11, emp.getPincode());
			stmt.setDouble(12, emp.getSalary());
			System.out.println("7");
			//stmt.setLong(13, emp.getDepartmentId());
			stmt.setString(13, emp.getUsername());
			stmt.setString(14, emp.getPassword());
		//	stmt.setLong(16, emp.getRoleId());
			System.out.println("16");
			
			cnt=stmt.executeUpdate();
			System.out.println("exe  update");
			
			con.commit();
			con.close();
	}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("In DAO exception");
		}
		System.out.println(cnt);
		return cnt;
		
		}

	//@Override
	public List<Employee> getEmployees() {
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet result =null;
		
		try {
			con = ConnectionHelper.getMySqlConnection();
			System.out.println(con);
			String query="select * from employees";
			stmt=con.prepareStatement(query);
			System.out.println(stmt);
			System.out.println("hiiiii");
	result = stmt.executeQuery(); 
			
	Employee emp;
	
	while(result.next())
	{
		
		emp =new Employee();
		emp.setEmployeeId(result.getLong(1));
		emp.setFirstName(result.getString(2));
		emp.setMiddleName(result.getString(3));
		emp.setLastName(result.getString(4));
		emp.setEmail(result.getString(5));
		emp.setMobileNumber(result.getLong(6));
		emp.setDateOfBirth(result.getString(7));
		emp.setGender(result.getString(8));
		emp.setAddress(result.getString(9));
		emp.setCity(result.getString(10));
		emp.setState(result.getString(11));
		emp.setPincode(result.getInt(12));
		emp.setSalary(result.getDouble(13));
		emp.setDepartmentId(result.getLong(14));
		emp.setUsername(result.getString(15));
		emp.setPassword(result.getString(16));
		emp.setRoleId(result.getLong(17));
		emp.setIsActive(result.getString(18));
		
		employees.add(emp);
		System.out.println(emp);
		System.out.println(employees);
		
	}
	con.close();
		}
		
		catch (Exception e)
		{
			System.out.println("in catch");
			//throw new RuntimeException(e.getMessage());	
		}
		return employees;
		
	}

	@Override
	public int updateEmployee(Employee emp) {

		Connection con = null;
		PreparedStatement stmt = null;
		
		int cnt = 0;
		System.out.println("In DAO");
				
		try {
			con = ConnectionHelper.getMySqlConnection();
			System.out.println("con created");
			
			System.out.println(emp);
			
			String query = "update  employees set firstName=?, middleName=?,lastName=?,"
											+" emailId=?,  phoneNumber=?," 
											+"address =?, city=?,  state=?,  pincode=?,"
											+" departmentId=null,"
											+" roleId=null  "
											+"where employeeId=?";
			stmt = con.prepareStatement(query);
			System.out.println("stmt created");
			
			stmt.setLong(10, emp.getEmployeeId());
			stmt.setString(1, emp.getFirstName());
			System.out.println("1");
			stmt.setString(2, emp.getMiddleName());
			System.out.println("2");
			stmt.setString(3, emp.getLastName());			
			stmt.setString(4, emp.getEmail());
			stmt.setLong(5, emp.getMobileNumber());
			System.out.println("5");
			//stmt.setString(6, emp.getDateOfBirth());
			System.out.println("6");
			//stmt.setString(7, emp.getGender());
			stmt.setString(6, emp.getAddress());
			stmt.setString(7, emp.getCity());
			stmt.setString(8, emp.getState());
			stmt.setInt(9, emp.getPincode());
			//stmt.setDouble(10, emp.getSalary());
			System.out.println("7");
			//stmt.setLong(10, emp.getDepartmentId());
			//stmt.setString(11, emp.getUsername());
			//stmt.setString(12, emp.getPassword());
			//stmt.setLong(11, emp.getRoleId());
			System.out.println("16");
			
			cnt=stmt.executeUpdate();
			System.out.println("exe  update");
			
			con.commit();
			con.close();
	}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("In DAO exception");
		}
		System.out.println(cnt);
		return cnt;
		
		}

	public int deleteEmployee(long employeeId) throws Exception{
		
		Connection con = null;
		PreparedStatement stmt = null;
		
		int row=0;
		
		con = ConnectionHelper.getMySqlConnection();
        String sql = "UPDATE employees SET isActive='FALSE' WHERE employeeId = ?";
   
         stmt= con.prepareStatement(sql);
        stmt.setLong(1, employeeId);
     row= stmt.executeUpdate();
         con.commit();
        stmt.close();
       
        return row;     
	
	}

	

	@Override
	public int updateEmpHimself(Employee emp) {

		Connection con = null;
		PreparedStatement stmt = null;
		
		int cnt = 0;
		System.out.println("In DAO");
				
		try {
			con = ConnectionHelper.getMySqlConnection();
			System.out.println("con created");
			
			System.out.println(emp);
			
			String query = "update  employees set firstName=?, middleName=?,lastName=?,"
											+" phoneNumber=?," 
											+"address =?, city=?,  state=?,  pincode=?,"
											+"where employeeId=?";
			stmt = con.prepareStatement(query);
			System.out.println("stmt created");
			
			stmt.setLong(10, emp.getEmployeeId());
			stmt.setString(1, emp.getFirstName());
			System.out.println("1");
			stmt.setString(2, emp.getMiddleName());
			System.out.println("2");
			stmt.setString(3, emp.getLastName());			
			//stmt.setString(4, emp.getEmail());
			stmt.setLong(4, emp.getMobileNumber());
			System.out.println("5");
			//stmt.setString(6, emp.getDateOfBirth());
			System.out.println("6");
			//stmt.setString(7, emp.getGender());
			stmt.setString(5, emp.getAddress());
			stmt.setString(6, emp.getCity());
			stmt.setString(7, emp.getState());
			stmt.setInt(8, emp.getPincode());
			//stmt.setDouble(10, emp.getSalary());
			System.out.println("7");
			//stmt.setLong(10, emp.getDepartmentId());
			//stmt.setString(11, emp.getUsername());
			//stmt.setString(12, emp.getPassword());
			//stmt.setLong(11, emp.getRoleId());
			System.out.println("16");
			
			cnt=stmt.executeUpdate();
			System.out.println("exe  update");
			
			con.commit();
			con.close();
	}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("In DAO exception");
		}
		System.out.println(cnt);
		return cnt;
	}

	@Override
	public List<Employee> getEmployeeById(long employeeId) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet result =null;
		
		try {
			con = ConnectionHelper.getMySqlConnection();
			System.out.println(con);
			String query="select * from employees where employeeId = " + employeeId;
			stmt=con.prepareStatement(query);
			System.out.println(stmt);
			System.out.println("hiiiii");
	result = stmt.executeQuery(); 
			
	Employee emp;
	
	while(result.next())
	{
		
		emp =new Employee();
		emp.setEmployeeId(result.getLong(1));
		emp.setFirstName(result.getString(2));
		emp.setMiddleName(result.getString(3));
		emp.setLastName(result.getString(4));
		emp.setEmail(result.getString(5));
		emp.setMobileNumber(result.getLong(6));
		emp.setDateOfBirth(result.getString(7));
		emp.setGender(result.getString(8));
		emp.setAddress(result.getString(9));
		emp.setCity(result.getString(10));
		emp.setState(result.getString(11));
		emp.setPincode(result.getInt(12));
		emp.setSalary(result.getDouble(13));
		emp.setDepartmentId(result.getLong(14));
		emp.setUsername(result.getString(15));
		emp.setPassword(result.getString(16));
		emp.setRoleId(result.getLong(17));
		emp.setIsActive(result.getString(18));
		
		employees.add(emp);
		System.out.println(emp);
		System.out.println(employees);
		
	}
	con.close();
		}
		
		catch (Exception e)
		{
			System.out.println("in catch");
			//throw new RuntimeException(e.getMessage());	
		}
		return employees;
		
	}
}

	

