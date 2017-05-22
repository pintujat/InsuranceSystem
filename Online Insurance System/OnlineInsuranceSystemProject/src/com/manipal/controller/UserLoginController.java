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
 * Servlet implementation class UserLoginController
 */
//@WebServlet("/UserLoginController")
public class UserLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public UserLoginService Userloginservice;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		Userloginservice = new UserLoginServiceImpl();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		int user_id=Integer.parseInt(request.getParameter("User_id"));
		String user_pwd=request.getParameter("User_pwd");
	
		if (Userloginservice.UserLoginValidate(user_id, user_pwd) == 1) {
			HttpSession mysession=request.getSession();
			mysession.setAttribute("User_id", user_id);
			response.sendRedirect("UserHome.jsp");	
			/*RequestDispatcher rd=request.getRequestDispatcher("Userhome.jsp");
			rd.forward(request, response);*/
		}
		else
		{
			String error="User ID or Password is Invalid";
			response.sendRedirect("UserIssue.jsp?error="+error);	
		}
		
		
	}

}
