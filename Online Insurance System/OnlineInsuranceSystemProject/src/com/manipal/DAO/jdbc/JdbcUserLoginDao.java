package com.manipal.DAO.jdbc;

import static com.manipal.DAO.jdbc.ConnectionHelper.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.manipal.DAO.UserLoginDao;

public class JdbcUserLoginDao implements UserLoginDao{

	@Override
	public int userValid(int user_id,String pwd)
	{
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		System.out.println(user_id);
		System.out.println(pwd);
		try {
			con = getMySqlConnection();

			pst=con.prepareStatement("select count(*) from users where userid=? and userpassword=?");
			pst.setInt(1,user_id);
			pst.setString(2, pwd);
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
