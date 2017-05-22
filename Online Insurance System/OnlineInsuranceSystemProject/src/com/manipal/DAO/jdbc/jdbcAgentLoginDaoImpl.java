package com.manipal.DAO.jdbc;

import static com.manipal.DAO.jdbc.ConnectionHelper.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.manipal.DAO.AgentLoginDao;

public class jdbcAgentLoginDaoImpl implements AgentLoginDao{


	@Override
	public int AgentValid(int agent_id, String agent_pwd) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			con = getMySqlConnection();

			pst=con.prepareStatement("select count(*) from agent where agentid=? and agentpassword=?");
			pst.setInt(1,agent_id);
			pst.setString(2, agent_pwd);
			rs = pst.executeQuery();
			rs.next();
			int count = rs.getInt(1);
			con.close();
			return count;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			}
		return 0;
	}
	
}
