package com.manipal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manipal.model.AgentModel;
import com.manipal.model.UserModel;
import com.manipal.service.AgentService;
import com.manipal.service.UserService;
import com.manipal.service.impl.AgentServiceImpl;
import com.manipal.service.impl.UserServiceImpl;

/**
 * Servlet implementation class AgentController
 */
//@WebServlet("/AgentController")
public class AgentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public AgentService userService;
	AgentModel user;    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgentController() {
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

		// long agentId=Long.parseLong(request.getParameter("agent_id"));
		 String name=request.getParameter("agent_name");
		 String DOB=request.getParameter("agent_dob");
		 String gender=request.getParameter("gen");
		 String panNo=request.getParameter("agent_panno");
		 Double salary=Double.parseDouble(request.getParameter("agent_salary"));
		 long mobNo=Long.parseLong(request.getParameter("agent_mob_no"));
		 String nationality=request.getParameter("Ind");
		 String password=request.getParameter("agent_pwd");
		 System.out.println("data set");
		 
		HttpSession session = request.getSession();
		userService = new AgentServiceImpl();
		 
		 try {
			 int check=userService.AddAgent(  name,  DOB,  gender, panNo,  salary,  mobNo,  nationality, password);
		if (check== 1) {
			System.out.println("Data Inserted");
			response.sendRedirect("AgentLogin.jsp");
			}
			else System.out.println("Data Not Inserted");
		pw.println("Data not inserted");
		

		
		 }
		
		catch (Exception e) {
			e.printStackTrace();
		}
	

	}

}
