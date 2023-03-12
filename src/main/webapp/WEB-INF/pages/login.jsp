<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
		<title>login</title>
		  <meta charset="utf-8">
		  <meta name="viewport" content="width=device-width, initial-scale=1">
		  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
		  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.slim.min.js"></script>
		  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
		  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>


<div class="container">

${msg }
  <h2>Login Form</h2>
  
  <form action="lgn" method="post">
  <img src="images/rabin.jpg" style="height:200px" >
    <div class="form-group">
      <label for="emailid">EmailId:</label>
      <input type="text" class="form-control" placeholder="Enter emailid" name="emailId">
       </div>
      <label for="password">Password:</label>
      <input type="text" class="form-control" placeholder="Enter password" name="password">
    <div> 
    <button type="submit" class="btn btn-primary">submit </button>
      <button type="reset" class="btn btn-primary">reset </button>
    <a href="registration" button type="signup" class="btn btn-primary">SignUp </button>
    </div>
</form>
</div>
</body>
</html>