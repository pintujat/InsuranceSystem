package com.manipal.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.model.InsuranceModel;
import com.manipal.service.*;
import com.manipal.service.InsuranceService;
import com.manipal.service.impl.*;
import com.manipal.service.impl.InsuranceServiceImpl;

/**
 * Servlet implementation class InsuranceDeleteController
 */
//@WebServlet("/InsuranceDeleteController")
public class InsuranceDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsuranceDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		long insuranceid=Long.parseLong(request.getParameter("insuranceId"));
		try
		{
			InsuranceModel ins=new InsuranceModel();
			ins.setInsuranceid(insuranceid);
			InsuranceService in=new InsuranceServiceImpl();
			in.deleteInsurance(ins);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
