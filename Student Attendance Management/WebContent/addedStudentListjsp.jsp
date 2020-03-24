<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="sam.database.DatabaseConnectionClass" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
    <th>Student Name</th>
    <th>Registration Number</th>
    <th>Course Name</th>
    <th>Password</th>
</tr>
<%
try{
	
	Connection con = new DatabaseConnectionClass().intializedatabase();
	String query = "select * from addstudent";
	
	PreparedStatement pstmt = con.prepareStatement(query);
	ResultSet rs = pstmt.executeQuery();/* System.out.println(rs); */
	while(rs.next()){
		
%>

<tr>
    <td><%= rs.getString(1) %></td>
    <td><%= rs.getString(2) %></td>
    <td><%= rs.getString(3) %></td>
    <td><%= rs.getString(4) %></td>
  </tr>

		<%
	}
	
	
}
catch(Exception e){}

%>
</table>
</body>
</html>