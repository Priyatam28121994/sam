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
     <!--  <li class="nav-item">
        <a class="nav-link" href="attendance.jsp">Attendance</a>
      </li> -->
    </ul>
  </div>
</nav>
</div>
<form action="StudentLogin" method="post">
<h1 style="text-align:center;color:green;"> Student Login</h1> 
<table class="table table-bordered">
  <tbody>
    <tr>
      <td><!-- <div class="form-group">
    <label for="Logintype">Login Type</label>
    <select class="form-control" name="logintype">
      <option>Admin</option>
      <option>Teacher</option>
      <option>Student</option>
    </select>
  </div> -->
      <div class="form-group">
    <label for="Email">Registration Number</label>
    <input type="text" class="form-control" name="regno" placeholder="Enter Registration number">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" name="pwd" placeholder="Password">
  </div>
  <button type="submit" class="btn btn-primary">Submit</button></td></tr></tbody>
</table>
</form>
</div>
</body>
</html>