package com.manipal.DAO;

import java.util.List;

import com.manipal.model.InsuranceModel;

public interface InsuranceDao {
	int deleteInsurance(InsuranceModel ins);
	//public int insertInsurance(long insuranceid, String insurancetype,String description);
	int updateInsurance(InsuranceModel insurance);
	public List<InsuranceModel> getInsurance();
	public int insertInsurance(InsuranceModel insurance);
}

