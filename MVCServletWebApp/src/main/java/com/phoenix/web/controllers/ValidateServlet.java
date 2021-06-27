package com.phoenix.web.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phoenix.web.models.LoginBean;


/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/ValidateS")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//getting the parameters from the HTML file
		String uname=request.getParameter("username");
		String password=request.getParameter("password");
				
		PrintWriter out= response.getWriter();
		
		//Instantiating the LoginBean
		LoginBean lgn=new LoginBean();
		request.setAttribute("ob", lgn);
		
		//setting the properties of LogicBean
		lgn.setUsername(uname);
		lgn.setPassword(password);
		
		//Invoking the business logic
		if(lgn.isValid()){
			RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
			rd.forward(request, response);
		}
		else {
			response.setContentType("text/html");
			out.println("<h2 style='color=red;'><b>Invalid</b> login</h2>");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
