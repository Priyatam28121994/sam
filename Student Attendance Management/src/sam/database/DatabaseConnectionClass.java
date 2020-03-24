package sam.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionClass {

		public Connection intializedatabase() throws ClassNotFoundException, SQLException{
			
				Class.forName("com.mysql.cj.jdbc.Driver");
				/*System.out.println("Connecting to database...");*/
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentattendance","root","root");
					
			
			return connection;
			
			// TODO Auto-generated method stub
		}


}
