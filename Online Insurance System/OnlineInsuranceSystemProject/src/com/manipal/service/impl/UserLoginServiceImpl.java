package com.manipal.service.impl;


import com.manipal.DAO.UserLoginDao;
import com.manipal.DAO.jdbc.JdbcUserLoginDao;
import com.manipal.service.UserLoginService;

public class UserLoginServiceImpl implements UserLoginService {

		UserLoginDao userlogindao;
	public UserLoginServiceImpl()
	{
		userlogindao=new JdbcUserLoginDao();
	}
	@Override
	public int UserLoginValidate(int username, String password) {

		
		return userlogindao.userValid(username,password);
	}
	
}
