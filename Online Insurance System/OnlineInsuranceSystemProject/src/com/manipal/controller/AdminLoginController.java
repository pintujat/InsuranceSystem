package com.manipal.controller;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manipal.service.*;
import com.manipal.service.impl.*;

/**
 * Servlet implementation class AdminLoginController
 */
//@WebServlet("/AdminLoginController")
public class AdminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public AdminLoginService adminloginservice;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		adminloginservice = new AdminLoginServiceImpl();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		int adm_id=Integer.parseInt(request.getParameter("admin_id"));
		String adm_pwd=request.getParameter("admin_pwd");
		System.out.println(adm_id);
		System.out.println(adm_pwd);
		if (adminloginservice.AdminLoginValidate(adm_id, adm_pwd) == 1) {
			HttpSession mysession=request.getSession();
			mysession.setAttribute("admin_id", adm_id);
			response.sendRedirect("AdminHome.jsp");	
			/*RequestDispatcher rd=request.getRequestDispatcher("adminhome.jsp");
			rd.forward(request, response);*/
		}
		else
		{
			String error="Admin ID or Password is Invalid";
			response.sendRedirect("AdminIssue.jsp?error="+error);	
		}
		
		
	}

}
