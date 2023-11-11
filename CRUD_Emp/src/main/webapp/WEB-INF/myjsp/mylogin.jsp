<%@ page import="com.entity.EmployeeEntity" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <style>  
    .form-control {
      width: 300px; /* You can adjust the width to your preference */
      height: 40px; /* You can adjust the height to your preference */
      font-size: 14px; /* You can adjust the font size to your preference */
    }
    .cont {
      display: flex;
      justify-content: center;
      align-items: center;
      min-height: 80vh;
    }
    .container-form {
      background: #fff;
      padding: 20px;
      border: none; /* Remove the border */
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.2); /* Shadow effect */
    }
    body {
      background-image: url('https://plus.unsplash.com/premium_photo-1672280727393-ab6f0b26f527?q=80&w=1989&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D'); 
      background-size: cover;
      background-repeat: no-repeat;
      background-attachment: fixed;
      background-position: center;
    }
  </style>
  <link rel="icon" type="image/x-icon" href="img/icon.png">
  <title>Login Form</title>
</head>
<body style="background-color:#ceedcf">
<%@include file="nav1.jsp" %>
<div class="container p-2 my-2  cont">
<h1 class="text-center" style="color: white; font-weight: bold; text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);">CRUD-Employee: An Easy Way to Maintain Employee Details</h1>

  <div class="container-form">
  <h4 class="text-center"><b style="color:#243d9e">Login Account</b></h4>
    <form action="login" method="post">
      <div class="form-group">
        <label for="email">Email:</label>
        <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
      </div>
      <div class="form-group">
        <label for="password">Password:</label>
        <input type="password" class="form-control" id="password" placeholder="Enter password" name="password">
      </div>
    <div class="d-flex justify-content-center align-items-center">
    <button type="submit" class="btn btn-success mr-2">Login <i class="fas fa-user-edit ml-2"></i></button>
    <button type="reset" class="btn btn-danger ml-2">Clear <i class="fas fa-user-times ml-2"></i></button>
</div>
    </form>
  </div>
</div>
<h3 style="color:red;"><b>${mssg}</b></h3>
<div id="about" class="container-fluid bg-dark p-1">
<h4 class="my-3" style="color:white; text-align: center;"><b>CRUD-Employee</b></h4>
      <strong><p style="color:white; text-align: center;">© 2023 <a href="/">CRUD-Employee</a>. All Rights Reserved by CRUD-Employee</p></strong>
</div>
</body>
</html>
