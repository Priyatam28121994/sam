<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<div class="container">
<h1>Students Attendance Management System</h1>
<div>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="profile.jsp">Student Profile</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="studentlogin.jsp">Attendance</a>
      </li>
    </ul>
  </div>
</nav>
</div>
<div style="    margin-top: 200px;
    margin-right: 200px;
    margin-left: 200px;">
<table align="center">
<tbody>
<tr>
<td> <a href="adminlogin.jsp" class="btn btn-info btn-lg" role="button">Admin Login</a></td>
 <td><a href="studentlogin.jsp" class="btn btn-info btn-lg" role="button">Student Login</a></td>
 </tr>
 </tbody>
</table>
</div>
</div>
</body>
</html>