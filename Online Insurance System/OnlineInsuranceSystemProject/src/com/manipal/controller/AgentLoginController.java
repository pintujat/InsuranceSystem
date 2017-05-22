package com.manipal.controller;



import java.io.IOException;



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
 * Servlet implementation class agentLoginController
 */
//@WebServlet("/AgentLoginController")
public class AgentLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public AgentLoginService agentloginservice;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgentLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		agentloginservice = new AgentLoginServiceImpl();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		int agent_id=Integer.parseInt(request.getParameter("agent_id"));
		String agent_pwd=request.getParameter("agent_pwd");
	
		if (agentloginservice.AgentLoginValidate(agent_id, agent_pwd) == 1) {
			HttpSession mysession=request.getSession();
			mysession.setAttribute("agent_id", agent_id);
			response.sendRedirect("AgentHome.jsp");	
			/*RequestDispatcher rd=request.getRequestDispatcher("agenthome.jsp");
			rd.forward(request, response);*/
		}
		else
		{
			String error="Agent ID or Password is Invalid";
			response.sendRedirect("AgentIssue.jsp?error="+error);	
		}
		
		
	}

}
