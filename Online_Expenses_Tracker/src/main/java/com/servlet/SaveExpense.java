package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ExpenseDao;
import com.db.Hibernate;
import com.entity.Expense;
import com.entity.User;


@WebServlet("/saveExpense")
public class SaveExpense extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String title=req.getParameter("title");
		String date=req.getParameter("date");
		String time=req.getParameter("time");
		String description=req.getParameter("description");
		String price=req.getParameter("price");
		
		
		HttpSession session=req.getSession();
		User user =(User) session.getAttribute("loginuser");
		
		Expense expense =new Expense(title, date, time, description, price, user);
		
		
		ExpenseDao expenseDao=new ExpenseDao(Hibernate.getSessionFactory());
		
		boolean f=expenseDao.saveExpense(expense);
		if(f) {
			session.setAttribute("msg", "Expense Add Successfully");
			//System.out.println("Register Successfully");
			resp.sendRedirect("user/add_expense.jsp");
			
		}else {
			session.setAttribute("msg", "Something Went Wrong");
			resp.sendRedirect("user/add_expense.jsp");

			//System.out.println("Something Went Wrong");
		}
		
		
		
	}
	
	

}
