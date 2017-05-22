package com.manipal.DAO.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.AgentDao;
import com.manipal.model.AgentModel;

public class JdbcAgentDaoImpl implements AgentDao {

	@Override
	public int insertAgent(AgentModel user) {
		Connection con=null;
		
		
		PreparedStatement stmt=null ;
		
		System.out.println("preparedStatement obj"+stmt);
		
		int cnt = 0;

		System.out.println("outside try");
		try {
			System.out.println("in try ----- con");
			con = ConnectionHelper.getMySqlConnection();
			
			System.out.println("connection obj"+con);
			
			//String status ="active";
			String query = "insert into agent"+" values(agent_seq.nextval,?,?,?,?,?,?,?,?,'true')";
			System.out.println(con+"       Con object created");
			stmt = con.prepareStatement(query);
			System.out.println(user);
			System.out.println(stmt+"      in user Dao Impl ");
			
			//stmt.setLong(1, user.getAgentId());
			stmt.setString(1, user.getName());
			System.out.println(user.getName());
			stmt.setString(2, user.getDOB());
			System.out.println(user.getDOB());
			stmt.setString(3, user.getGender());
			System.out.println(user.getGender());
			stmt.setString(4, user.getPanNo());
			System.out.println(user.getPanNo());
			stmt.setDouble(5,user.getSalary());
			System.out.println(user.getSalary());
			stmt.setLong(6, user.getMobNo());
			System.out.println(user.getMobNo());
			stmt.setString(7, user.getNationality());
			System.out.println(user.getNationality());
			stmt.setString(8,user.getPassword());
			System.out.println(user.getPassword());
			//stmt.setBoolean(10,Boolean.parseBoolean(status));
			System.out.println("       User Dao Impl after set"+user);
			System.out.println(user);
			
			cnt = stmt.executeUpdate();
			con.commit();
			con.close();
		
		} catch (Exception e) {
			//LOGGER.error(e.getMessage());
			System.out.println("inside catch Jdbc User Dao Impl");
			System.out.println(e.getMessage());
		} finally {
//			cleanup(con, stmt, null);
			System.out.println("in finally...Jdbc User Dao Impl");
		}
		return cnt;

	}

	@Override
		public List<AgentModel> view()
		
{
		
		ConnectionHelper conHelp=new ConnectionHelper();
		Connection con = null;
		Statement stmt;
		ResultSet result;


			List<AgentModel> catList =new ArrayList<AgentModel>();
			
			try {
				con=ConnectionHelper.getMySqlConnection();
				 
				stmt = (Statement) con.createStatement();
				System.out.println(stmt);
				result = stmt.executeQuery("select * from agent");
				System.out.println(result);
				AgentModel lst;
				//System.out.println(result.next());
				while (result.next()) {
					lst = new AgentModel();
					long id=result.getLong(1);
				   /* String name= result.getString(2);
				    String dob=result.getString(3);
				    String gen=result.getString(4);
				    String pan=result.getString(5);
				    double sal=result.getDouble(6);
				    long mob=result.getLong(7);
				    String nat=result.getString(8);*/
				    lst.setAgentId(result.getLong(1));
					lst.setName(result.getString(2));
					lst.setDOB(result.getString(3));
					lst.setGender(result.getString(4));
					lst.setPanNo(result.getString(5));
					lst.setSalary(result.getDouble(6));
				    lst.setMobNo(result.getLong(7));
				    lst.setNationality(result.getString(8));
				    lst.setPassword(result.getString(9));
				    
				    
				    
					//lst.setStatus(result.isBoolean"));
					System.out.println(lst);
				
					catList.add(lst);
					System.out.println("display");
				}
				
			con.close();
				
			} catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		

		
		
		return catList;

	}
	@Override
	public List<AgentModel> findAll() {
		ConnectionHelper conHelp=new ConnectionHelper();
		Connection con = null;
		Statement stmt=null;
		//ResultSet result;
		AgentModel ord;
		List<AgentModel> list =new ArrayList<AgentModel>();;
		try {
			con=ConnectionHelper.getMySqlConnection();
			//ordList  = 
			stmt = con.createStatement();
			System.out.println(stmt);
			ResultSet	result = stmt.executeQuery("select * from agent");
			System.out.println(result);
			
			//System.out.println(result.next());
			while (result.next()) {
				//System.out.println(result.next());
			ord = new AgentModel(result.getLong(1),result.getString(2), result.getString(3), result.getString(4),
						result.getString(5),result.getDouble(6), result.getLong(7),result.getString(8),result.getString(9));

				
				
				
				/*			
				ord.setAgentId(result.getLong(1));
				ord.setName(result.getString(2));
				ord.setDOB(result.getString(3));
				ord.setGender(result.getString(4));
				ord.setPanNo(result.getString(5));
				ord.setSalary(result.getDouble(6));
			    ord.setMobNo(result.getLong(7));
			    ord.setNationality(result.getString(8));
			    ord.setPassword(result.getString(9));*/
			//	System.out.println(ord);
				list.add(ord);
				//System.out.println(result.next());
				
			}
			
			//con.close();//return ordList;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
		
		
	}

	@Override
	public String updateAgentData(long agent_id, String name) {
		Connection con1 = null;
		Statement st = null;
		AgentModel cd=null;
		int result=0;
		
		try
		{
		    con1 = ConnectionHelper.getMySqlConnection();
			st=con1.createStatement();
			result = st.executeUpdate("update agent set name="+"'"+name+"'"+" where agentId="+agent_id);
			System.out.println(result);			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result!=1)
			return("not updated");
		else
			return("Updated successfully");

	}

	@Override
	public String deleteAgentData(long agent_id) throws ClassNotFoundException,SQLException,IOException{

		int i=0;
		PreparedStatement ps=null;
		String str = "update agent set status='false' where agentId="+agent_id;
		Connection con;
		try {
			con = ConnectionHelper.getMySqlConnection();
			ps=con.prepareStatement(str);
			i= ps.executeUpdate();
			System.out.println(i);
			
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i==1)
		{
			return(" deleted");
		}
		else
		{
			return("Deletion failed");
		}
	

	}
	@Override
	public void update1(AgentModel c) {
		Connection con = null;
		PreparedStatement p = null;
		//int cnt = 0;
		System.out.println(c);
		String query = "update agent set name=?,dateofbirth=?,gender=?,panno=?,salary=?,mobnumber=?,nationality=?,agentpassword=? where agentid=?";
		try {
			con = ConnectionHelper.getMySqlConnection();
		
			p = con.prepareStatement(query);
			System.out.println(p);
			//pst.setLong(1, c.getAgentId());
			p.setString(1,c.getName());
			p.setString(2,c.getDOB());
			p.setString(3,c.getGender());
			p.setString(4,c.getPanNo());
			p.setDouble(5,c.getSalary());
			p.setLong(6,c.getMobNo());
			p.setString(7,c.getNationality());
			p.setString(8, c.getPassword());
			p.setLong(9, c.getAgentId());
			System.out.println(p.executeUpdate());
			
			con.commit();
			//ResultSet rst = pst.executeQuery("select * from agent_details");

			//con.close();
		} catch (SQLException | ClassNotFoundException | IOException e) {
			//LOGGER.error(e.getMessage());
			e.printStackTrace();
		} finally {
			ConnectionHelper.cleanup(con, p, null);
		}
		//System.out.println(cnt);
	
	}

	@Override
	public List<AgentModel> viewAgentDetails() {
		// TODO Auto-generated method stub
		List <AgentModel> plist=new ArrayList();
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			con=ConnectionHelper.getMySqlConnection();
			String query="select * from agent_details ";
			stmt=con.prepareStatement(query);
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
				AgentModel a=new AgentModel();
				a.setAgentId(rs.getLong(1));
				a.setName(rs.getString(2));
				a.setDOB(rs.getString(3));
				a.setGender(rs.getString(4));
				a.setPanNo(rs.getString(5));
				a.setSalary(rs.getDouble(6));
				a.setMobNo(rs.getLong(7));
				a.setNationality(rs.getString(8));
				plist.add(a);
				
			}
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return plist;
	}

	@Override
	public List<AgentModel> getAgentById(long agentId) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet result =null;
		List<AgentModel> agents = new ArrayList<AgentModel>();
		
		try {
			con = ConnectionHelper.getMySqlConnection();
			System.out.println(con);
			String query="select * from agent where agentId = " +agentId;
			stmt=con.prepareStatement(query);
			System.out.println(stmt);
			System.out.println("calling query");
	result = stmt.executeQuery(); 
			
	AgentModel agent;
	
	while(result.next())
	{
		
		agent =new AgentModel();
		agent.setAgentId(result.getLong(1));
		System.out.println("Agent set");
		
		//agent.setAgentId(result.getLong(1));
		agent.setName(result.getString(2));
		agent.setDOB(result.getString(3));
		agent.setGender(result.getString(4));
		agent.setPanNo(result.getString(5));
		agent.setSalary(result.getDouble(6));
		agent.setMobNo(result.getLong(7));
		agent.setNationality(result.getString(8));
		agent.setStatus(result.getString(9));
		System.out.println("all set");
		agents.add(agent);
		System.out.println(agent);
		System.out.println(agents);
		
	}
	con.close();
		}
		
		catch (Exception e)
		{
			System.out.println("in catch");
			//throw new RuntimeException(e.getMessage());	
		}
		return agents;
		
	}
}

	

