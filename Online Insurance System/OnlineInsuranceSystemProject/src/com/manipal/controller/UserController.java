package com.manipal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manipal.model.UserModel;
import com.manipal.service.UserService;
import com.manipal.service.impl.UserServiceImpl;


//@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public UserService userService;
	UserModel user;

    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		HttpSession session = request.getSession();

	//	if (session.getAttribute("userId").toString().length() > 0) {
		//	System.out.println("session if");
			//
				 //long userId=Long.parseLong(request.getParameter("can_id"));
				 String name=request.getParameter("can_name");
				 String DOB=request.getParameter("can_dob");
				 String gender=request.getParameter("gen");
				 String panNo=request.getParameter("can_panNo");
				 Double salary=Double.parseDouble(request.getParameter("can_sal"));
				 long mobNo=Long.parseLong(request.getParameter("can_mob_no"));
				 String nationality=request.getParameter("Ind");
				 String password=request.getParameter("can_pwd");
				 System.out.println("data set");
				 
				// boolean status=true;
				
				 userService = new UserServiceImpl();
				 
				 try {
					 int check=userService.AddUser( name,  DOB,  gender, panNo,  salary,  mobNo,  nationality, password);
				if (check== 1) {
					System.out.println("Data Inserted");
					pw.println("<h1>User Registered Successfully</h1>");
					pw.println("<a href='UserLogin.jsp'>log in as user</a>");
					pw.println("");
					
					
					
					}
					else System.out.println("Data Not Inserted");
				
				 }
				
				catch (Exception e) {
					e.printStackTrace();
				}
			
	
	}
}
