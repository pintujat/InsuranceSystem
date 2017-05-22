package com.manipal.DAO.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.UserDao;
import com.manipal.model.AgentModel;
import com.manipal.model.UserModel;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class JdbcUserDaoImpl implements UserDao {
	//private static final Logger LOGGER = LoggerFactory.getLogger(JdbcUserDaoImpl.class);

	@Override
	public int insertUser(UserModel user) {
		// TODO Auto-generated method stub
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
			String query = "insert into users"+" values(users_seq.nextval,?,?,?,?,?,?,?,?,'true')";
			System.out.println(con+"       Con object created");
			stmt = con.prepareStatement(query);
			System.out.println(user);
			System.out.println(stmt+"      in user Dao Impl ");
			
			//stmt.setLong(1, user.getUserId());
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

		public List<UserModel> findAll() {
			// TODO Auto-generated method stub
			Connection con = null;
			Statement stmt = null;
			ResultSet result = null; 
			try {
				
				System.out.println("inside try DAO impl...");
				
				con = ConnectionHelper.getMySqlConnection();
				System.out.println("con obj created..."+con);
				
				stmt = (Statement) con.createStatement();
				System.out.println("stmt obj created.....");
				
				result = stmt.executeQuery("select * from users");
				System.out.println("result set created........");
				
				List<UserModel> users = new ArrayList<UserModel>();
				System.out.println("list created..........");
				UserModel user;
				while (result.next()) {
					user = new UserModel();
					System.out.println("inside while....");
					user.setUserId(result.getLong("userId"));
					user.setName(result.getString("name"));
					user.setDOB(result.getString("dateOfBirth"));
					user.setGender(result.getString("gender"));
					user.setPanNo(result.getString("panNo"));
					user.setSalary(result.getDouble("salary"));
					user.setMobNo(result.getLong("mobNumber"));
					user.setNationality(result.getString("nationality"));
					user.setPassword(result.getString("userpassword"));
					
					users.add(user);
					System.out.println("users.add");
				}
				con.close();
				return users;
			} catch (Exception e) {
				System.out.println("inside catch DAO impl");
				//Logger.debug(e.getMessage());
				throw new RuntimeException(e.getMessage());
		
			} finally {
				//cleanup(con, stmt, result);
				
				System.out.println("inside finally..");
			}
		}

		
		@Override
		public void update1(UserModel user) {
			Connection con = null;
			PreparedStatement p = null;
			//int cnt = 0;
			System.out.println(user);
			String query = "update users set name=?,dateofbirth=?,gender=?,panno=?,salary=?,mobnumber=?,nationality=?,userpassword=? where userid=?";
			try {
				con = ConnectionHelper.getMySqlConnection();
			
				p = con.prepareStatement(query);
				System.out.println(p);
				//pst.setLong(1, c.getAgentId());
				p.setString(1,user.getName());
				p.setString(2,user.getDOB());
				p.setString(3,user.getGender());
				p.setString(4,user.getPanNo());
				p.setDouble(5,user.getSalary());
				p.setLong(6,user.getMobNo());
				p.setString(7,user.getNationality());
				p.setString(8, user.getPassword());
				p.setLong(9, user.getUserId());
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
		public List<UserModel> getUserById(long userId) {
			Connection con = null;
			PreparedStatement stmt = null;
			ResultSet result =null;
			List<UserModel> users = new ArrayList<UserModel>();
			
			try {
				con = ConnectionHelper.getMySqlConnection();
				System.out.println(con);
				String query="select * from users where userId = " +userId;
				stmt=con.prepareStatement(query);
				System.out.println(stmt);
				System.out.println("calling query");
		result = stmt.executeQuery(); 
				
		UserModel user;
		
		while(result.next())
		{
			
			user =new UserModel();
			user.setUserId(result.getLong(1));
			System.out.println("Userset");
			
			//agent.setAgentId(result.getLong(1));
			user.setName(result.getString(2));
			user.setDOB(result.getString(3));
			user.setGender(result.getString(4));
			user.setPanNo(result.getString(5));
			user.setSalary(result.getDouble(6));
			user.setMobNo(result.getLong(7));
			user.setNationality(result.getString(8));
			user.setStatus(result.getString(9));
			System.out.println("all set");
			users.add(user);
			System.out.println(user);
			System.out.println(users);
			
		}
		con.close();
			}
			
			catch (Exception e)
			{
				System.out.println("in catch");
				//throw new RuntimeException(e.getMessage());	
			}
			return users;
			
		}
	}
