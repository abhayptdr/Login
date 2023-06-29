package com.LoginDemo.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.LoginDemo.Pojo.User;
import com.LoginDemo.UserDaoImp.UserDaoImpl;

@WebServlet("/register")
public class RegisteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uname=request.getParameter("txtuname");
		String upass=request.getParameter("uPass");
		
		User user=new User();
		user.setUsername(uname);
		user.setPassword(upass);

		UserDaoImpl Dao=new UserDaoImpl();
		if(Dao.addNewUser(user))
		{
			response.sendRedirect("login?msg=regsuccess");
		}
		else
		{
			response.sendRedirect("erroe?msg=regreeor");
		}
	}
}	
