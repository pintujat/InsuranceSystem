package com.manipal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manipal.DAO.jdbc.*;
import com.manipal.model.*;
import com.manipal.service.*;
import com.manipal.service.impl.*;

/**
 * Servlet implementation class UpdateController
 */
//@WebServlet("/UpdateUserController")
public class UpdateUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public UserService userService;
	UserModel userModel;
 
    public UpdateUserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		 long userId=Long.parseLong(request.getParameter("can_id"));
		 System.out.println(userId);
		 String name=request.getParameter("t2");
		 String DOB=request.getParameter("t3");
		 String gender=request.getParameter("gen");
		 String panNo=request.getParameter("t5");
		 Double salary=Double.parseDouble(request.getParameter("t6"));
		 long mobNo=Long.parseLong(request.getParameter("t7"));
		 String nationality=request.getParameter("t8");
		 String password=request.getParameter("t9");
		 System.out.println("data set");
		 
		HttpSession session = request.getSession();
		//userService = new AgentServiceImpl();
		
		 int row=0;
			try {
				userService = new UserServiceImpl();
			
			
		userService.UpdateUser(userId, name, DOB, gender, panNo, salary, mobNo, nationality,password);
	       pw.println("User ?Updated......");
				//System.out.println(row);
				//UpdateCandidate(candidate_id, candidate_name, candidate_password, candidate_email_id, candidate_gender, candidate_dob, candidate_address, candidate_phone_no);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		/*	if(row==1)
			{
				response.sendRedirect("a.jsp");
			}
			else
			{
				//Redirection code to be added
			}*/
	}
		
		

	}

