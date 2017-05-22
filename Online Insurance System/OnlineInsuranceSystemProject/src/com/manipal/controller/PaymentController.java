package com.manipal.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manipal.service.paymentService;
import com.manipal.service.impl.paymentServiceImpl;

/**
 * Servlet implementation class PaymentController
 */
//@WebServlet("/PaymentController")
public class PaymentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String cardNo=request.getParameter("cardNo");
		String cvv=request.getParameter("cvv");
		//Long paymentId=Long.parseLong(request.getParameter("paymentId"));
		Long policyId=Long.parseLong(request.getParameter("policy_id"));
		
		String paymentDate=request.getParameter("paymentDate");
		Double amount=Double.parseDouble(request.getParameter("amount"));
		String paymentmode=request.getParameter("paymentmode");
		String status=request.getParameter("status");
		
		//String customerId=request.getParameter("customerId");
		
		//HttpSession session=request.getSession();

		

	
		paymentService payservice=new paymentServiceImpl();
		
	boolean flag=payservice.updatepayment(policyId,paymentDate,amount,paymentmode,status) && cardNo.length()==15 && cvv.length()==3;
		
 
		if(flag)
		{
			System.out.println("payment unsuccessful.......please try again");
			response.getWriter().println("payment unsuccessful.......please try again");
		}
		else{
			

			System.out.println("payment is successful");
			response.getWriter().println("payment successful");
			response.sendRedirect("ViewPolicyAgentUser.jsp");
		}
	}

}
