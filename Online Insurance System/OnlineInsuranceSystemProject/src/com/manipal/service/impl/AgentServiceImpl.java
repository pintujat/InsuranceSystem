package com.manipal.service.impl;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.AgentDao;
import com.manipal.DAO.UserDao;
import com.manipal.DAO.jdbc.*;
import com.manipal.model.*;
import com.manipal.service.*;

public class AgentServiceImpl implements AgentService {
	public AgentDao userdao=new JdbcAgentDaoImpl();
	@Override
	public int AddAgent( String name, String DOB, String gender,
			String panNo, Double salary, Long mobNo, String nationality,
			String password) throws Exception {
		System.out.println("in service");
		AgentModel user = new AgentModel();
		System.out.println(user);


		//user.setAgentId(userId);
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
		return userdao.insertAgent(user);
		
	}


	@Override
	public List<AgentModel> viewDetails() {


			AgentDao cdj=new JdbcAgentDaoImpl();
			List<AgentModel> list = cdj.view();
			System.out.println("ViewDetails");
		    return list;

}


	@Override
	public List<AgentModel> viewRequest() {

		
			// TODO Auto-generated method stub
			List<AgentModel> st=userdao.findAll();
			System.out.println("ViewRequest");
			return st;
	

	}


	@Override
	public String EditAgentData(long agent_id, String name) {
JdbcAgentDaoImpl cdj=new JdbcAgentDaoImpl();
		
		cdj.updateAgentData(agent_id,name);
		return "";
		
	}


	@Override
	public void deleteAgentData(long cid) throws ClassNotFoundException,IOException {
		// TODO Auto-generated method stub
		JdbcAgentDaoImpl cdj=new JdbcAgentDaoImpl();
		try {
			cdj.deleteAgentData(cid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	@Override
	public List<AgentModel> viewAgent() {
		// TODO Auto-generated method stub
		List<AgentModel> ls=new ArrayList();
		AgentDao a=new JdbcAgentDaoImpl();
		ls=a.viewAgentDetails();
		System.out.println("ViewAgent");
		
		return ls;
	}


	@Override
	public void UpdateAgent(long agent_id, String name, String dob,String gender,
			String pan_no, double salary, long mob_no, String nat,
			String password) throws Exception {
		// TODO Auto-generated method stub
		AgentModel user=new AgentModel();
		user.setAgentId(agent_id);
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


	/*@Override
	public AgentModel getProfile(int agentId) {
		// TODO Auto-generated method stub
		return userdao.viewAgent(agentId);
	}*/
	

	@Override
	public List<AgentModel> getAgentById(long agentId) {
		
		AgentModel agent = new AgentModel();
		List<AgentModel> agents= null;
		try {
			AgentDao agentdao=new JdbcAgentDaoImpl();
			agents=agentdao.getAgentById(agentId);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return agents;
	}

	
}
