<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
		<title>Update page</title>
		  <meta charset="utf-8">
		  <meta name="viewport" content="width=device-width, initial-scale=1">
		  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
		  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.slim.min.js"></script>
		  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
		  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>


<div class="container">

${messag }
  <h2 class="type-primary">update Form</h2>
  
  <form action="edit" method="post">
<img src="images/editimage.png" style="height:200px" "wide:200px">
    <div class="form-group">
      <label for="employeeid">EmployeeId:</label>
      <input type="hidden" class="form-control" placeholder="Enter emailid" value="${empDto.employeeId}" name="employeeId">
       </div >
      <label for="employeeName">EmployeeName:</label>
      <input type="text" class="form-control" placeholder="Enter employeeName" value="${empDto.employeeName}" name="employeeName">
    <div> 
     </div>
      <label for="emailId">EmailId:</label>
      <input type="text" class="form-control" placeholder="Enter emailId" value="${empDto.emailId}" name="emailId">
    <div>
     </div>
      <label for="password">Password:</label>
      <input type="text" class="form-control" placeholder="Enter password" value="${empDto.password}" name="password">
    <div>
     </div>
    
      <label for="salary">Salary:</label>
      <input type="text" class="form-control" placeholder="Enter salary" value="${empDto.salary}" name="salary">
    <div>
    <button type="submit" class="btn btn-primary">submit </button>
   
    
    </div>
</form>
</div>
</body>
</html>