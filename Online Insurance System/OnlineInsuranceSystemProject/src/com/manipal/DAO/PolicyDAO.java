package com.manipal.DAO;

import java.util.List;

import com.manipal.model.Policy;
import com.manipal.model.PolicyModel;

public interface PolicyDAO {
	
	public int insertPolicy1(Policy policy);
	public String deletePolicy(long policyId);
	List<Policy> viewPolicy();
	public void update1(Policy p);
	public List<Policy> getPolicyByUser(long userId);
	public List<Policy> getPolicyByAgent(long agentId);
	

}
