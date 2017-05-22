package com.manipal.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.AgentModel;

public interface AgentService {

	public int AddAgent( String name, String DOB, String gender, String panNo, Double salary, Long mobNo, String nationality, String password) throws Exception;
	public List<AgentModel> viewDetails();
	List<AgentModel> viewRequest();
	public String EditAgentData(long agent_id,String name);
	public void deleteAgentData(long aid) throws ClassNotFoundException,IOException;
	public List<AgentModel> viewAgent();
	//public AgentModel updateAgent(long user);
	//public boolean updateAgentDetails(String agent);
	void UpdateAgent(long agent_id, String name,String dob,
			String gender,String pan_no,double salary, long mob_no,String nat,String candidate_password) throws Exception;
	//public AgentModel getProfile(int agentId);
	List<AgentModel> getAgentById(long agentId);


}
