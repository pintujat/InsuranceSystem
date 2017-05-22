package com.manipal.service;
import java.util.List;

import com.manipal.model.*;

import java.util.List;

import com.manipal.model.ClaimsModel;

public interface ClaimsService {
	public int AddClaim(long policyid, String claimdate)throws Exception;
	public void updateClaims(ClaimsModel obj);
	public List<ClaimsModel> getclaims();
	public void deleteClaim(ClaimsModel claim);
}
