package com.sam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import sam.database.DatabaseConnectionClass;

public class StudentLogindao {
	
	public boolean login(String regno, String pass){
		String sql = "select Reg_no,password from addstudent where Reg_no=? and password=?";
		try {
			
			Connection con = new DatabaseConnectionClass().intializedatabase();
			
			PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1, regno);
				stmt.setString(2, pass);
				
				ResultSet rs= stmt.executeQuery();
				if(rs.next())
				{
					
					return true;
				}
		} catch (Exception e) { 
			
			e.printStackTrace();
		}
		return false;

}
}
