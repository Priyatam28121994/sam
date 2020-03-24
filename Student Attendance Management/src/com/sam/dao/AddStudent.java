package com.sam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import sam.database.DatabaseConnectionClass;

public class AddStudent {
	 
	public boolean addstdmethod(String studentName, String registrationNumber,String courseName,String pwd){
		
		try {
			/*Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connecting to database...");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentattendance","root","root");*/
//			System.out.println(" database...");
			Connection con = new DatabaseConnectionClass().intializedatabase();
				PreparedStatement stmt = con.prepareStatement("insert into addstudent values(?,?,?,?)");
				stmt.setString(1, studentName);
				stmt.setString(2, registrationNumber);
				stmt.setString(3, courseName);
				stmt.setString(4, pwd);
				/*System.out.println("Total number of records inserted= "+stmt.executeUpdate());
				*/
		} catch (Exception e) { 
			
			e.printStackTrace();
			
		}
		return false;
	}

}
