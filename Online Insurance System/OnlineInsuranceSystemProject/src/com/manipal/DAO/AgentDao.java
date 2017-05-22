package com.manipal.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.AgentModel;
import com.manipal.model.UserModel;


public interface AgentDao {
	public int insertAgent(AgentModel agent);
	public List<AgentModel> view();
	List<AgentModel> findAll();
	public String updateAgentData(long agentid,String name);
	public String deleteAgentData(long agentid) throws ClassNotFoundException,SQLException,IOException;

	public void update1(AgentModel c);
	List<AgentModel> viewAgentDetails();
	public List<AgentModel> getAgentById(long agentId);



}
