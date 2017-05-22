package com.manipal.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.Policy;
import com.manipal.model.PolicyModel;

public interface PolicyService {
	public int insertPolicy(long insuranceId,String policyHolderName,double coverage,double amount,String policyDate,long agentId,long userId);
	public void deletePolicy(long policyId) throws ClassNotFoundException,SQLException,IOException;
	public List<Policy> viewPolicyService();
	void UpdatePolicy(long insuranceId,String policyHolderName,double coverage,double amount,String policyDate) throws Exception;
	List<Policy> getPolicyByUser(long userId);
	List<Policy> getPolicyByAgent(long agentId);
	
}
