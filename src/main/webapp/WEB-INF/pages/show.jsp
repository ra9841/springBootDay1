<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>second page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
<marquee><h1 class="text-danger">You are Successfully login</h1></marquee>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <ul class="navbar-nav">
    <li class="nav-item active">
      <a class="nav-link" href="#">Home</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="login">login</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="registration">registration</a>
    </li>
    <li class="nav-item">
      <a class="nav-link disabled" href="updateEmployee">update</a>
    </li>
  </ul>
</nav>
<div class="container">
  
  <table class="table table-hover">
    <thead>
      <tr bgcolor="yellow"> 
        <th>EmployeeId</th>
        <th>EmployeeName</th>
         <th>EmailId</th>
          <th>Password</th>
           <th>Salary</th>
      </tr>
    </thead>
    <tbody>
      <tr bgcolor="pink">
        <td>${employee.employeeId}</td>
        <td>${employee.employeeName}</td>
         <td>${employee.emailId}</td>
         <td>${employee.password }</td>
          <td>${employee.salary}</td>
      </tr>
    </tbody>
  </table>
  <a href="showEmployee2"> <button type="button" class=btn btn-primary">show all records</button></a>
</div>


</body>
</html>