package com.manipal.service;

import java.util.List;

import com.manipal.model.InsuranceModel;

public interface InsuranceService {
	
	public int AddInsurance(String insurancetype,String description) throws Exception;
	public int updateInsurance(InsuranceModel obj);
	public List<InsuranceModel> getinsurance();
	//public void deleteInsurance(InsuranceModel ins);
	//public int AddInsurance(InsuranceModel obj);
	//public void deleteInsurance(long insuranceid);
	void deleteInsurance(InsuranceModel ins);
}
