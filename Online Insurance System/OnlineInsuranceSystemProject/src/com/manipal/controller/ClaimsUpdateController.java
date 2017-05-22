package com.manipal.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.model.ClaimsModel;
import com.manipal.service.*;
import com.manipal.service.impl.*;

/**
 * Servlet implementation class ClaimsUpdateController
 */
//@WebServlet("/ClaimsUpdateController")
public class ClaimsUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClaimsUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long claimid=Long.parseLong(request.getParameter("t1"));
		long policyid=Long.parseLong(request.getParameter("t2"));
		String claimdate=request.getParameter("t3");
		String Status="true";
		try
		{
			ClaimsModel claim=new ClaimsModel(claimid,policyid,claimdate,Status);
			ClaimsService c=new ClaimsServiceImpl();
			c.updateClaims(claim);
			System.out.println("claim updated");
			response.sendRedirect("ViewClaims.jsp");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
