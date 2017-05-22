package com.manipal.service.impl;

import java.util.List;

import com.manipal.DAO.AgentDao;
import com.manipal.DAO.UserDao;
import com.manipal.DAO.jdbc.JdbcAgentDaoImpl;
import com.manipal.DAO.jdbc.JdbcUserDaoImpl;
import com.manipal.model.AgentModel;
import com.manipal.model.UserModel;
import com.manipal.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userdao=new JdbcUserDaoImpl();
	
	
	@Override
	public int AddUser( String name, String DOB, String gender,
			String panNo, Double salary, Long mobNo, String nationality,
			String password) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in service");
		UserModel user = new UserModel();
		System.out.println(user);


		//user.setUserId(userId);
		user.setName(name);
		user.setDOB(DOB);
		user.setGender(gender);
		user.setPanNo(panNo);
		user.setSalary(salary);
		user.setMobNo(mobNo);
		user.setNationality(nationality);
		user.setPassword(password);
		
		System.out.println("in user Service impl");
		
		System.out.println("user Dao obj"+userdao);
		return userdao.insertUser(user);
		
	}
	
	public List<UserModel> findAllUsers() {
		// TODO Auto-generated method stub
		UserDao userdao=new JdbcUserDaoImpl();
		List<UserModel> list = userdao.findAll();
		//System.out.println(list);
	    return list;
	}
	

	@Override
	public void UpdateUser(long userId, String name, String dob,String gender,
			String pan_no, double salary, long mob_no, String nat,
			String password) throws Exception {
		// TODO Auto-generated method stub
		UserModel user=new UserModel();
		user.setUserId(userId);
		user.setName(name);
		user.setDOB(dob);
		user.setGender(gender);
		user.setPanNo(pan_no);
		user.setSalary(salary);
		user.setMobNo(mob_no);
		user.setNationality(nat);
		user.setPassword(password);
		
		 userdao.update1(user);

	

	}
	
	@Override
	public List<UserModel> getUserById(long userId) {
		
		UserModel user = new UserModel();
		List<UserModel> users= null;
		try {
			UserDao userdao=new JdbcUserDaoImpl();
			users=userdao.getUserById(userId);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return users;
	}



}
