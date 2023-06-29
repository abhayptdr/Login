package com.LoginDemo.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/error")
public class ErrorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String choice=request.getParameter("msg");
		String message="";
		String Pageurl="";
		
		switch(choice)
		{
		case "loginerror":
			message="invalid login Criedentials";
			Pageurl="Login.html";
			break;
			
		case "regerror":
			message="Regestration failed";
			Pageurl="Register.html";
			break;
		}
		pw.println("<p style=\"color:red;"
				+ "text-align:center\">"+message+"</p>");
		RequestDispatcher dispatcher = 
			request.getRequestDispatcher(Pageurl);
		dispatcher.include(request, response);
	}

}
