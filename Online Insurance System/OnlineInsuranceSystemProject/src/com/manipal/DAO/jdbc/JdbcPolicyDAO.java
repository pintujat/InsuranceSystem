package com.manipal.DAO.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.PolicyDAO;
import com.manipal.model.AgentModel;
import com.manipal.model.Policy;
import com.manipal.model.PolicyModel;

public class JdbcPolicyDAO implements PolicyDAO {

	@Override
	public int insertPolicy1(Policy policy) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement stmt = null;
		PolicyModel policymod= new PolicyModel();
		int cnt = 0;
		System.out.println(policymod);
		try {
			System.out.println("in try....");
			System.out.println(policy.getAgentId());
			con = ConnectionHelper.getMySqlConnection();
			System.out.println(con);
			String query = "insert into Policy"
					+ " values(policy_seq.nextval,?,?,?,?,?,?,?,'active')";
			
			stmt = con.prepareStatement(query);
			System.out.println(stmt);
			
			//stmt.setLong(1, policy.getPolicyId());
			stmt.setLong(1, policy.getInsuranceId());
			stmt.setString(2, policy.getPolicyHolderName());
			stmt.setDouble(3, policy.getCoverage());
			stmt.setDouble(4, policy.getAmount());
			stmt.setString(5,policy.getPolicyDate());
			stmt.setLong(6, policy.getAgentId());
			stmt.setLong(7, policy.getUserId());
			
			
			cnt = stmt.executeUpdate();
			con.commit();
			con.close();
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			//LOGGER.error(e.getMessage());
		} finally {
			//cleanup(con, stmt, null);
			System.out.println("inside finally jdbc dao");
		}
		return cnt;

	}

	@Override
	public String deletePolicy(long policyId) {
		Connection con = null;
		PreparedStatement stmt = null;
		int cnt = 0;
		try
		{
			con = ConnectionHelper.getMySqlConnection();
			System.out.println(con);
			String query = "update Policy set status='inactive' where policyid="+policyId;
			
			stmt = con.prepareStatement(query);
			System.out.println(stmt);
			cnt = stmt.executeUpdate();
	//con.commit();
		//con.close();
	} catch (Exception e) {
		
		System.out.println(e.getMessage());
		//LOGGER.error(e.getMessage());
	} finally {
		//cleanup(con, stmt, null);
		System.out.println("inside finally jdbc dao");
	}
		if(cnt==1)
		{
			return ("deleted");
		}
		else
		{
			return ("Deletion failed");
		}
		}

	@Override
	public List<Policy> viewPolicy() 
	{
		List<Policy> plist=new ArrayList<Policy>();
		Connection con = null;
		PreparedStatement stmt = null;
		
		try
		{
			 con=ConnectionHelper.getMySqlConnection();
			String query="select * from Policy";
			stmt = con.prepareStatement(query);
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
				Policy policy = new Policy();
				policy.setPolicyId(rs.getLong(1));
				policy.setInsuranceId(rs.getLong(2));
				policy.setPolicyHolderName(rs.getString(3));
				policy.setCoverage(rs.getDouble(4));
				policy.setAmount(rs.getDouble(5));
				policy.setPolicyDate(rs.getString(6));
				policy.setAgentId(rs.getLong(7));
				policy.setUserId(rs.getLong(8));
				plist.add(policy);
				
			}
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return plist;
		
	}
	
	
	@Override
	public void update1(Policy p) {
		PolicyModel pobj=null;
		Connection con = null;
		PreparedStatement stmt = null;
		try
		{
			
			
			con=ConnectionHelper.getMySqlConnection();
			stmt=con.prepareStatement("select * from Policy where policyid=?");
			//stmt.setLong(1, );
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
				pobj=new PolicyModel();
				pobj.setPolicyId(rs.getLong(1));
				pobj.setInsuranceId(rs.getLong(2));
				pobj.setPolicyHolderName(rs.getString(3));
				pobj.setCoverage(rs.getDouble(4));
				pobj.setAmount(rs.getDouble(5));
				pobj.setPolicyDate(rs.getString(6));
				pobj.setAgentId(rs.getLong(7));
				pobj.setUserId(rs.getLong(8));
			}
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return pobj;
	}

	@Override
	public List<Policy> getPolicyByUser(long userId) {
		// TODO Auto-generated method stub
		
			Connection con = null;
			PreparedStatement stmt = null;
			ResultSet result =null;
			List<Policy> policies = new ArrayList<Policy>();
			
			try {
				con = ConnectionHelper.getMySqlConnection();
				System.out.println(con);
				String query="select * from policy where userId = " +userId;
				stmt=con.prepareStatement(query);
				System.out.println(stmt);
				System.out.println("calling query");
		result = stmt.executeQuery(); 
				
		Policy policy;
		
		while(result.next())
		{
			
			policy =new Policy();
			policy.setAgentId(result.getLong(1));
			System.out.println("Agent set");
			
			//agent.setAgentId(result.getLong(1));
			//agent.setName(result.getString(2));
			
			policy.setPolicyId(result.getLong(2));
			policy.setInsuranceId(result.getLong(2));
			policy.setPolicyHolderName(result.getString(2));
			policy.setCoverage(result.getLong(2));
			policy.setAmount(result.getLong(2));
			policy.setPolicyDate(result.getString(2));
			policy.setAgentId(result.getLong(2));
			policy.setUserId(result.getLong(2));
			System.out.println("all set");
			policies.add(policy);
			System.out.println(policy);
			System.out.println(policies);
			
		}
		con.close();
			}
			
			catch (Exception e)
			{
				System.out.println("in catch");
				//throw new RuntimeException(e.getMessage());	
			}
			return policies;
		
	}

	@Override
	public List<Policy> getPolicyByAgent(long agentId) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet result =null;
		List<Policy> policies = new ArrayList<Policy>();
		
		try {
			con = ConnectionHelper.getMySqlConnection();
			System.out.println(con);
			String query="select * from policy where agentId = " +agentId;
			stmt=con.prepareStatement(query);
			System.out.println(stmt);
			System.out.println("calling query");
	result = stmt.executeQuery(); 
			
	Policy policy;
	
	while(result.next())
	{
		
		policy =new Policy();
		policy.setAgentId(result.getLong(1));
		System.out.println("Agent set");
		
		//agent.setAgentId(result.getLong(1));
		//agent.setName(result.getString(2));
		
		policy.setPolicyId(result.getLong(2));
		policy.setInsuranceId(result.getLong(2));
		policy.setPolicyHolderName(result.getString(2));
		policy.setCoverage(result.getLong(2));
		policy.setAmount(result.getLong(2));
		policy.setPolicyDate(result.getString(2));
		policy.setAgentId(result.getLong(2));
		policy.setUserId(result.getLong(2));
		System.out.println("all set");
		policies.add(policy);
		System.out.println(policy);
		System.out.println(policies);
		
	}
	con.close();
		}
		
		catch (Exception e)
		{
			System.out.println("in catch");
			//throw new RuntimeException(e.getMessage());	
		}
		return policies;
	}

}



