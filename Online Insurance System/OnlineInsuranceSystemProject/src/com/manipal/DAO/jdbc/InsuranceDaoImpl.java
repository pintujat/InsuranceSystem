package com.manipal.DAO.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.InsuranceDao;
import com.manipal.model.InsuranceModel;

public class InsuranceDaoImpl implements InsuranceDao {

	PreparedStatement pst=null;
	//InsuranceModel ins=new InsuranceModel();
	int row;

	@Override
	public int deleteInsurance(InsuranceModel ins) {
		try
		{
			Connection con=ConnectionHelper.getMySqlConnection();
			pst=con.prepareStatement("update insurance set STATUS='inactive' where insuranceid=?");
			pst.setLong(1,ins.getInsuranceid());
			int row=pst.executeUpdate();
			if(row==1)
			{
				System.out.println("insurance deleted");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return row;

	
	}

	@Override
	public int insertInsurance(InsuranceModel insurance) {
		Connection con=null;
		int cnt=0;
		try
		{
			//InsuranceModel insurance=new InsuranceModel();
			con=ConnectionHelper.getMySqlConnection();
			PreparedStatement pst=null;
			System.out.println("dao..pst     "+pst);
			pst=con.prepareStatement("insert into insurance values(insurance_seq.nextval,?,?,'ACTIVE')");
			//pst.setLong(1,insurance.getInsuranceid());
			pst.setString(1, insurance.getInsurancetype());
			pst.setString(2,insurance.getDescription());
			System.out.println("data set"+""+insurance.getInsurancetype()+""+insurance.getDescription());
			cnt=pst.executeUpdate();
			con.commit();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return cnt;
	}
	

	@Override
	public int updateInsurance(InsuranceModel ins) {
		PreparedStatement pst=null;
		//InsuranceModel ins=new InsuranceModel();
		int row = 0;


			
			try {
				Connection con=ConnectionHelper.getMySqlConnection();
				System.out.println(con);
				pst=con.prepareStatement("update insurance set insurancetype=?,description=? where insuranceid=?");
				System.out.println("after query"+ins.getInsurancetype()+" "+ins.getDescription()+" "+ins.getInsuranceid());
				pst.setString(1,ins.getInsurancetype());
				pst.setString(2,ins.getDescription());
				pst.setLong(3,ins.getInsuranceid());
				System.out.println("data inserted");
				row=pst.executeUpdate();

				System.out.println(pst);
				System.out.println(ins);
				System.out.println("row"+row);
				con.commit();
				con.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e.getMessage());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			
			
			return row;
			
			
			
			
	}

	
	@Override
	public List<InsuranceModel> getInsurance() {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		List<InsuranceModel> insurance=new ArrayList<InsuranceModel>();
		try
		{
			con=ConnectionHelper.getMySqlConnection();
			pst=con.prepareStatement("select * from insurance");
			rs=pst.executeQuery();
			System.out.println("pst statement");
			while(rs.next())
			{
				InsuranceModel in=new InsuranceModel();
				in.setInsuranceid(rs.getLong("insuranceid"));
				in.setInsurancetype(rs.getString("insurancetype"));
				in.setDescription(rs.getString("description"));
				in.setStatus(rs.getString("status"));
				insurance.add(in);
				System.out.println("list while");
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	return insurance;
	}

}
