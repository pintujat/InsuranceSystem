package com.manipal.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.AgentDao;
import com.manipal.DAO.PolicyDAO;
import com.manipal.DAO.jdbc.JdbcAgentDaoImpl;
import com.manipal.DAO.jdbc.JdbcUserDaoImpl;
import com.manipal.DAO.jdbc.PolicyDaoImpl;
import com.manipal.model.AgentModel;
import com.manipal.model.Policy;
import com.manipal.model.PolicyModel;
import com.manipal.service.PolicyService;

public class PolicyServiceImpl implements PolicyService{
	
private PolicyDAO policydao;
	
	Policy policy;

	private PolicyDAO policyService;

	public PolicyServiceImpl() {
		policydao = new PolicyDaoImpl();
	}
	
	
	@Override
	public int insertPolicy(long insuranceId,String policyHolderName,double coverage,double amount,String policyDate,long agentId,long userId) 
	{
		policy= new Policy();
		System.out.println(policy);
		// TODO Auto-generated method stub
		
		


		//policy.setPolicyId(policyId);
		policy.setInsuranceId(insuranceId);
		policy.setPolicyHolderName(policyHolderName);
		policy.setCoverage(coverage);
		policy.setAmount(amount);
		policy.setPolicyDate(policyDate);
		policy.setAgentId(agentId);
		policy.setUserId(userId);
		
		
		return policydao.insertPolicy1(policy);
		
		
	}


	@Override
	public void deletePolicy(long policyId) throws ClassNotFoundException,
			SQLException, IOException {
		PolicyDaoImpl p=new PolicyDaoImpl();
		p.deletePolicy(policyId);
	}
		@Override
		public List<Policy> viewPolicyService() {
			List<Policy> ls=new ArrayList();
			PolicyDAO obj=new PolicyDaoImpl();
			ls=obj.viewPolicy();
			return ls;
		
		
		
	}
		@Override
		public void UpdatePolicy(long insuranceId,String policyHolderName,double coverage,double amount,String policyDate) throws Exception {
			// TODO Auto-generated method stub
			Policy po=new Policy();
			System.out.println(po.getAgentId());
			po.setInsuranceId(insuranceId);
			po.setPolicyHolderName(policyHolderName);
			po.setCoverage(coverage);
			po.setAmount(amount);
			po.setPolicyDate(policyDate);
		
			
			policyService.update1(policy);

		

		}
		

		@Override
		public List<Policy> getPolicyByUser(long userId) {
			
			Policy policy = new Policy();
			List<Policy> policies= null;
			try {
				PolicyDAO policydao=new PolicyDaoImpl();
				policies=policydao.getPolicyByUser(userId);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
			return policies;
		}


		@Override
		public List<Policy> getPolicyByAgent(long agentId) {
			Policy policy = new Policy();
			List<Policy> policies= null;
			try {
				PolicyDAO policydao=new PolicyDaoImpl();
				policies=policydao.getPolicyByUser(agentId);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
			return policies;
		}
	}
