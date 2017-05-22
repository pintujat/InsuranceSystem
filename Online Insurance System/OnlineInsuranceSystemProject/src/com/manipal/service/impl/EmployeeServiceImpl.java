package com.manipal.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.manipal.DAO.EmployeeDAO;
import com.manipal.DAO.jdbc.JdbcEmployeeDAO;
import com.manipal.model.Employee;
import com.manipal.service.EmployeeService;


public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO empdao = new JdbcEmployeeDAO();
	
	public EmployeeServiceImpl()
	{}
	
	
		
		Employee emp = new Employee();

		@Override
		public int addEmployee(String firstName, String middleName,
				String lastName, String email, long mobileNumber,
				String dateOfBirth, String gender, String address, String city,
				String state, int pincode, Double salary, long departmentId,
				String username, String password, long roleId) throws Exception {
			

		System.out.println("In Service");
			
		emp.setFirstName(firstName);
		emp.setMiddleName(middleName);
		emp.setLastName(lastName);
		emp.setEmail(email);
		emp.setMobileNumber(mobileNumber);
		emp.setDateOfBirth(dateOfBirth);
		emp.setGender(gender);
		emp.setAddress(address);
		emp.setCity(city);
		emp.setState(state);
		emp.setPincode(pincode);
		emp.setSalary(salary);
		emp.setDepartmentId(departmentId);
		emp.setUsername(username);
		emp.setPassword(password);
		emp.setRoleId(roleId);
		
		
		
		return empdao.addemploy(emp);
	}

		@Override
		public List<Employee> getEmployees() {
			// TODO Auto-generated method stub
			
		     System.out.println("hellooo");
				empdao=new JdbcEmployeeDAO();
				List<Employee> employee= null;
				try {
					employee=empdao.getEmployees();
					System.out.println(employee);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				return employee;
			
		}
		
		
		@Override
		public String dateConvert(String input) {
				SimpleDateFormat sdfIn = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				SimpleDateFormat sdfOut = new SimpleDateFormat("yyyy-MM-dd");
		  		Date date = new Date();
				try {
					date = sdfIn.parse(input);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String d  = sdfOut.format(date);
				
				return d;
	
		}

		
			
			

		@Override
		public List<Employee> getEmployeeById(long employeeId) {
			
			Employee emp = new Employee();
			List<Employee> employees= null;
			try {
				employees=empdao.getEmployeeById(employeeId);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return employees;
		}

		@Override
		public int deleteEmployee(long employeeId) throws Exception {
			Employee emp = new Employee();
			emp.setEmployeeId(employeeId);
			return empdao.deleteEmployee(employeeId);
		}

		@Override
		public int updateEmployee(long employeeId, String firstName,String middleName, String lastName,
				String email, long mobileNumber, String address, String city,
				 String state, int pincode, long departmentId,
				 long roleId) {
Employee emp = new Employee();

			emp.setEmployeeId(employeeId);
			emp.setFirstName(firstName);
			emp.setMiddleName(middleName);
			emp.setLastName(lastName);
			emp.setEmail(email);
			emp.setMobileNumber(mobileNumber);
			//emp.setDateOfBirth(dateOfBirth);
			//emp.setGender(gender);
			emp.setAddress(address);
			emp.setCity(city);
			emp.setState(state);
			emp.setPincode(pincode);
			//emp.setSalary(salary);
			emp.setDepartmentId(departmentId);
			//emp.setUsername(username);
			//emp.setPassword(password);
			emp.setRoleId(roleId);
			
			return empdao.updateEmployee(emp);
		}

		@Override
		public int updateEmpHimself(long employeeId, String firstName,
				String middleName, String lastName, long mobileNumber,
				String address, String city, String state, int pincode) {
			Employee emp = new Employee();

			emp.setEmployeeId(employeeId);
			emp.setFirstName(firstName);
			emp.setMiddleName(middleName);
			emp.setLastName(lastName);
			//emp.setEmail(email);
			emp.setMobileNumber(mobileNumber);
			//emp.setDateOfBirth(dateOfBirth);
			//emp.setGender(gender);
			emp.setAddress(address);
			emp.setCity(city);
			emp.setState(state);
			emp.setPincode(pincode);
			//emp.setSalary(salary);
			//emp.setDepartmentId(departmentId);
			//emp.setUsername(username);
			//emp.setPassword(password);
			//emp.setRoleId(roleId);
			
			return empdao.updateEmployee(emp);
		}
		}
