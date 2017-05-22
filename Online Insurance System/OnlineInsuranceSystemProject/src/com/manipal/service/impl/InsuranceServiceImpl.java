package com.manipal.service.impl;

import java.util.List;

import com.manipal.DAO.*;
import com.manipal.DAO.jdbc.*;
import com.manipal.model.InsuranceModel;
import com.manipal.service.InsuranceService;

public class InsuranceServiceImpl implements InsuranceService {

	public InsuranceDao insurancedao=new InsuranceDaoImpl();
	InsuranceDao ins=new InsuranceDaoImpl();
	InsuranceModel insurance=new InsuranceModel();
	public InsuranceServiceImpl() {
		super();
		//insurancedao=new InsuranceDao();
		// TODO Auto-generated constructor stub
	}
public int AddInsurance( String insurancetype, String description) {
				// TODO Auto-generated method stub
				//insurance.setInsuranceid(insuranceid);
				insurance.setInsurancetype(insurancetype);
				insurance.setDescription(description);
				//insurance.setStatus(status);
				System.out.println( "service");
				System.out.println(""+insurancetype+""+description);
				return insurancedao.insertInsurance(insurance);
	}

	

	@Override
	public int updateInsurance(InsuranceModel obj) {

		System.out.println("in service impl obj------"+obj);
		System.out.println(obj.getInsurancetype()+" "+obj.getDescription());
		 return ins.updateInsurance(obj);
	}

	@Override
	public List<InsuranceModel> getinsurance() {
		InsuranceDao insurance=new InsuranceDaoImpl();
		List<InsuranceModel> c=null;
		try
		{
			c=insurance.getInsurance();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public void deleteInsurance(InsuranceModel insuranceid) {
		
		InsuranceDao insurance=new InsuranceDaoImpl();
		insurance.deleteInsurance(insuranceid);
		
	}
}
