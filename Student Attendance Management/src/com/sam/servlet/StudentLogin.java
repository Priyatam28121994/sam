package com.sam.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sam.dao.StudentLogindao;

import sam.admin.login.dao.LoginDao;


@WebServlet("/StudentLogin")
public class StudentLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String reg = request.getParameter("regno");
		String p = request.getParameter("pwd");
		//System.out.println(reg);
		
		StudentLogindao sdao = new StudentLogindao();
		if(sdao.login(reg, p))
			
		{
			
			HttpSession session = request.getSession();
			session.setAttribute("regno", reg);
			response.sendRedirect("studentProfile.jsp");
		}
		else {
			response.sendRedirect("studentlogin.jsp");
		}
	}

}
