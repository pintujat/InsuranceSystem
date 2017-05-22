package com.manipal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.service.PolicyService;
import com.manipal.service.impl.PolicyServiceImpl;

/**
 * Servlet implementation class DeletePolicyController
 */
//@WebServlet("/PolicyDeleteController")
public class DeletePolicyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePolicyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		long policyId= Long.parseLong(request.getParameter("t1"));
		try
		{
			PolicyServiceImpl p=new PolicyServiceImpl();
			p.deletePolicy(policyId);
			
		
	
	}
 catch (Exception e) {
	 System.out.println("catch controller");
		System.out.println(e.getMessage());
	}
System.out.println("done");
}}
