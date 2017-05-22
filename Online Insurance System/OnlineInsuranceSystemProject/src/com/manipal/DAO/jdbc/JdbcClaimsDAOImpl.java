package com.manipal.DAO.jdbc;
import java.sql.*;
import java.util.*;

import static com.manipal.DAO.jdbc.ConnectionHelper.*;

import com.manipal.DAO.*;
import com.manipal.model.ClaimsModel;
public class JdbcClaimsDAOImpl implements ClaimsDAO {

	ClaimsModel claim=new ClaimsModel();
	@Override
	public int insertClaim(ClaimsModel claim) {
		// TODO Auto-generated method stub
		Connection con=null;
		
		//ClaimsModel claim = claimo;
		int cnt=0;
		try
		{
			System.out.println("inside jdbc try");
			
			con=ConnectionHelper.getMySqlConnection();
			System.out.println("con obj "+con);
			
			PreparedStatement stmt=null;
			System.out.println(claim);
			
			System.out.println(con);
			
			stmt=con.prepareStatement("insert into claim values(claim_seq.nextval,?,?,'ACTIVE')");
			//stmt.setLong(1,claim.getClaimid());
			stmt.setLong(1, claim.getPolicyid());
			stmt.setString(2,claim.getClaimdate());
			cnt=stmt.executeUpdate();
			
			System.out.println("in try claim object "+claim);
			con.commit();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("inside claim jcbd catch");
			
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("inside claim jcbd finally");
			//cleanup(con,stmt,null);
		}
		return cnt;
		
	}

	@Override
	public int deleteClaim(ClaimsModel claim) {
		PreparedStatement pst;
		int row=0;
		try
		{
			Connection con=ConnectionHelper.getMySqlConnection();
			pst=con.prepareStatement("update claim set STATUS='false' where claimid=?");
			pst.setLong(1,claim.getClaimid());
			 row=pst.executeUpdate();
			if(row==1)
			{
				System.out.println("claim deleted");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return row;
	}
	

	@Override
	public int updateClaims(ClaimsModel claim) {
		// TODO Auto-generated method stub
		PreparedStatement pst=null;
	int row=0;
		try{
			Connection con=ConnectionHelper.getMySqlConnection();
			pst=con.prepareStatement("update claim set policyid=?,claimdate=? where claimid=?");
			pst.setLong(1,claim.getPolicyid());
			pst.setString(2,claim.getClaimdate());
			pst.setLong(3,claim.getClaimid());
		    row=pst.executeUpdate();
			if(row==1)
			{
				System.out.println("record inserted");
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return row;
	}

	@Override
	public List<ClaimsModel> getClaims() {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		List<ClaimsModel> claim=new ArrayList<ClaimsModel>();
		try
		{
			con=ConnectionHelper.getMySqlConnection();
			System.out.println(con);
			pst=con.prepareStatement("select * from claim");
			rs=pst.executeQuery();
			System.out.println(rs);
			while(rs.next())
			{
				ClaimsModel claims=new ClaimsModel();
				claims.setClaimid(rs.getLong("claimid"));
				claims.setPolicyid(rs.getLong("policyid"));
				claims.setClaimdate(rs.getString("claimdate"));
				claims.setStatus(rs.getString("status"));
				System.out.println(claims.getClaimid()+" "+claims.getClaimdate()+" "+claims.getPolicyid()+" "+claims.getStatus());
				claim.add(claims);
				System.out.println("");
				System.out.println(claim);
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return claim;
	}

	
}
