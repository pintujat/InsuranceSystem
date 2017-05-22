package com.manipal.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.service.ClaimsService;
import com.manipal.service.impl.ClaimsServiceImpl;

/**
 * Servlet implementation class ClaimsController
 */
//@WebServlet("/ClaimsController")
public class ClaimsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	            doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in controller");
		//long claimid=Long.parseLong(request.getParameter("t1"));
		long policyid=Long.parseLong(request.getParameter("t2"));
		String claimdate=request.getParameter("t3");
		String status=request.getParameter("t4");
		
		try
		{
			System.out.println("in try");
			
			ClaimsService claimservice=new ClaimsServiceImpl();
			
			int check=(claimservice.AddClaim( policyid, claimdate));
			
			if(check==1){
				System.out.println("data inserted successfully.....");
				
				response.sendRedirect("UserHome.jsp");
			}
			else
			{
				System.out.println("something went wrong... insert again..");
			}
			
			
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}

}
