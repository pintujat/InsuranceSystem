package com.manipal.controller;

import java.io.IOException;
import java.io.PrintWriter;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.manipal.service.PaymentModeService;
import com.manipal.service.impl.PaymentModeServiceImpl;

/**
 * Servlet implementation class PolicyController
 */
//@WebServlet("/PolicyController")
public class PaymentModeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PaymentModeController() {
        super();
        // TODO Auto-generated constructor stub
    }
    

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
	
			response.setContentType("text/html");
			long policy_id= Long.parseLong(request.getParameter("t1"));
			/*long insurance_id= Long.parseLong(request.getParameter("t2"));
			String  policyholdername= request.getParameter("t3");
			 double coverage= Double.parseDouble(request.getParameter("t4"));
			double amount  = Double.parseDouble(request.getParameter("t5"));
			String 	policydate= request.getParameter("t6");
			long agentid=Long.parseLong(request.getParameter("t7"));
			long  userid=Long.parseLong(request.getParameter("t8"));*/
			
			/*try{
				PaymentModeService ps=new PaymentModeServiceImpl();
				int flag=ps.insertPolicy(policy_id);
				//HttpSession session=request.getSession();
				
				if(flag==1)
				{
				//	session.setAttribute("msg", "record added successfully");
					System.out.println("success");
				//	response.sendRedirect("");
				}
				else
				{*/
					//session.setAttribute("msg", "invalid");
				//	System.out.println("failed");
		/*			response.sendRedirect("policy.jsp");
				}
			}
		 catch (Exception e) {
			 System.out.println("catch controller");
				System.out.println(e.getMessage());*/

			response.sendRedirect("policy.jsp");
}}
