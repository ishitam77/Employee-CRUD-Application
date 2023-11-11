<%@ page import="com.entity.EmployeeEntity" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>ContactUs</title>
<meta name="viewport" content="width=device-width", initial-scaled="1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<style>
.form-control {
  width: 500px;
  height: 40px;
  font-size: 14px;
}

.cont {
  display: flex;
  justify-content: center;
  align-items: center;
}

h1 {
  color: #243d9e;
  font-weight: bold;
  text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
}

.container-form {
  background: #fff;
  padding: 20px;
  border: 2px solid #007bff; /* Sharpen the border of the form */
 border: none; /* Remove the border */
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.2); /* Shadow effect */
}
 body {
      background-image: url('https://media.istockphoto.com/id/1049658692/photo/contact-us.jpg?s=2048x2048&w=is&k=20&c=ZZugfmxgAX1Y7qhnB8cJV5U3xJbc3w26pnl0vqnCY5c='); 
      background-size: cover;
      background-repeat: no-repeat;
      background-attachment: fixed;
      background-position: center;
    }

</style>
</head>
<body style="background-color:#ceedcf">
<%@include file="nav1.jsp" %>
<h1 class="text-center" style="color: white; font-weight: bold; text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);">CRUD-Employee: An Easy Way to Maintain Employee Details</h1>
<div class="container p-3 my-3 cont"> <!-- Add "container-form" class to the form container -->
<div class="container-form">
 <h4 class="text-center"><b style="color:#243d9e">Contact Us</b></h4>
<form action="contactus" method="post">
	<div class="form-group">
    <label>Name : </label>
    <input type="text" class="form-control" placeholder="Enter Your Name" name="contactName">
  </div>	
  <div class="form-group">
    <label>Email address:</label>
    <input type="text" class="form-control" placeholder="Enter Email" name="contactEmailId">
  </div>
  <div class="form-group">
    <label>Message: </label>
    <textarea class="form-control" name="message" placeholder="Enter Your Message" rows="3"></textarea>
  </div>			
   <div class="d-flex justify-content-center align-items-center">
    <button type="submit" class="btn btn-success mr-2">Submit <i class="fas fa-user-edit ml-2"></i></button>
    <button type="reset" class="btn btn-danger ml-2">Clear <i class="fas fa-user-times ml-2"></i></button>
</div>
  <h2 style="color: green;">${mssg}</h2>
</form>
</div>
</div>
<div id="about" class="container-fluid bg-dark p-1">
<h4 class="my-3" style="color:white; text-align: center;"><b>CRUD-Employee</b></h4>
      <strong><p style="color:white; text-align: center;">© 2023 <a href="/">CRUD-Employee</a>. All Rights Reserved by CRUD-Employee</p></strong>
</div>
</body>
</html>
