package com.manipal.DAO.jdbc;

import static com.manipal.DAO.jdbc.ConnectionHelper.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.manipal.DAO.AdminLoginDao;

public class JdbcAdminLoginDao implements AdminLoginDao{

	@Override
	public int adminValid(int adm_id,String pwd)
	{
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		System.out.println(adm_id);
		System.out.println(pwd);
		try {
			con = getMySqlConnection();

			pst=con.prepareStatement("select count(*) from admin where adminid=? and adminpassword=?");
			pst.setInt(1,adm_id);
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
