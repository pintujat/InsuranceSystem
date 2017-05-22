package com.manipal.service.impl;
import java.util.List;


import com.manipal.DAO.*;

import com.manipal.DAO.jdbc.*;
import com.manipal.model.ClaimsModel;
import com.manipal.service.*;
public class RenewPolicyImpl implements PolicyService{
private ClaimsDAO claimsdao;
ClaimsModel claim=new ClaimsModel();
ClaimsDAO claims=new JdbcClaimsDAOImpl();
public ClaimsServiceImpl()
{
	claimsdao=new JdbcClaimsDAOImpl();
}

@Override
public int AddClaim(long policyid, String claimdate) throws Exception {
	// TODO Auto-generated method stub
	//claim.setClaimid(claimid);
	claim.setPolicyid(policyid);
	claim.setClaimdate(claimdate);
	//claim.setStatus(status);
	return claimsdao.insertClaim(claim);
}

@Override
public void updateClaims(ClaimsModel obj) {
	// TODO Auto-generated method stub
	claims.updateClaims(obj);
	
	
}

@Override
public List<ClaimsModel> getclaims() {
	ClaimsDAO claims=new JdbcClaimsDAOImpl();
	List<ClaimsModel> c=null;
	try
	{
		System.out.println("in try");
		c=claims.getClaims();
		System.out.println("hiiii");
		System.out.println(c);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return c;
}

@Override
public void deleteClaim(ClaimsModel claim) {
	ClaimsDAO claims=new JdbcClaimsDAOImpl();
	claims.deleteClaim(claim);
	
}

	


	

}
