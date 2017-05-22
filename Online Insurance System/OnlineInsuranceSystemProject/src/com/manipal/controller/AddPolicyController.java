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
 * Servlet implementation class PolicyController
 */
//@WebServlet("/AddPolicyController")
public class AddPolicyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AddPolicyController() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
	
			response.setContentType("text/html");
			//long policy_id= Long.parseLong(request.getParameter("policy_id"));
			long insurance_id= Long.parseLong(request.getParameter("insurance_id"));
			String  policyholdername= request.getParameter("policy_holder_name");
			 double coverage= Double.parseDouble(request.getParameter("policy_coverage"));
			double amount  = Double.parseDouble(request.getParameter("policy_amount"));
			String 	policydate= request.getParameter("policy_date");
			long agentid=Long.parseLong(request.getParameter("agent_id"));
			long  userid=Long.parseLong(request.getParameter("user_id"));
			
			try{
				PolicyService ps=new PolicyServiceImpl();
				int flag=ps.insertPolicy(insurance_id, policyholdername, coverage, amount, policydate, agentid, userid);
				//HttpSession session=request.getSession();
				
				if(flag==1)
				{
				//	session.setAttribute("msg", "record added successfully");
					System.out.println("success");
					pw.println("<h1> Policy added </h1>");
					pw.println("<a href='AdminHome'>go to home</a>");
				//	response.sendRedirect("");
				}
				else
				{
					//session.setAttribute("msg", "invalid");
					System.out.println("failed");
					//response.sendRedirect("policy.jsp");
				}
			}
		 catch (Exception e) {
			 System.out.println("catch controller");
				System.out.println(e.getMessage());

}}}
