package com.manipal.service.impl;

import com.manipal.DAO.AdminLoginDao;
import com.manipal.DAO.jdbc.JdbcAdminLoginDao;
import com.manipal.service.AdminLoginService;

public class AdminLoginServiceImpl implements AdminLoginService {

		AdminLoginDao adminlogindao;
	public AdminLoginServiceImpl()
	{
		adminlogindao=new JdbcAdminLoginDao();
	}
	@Override
	public int AdminLoginValidate(int username, String password) {

		
		return adminlogindao.adminValid(username,password);
	}
	
}
