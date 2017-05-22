package com.manipal.service.impl;


import com.manipal.DAO.AgentLoginDao;
import com.manipal.DAO.jdbc.jdbcAgentLoginDaoImpl;
import com.manipal.service.AgentLoginService;

public class AgentLoginServiceImpl implements AgentLoginService {

		AgentLoginDao agentlogindao;
	public AgentLoginServiceImpl()
	{
		agentlogindao=new jdbcAgentLoginDaoImpl();
	}
	@Override
	public int AgentLoginValidate(int username, String password) {

		
		return agentlogindao.AgentValid(username,password);
	}
	
}
