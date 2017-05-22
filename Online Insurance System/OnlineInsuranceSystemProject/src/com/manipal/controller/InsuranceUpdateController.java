package com.manipal.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.model.InsuranceModel;
import com.manipal.service.*;
import com.manipal.service.impl.InsuranceServiceImpl;
import com.manipal.service.impl.*;



public class InsuranceUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsuranceUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//long agentId=Long.parseLong(request.getParameter("can_id"));
		 //System.out.println(agentId);
		
		
		long insuranceid=Long.parseLong(request.getParameter("t1"));
		System.out.println(insuranceid);
		String insurancetype=request.getParameter("t2");
		String description=request.getParameter("t3");
		//String status=true;
		try
		{
			InsuranceModel ins=new InsuranceModel(insuranceid,insurancetype,description);
			InsuranceService insurance=new InsuranceServiceImpl();
			System.out.println(ins.getInsuranceid()+" "+ins.getInsurancetype()+" "+ins.getDescription());
			int row=insurance.updateInsurance(ins);
			if(row==1)
				System.out.println("data updated");
			else 
				System.out.println("not");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
				
	}

}
