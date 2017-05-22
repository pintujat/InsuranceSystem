package com.manipal.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.model.ClaimsModel;
import com.manipal.service.ClaimsService;
import com.manipal.service.impl.*;

/**
 * Servlet implementation class ClaimsDeleteController
 */
//@WebServlet("/ClaimsDeleteController")
public class ClaimsDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClaimsDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long claimid=Long.parseLong(request.getParameter("t1"));
		try
		{
			ClaimsModel claim=new ClaimsModel();
			claim.setClaimid(claimid);
			ClaimsService obj=new ClaimsServiceImpl();
			obj.deleteClaim(claim);
			System.out.println("claim deleted");
			
			response.sendRedirect("ViewClaims.jsp");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
