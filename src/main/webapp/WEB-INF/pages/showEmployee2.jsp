<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>show all page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
${mess}
<h1>Yoy are Successfully login</h1>

<div class="container">
  
  <table class="table table-hover">
    <thead>
      <tr bgcolor="yellow"> 
        <th>EmployeeId</th>
        <th>EmployeeName</th>
         <th>EmailId</th>
          <th>Password</th>
          <th>Salary</th>
           <th colspan="2">Action(Delete/Edit)</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="employeeDto" items="${allEmployee}">
      <tr bgcolor="pink">
        <td>${employeeDto.employeeId}</td>
        <td>${employeeDto.employeeName}</td>
         <td>${employeeDto.emailId}</td>
         <td>${employeeDto.password }</td>
         <td>${employeeDto.salary}</td>
         <td><a href="deleteEmployee?employeeId=${employeeDto.employeeId }"><button type="button" class="btn btn-danger"><img src="images/deleteimage.png" alt="delete image" style="height:40px"></button></a></td>
        <td><a href="updateEmployee?employeeId=${employeeDto.employeeId }"><button type="button" class="btn btn-warning"><img src="images/editimage.png" alt="edit image" style="height:40px"></button></a></td>

      </tr>
      </c:forEach>
    </tbody>
  </table>

</div>


</body>
</html>