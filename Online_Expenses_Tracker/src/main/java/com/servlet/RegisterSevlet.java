package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.db.Hibernate;
import com.entity.User;

import antlr.debug.NewLineEvent;

@WebServlet("/userRegister")
public class RegisterSevlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String  fullName=req.getParameter("fullName");
		String email =req.getParameter("email");
		String password = req.getParameter("password");
		String about=req.getParameter("about");
		
		User u = new User(fullName, email, password, about);
		//System.out.println(u);
		HttpSession session= req.getSession();
		
		UserDao userDao = new UserDao(Hibernate.getSessionFactory());
		boolean f=userDao.saveuser(u);
		if(f) {
			session.setAttribute("msg", "Register Successfully");
			//System.out.println("Register Successfully");
			resp.sendRedirect("Register.jsp");
			
		}else {
			session.setAttribute("msg", "Something Went Wrong");
			resp.sendRedirect("Register.jsp");

			//System.out.println("Something Went Wrong");
		}
		
	}

}
