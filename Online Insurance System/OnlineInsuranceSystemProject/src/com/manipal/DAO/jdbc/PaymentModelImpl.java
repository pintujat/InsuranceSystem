package com.manipal.DAO.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.PaymentModeDAO;
import com.manipal.model.PaymentModel;

public class PaymentModelImpl implements PaymentModeDAO {

	@Override
	public List<PaymentModel> viewPolicy() 
	{
		List<PaymentModel> plist=new ArrayList<PaymentModel>();
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
				
				PaymentModel policy = new PaymentModel();
				policy.setPolicyId(rs.getLong(1));
				policy.setPaymentId(rs.getLong(2));
				policy.setPaymentDate(rs.getString(3));
				policy.setAmount(rs.getDouble(4));
				policy.setPaymentMode(rs.getString(5));
				policy.setStatus(rs.getString(6));
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
}


