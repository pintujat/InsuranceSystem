package com.manipal.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.service.*;
import com.manipal.service.impl.*;
import com.manipal.service.impl.InsuranceServiceImpl;

/**
 * Servlet implementation class InsuranceInsertController
 */
//@WebServlet("/InsuranceInsertController")
public class InsuranceInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsuranceInsertController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//long insuranceid=Long.parseLong(request.getParameter("t1"));
		String insurancetype=request.getParameter("t2");
		String description=request.getParameter("t3");
		//Boolean status=Boolean.getBoolean(request.getParameter("t4"));
		System.out.println("Servlet");
		System.out.println(""+insurancetype+""+description);
		try
		{
			InsuranceService in=new InsuranceServiceImpl();
			int check=(in.AddInsurance(insurancetype, description));
			System.out.println("check="+check);
			if(check==1)
			{
				System.out.println("inserted");
			}
			else
			{
				System.out.println("something is wrong");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	
	}

}
