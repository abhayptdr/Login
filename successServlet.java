package com.LoginDemo.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/successServlet")
public class successServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("tect/html");
		PrintWriter pw=response.getWriter();
		
		String param = request.getParameter("msg");
		String message = "";
		String pageUrl = "";
		
		switch(param) {
		case "regsuccess":
			message = "registration successful";
			pageUrl = "login.html";
			break;
		}
		
		pw.println("<p style=\"color:green;"
				+ "text-align:center\">"+message+"</p>");
		RequestDispatcher dispatcher = 
			request.getRequestDispatcher(pageUrl);
		dispatcher.include(request, response);
	}

}
