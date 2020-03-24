package sam.admin.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import sam.database.DatabaseConnectionClass;

public class LoginDao 
{
	
	 
	public boolean login(String e_mail, String pass){
		String sql = "select * from login where  email=? and password=?";
		try {
			/*Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connecting to database...");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentattendance","root","root");
//			System.out.println(" database...");
 * 
*/	
			Connection con = new DatabaseConnectionClass().intializedatabase();
			
			PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1, e_mail);
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
