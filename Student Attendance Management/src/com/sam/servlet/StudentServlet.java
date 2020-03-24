package com.sam.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sam.database.DatabaseConnectionClass;


@WebServlet("/Student")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		
		/*String regno = request.getParameter("regno");
		String stdname = request.getParameter("name");
		String course = request.getParameter("course");
		
		AddStudent addstd = new AddStudent();*/
		try {
			
			Connection con = new DatabaseConnectionClass().intializedatabase();
			
			PreparedStatement pstmt = con.prepareStatement("insert into addstudent values(?, ?, ?,?)"); 
			pstmt.setString(1, request.getParameter("name"));
			pstmt.setString(2, request.getParameter("regno")); 
			pstmt.setString(3, request.getParameter("course"));
			pstmt.setString(4, request.getParameter("pwd"));
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		
	
	}
		
	}


