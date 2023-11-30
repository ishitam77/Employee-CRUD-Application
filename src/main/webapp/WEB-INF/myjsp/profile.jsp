<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
    .form-control[readonly] {
    box-shadow: 0 0 5px rgba(0, 0, 0, 0.2);
}
        .form-control {
            width: 500px; /* You can adjust the width to your preference */
            height: 40px; /* You can adjust the height to your preference */
            font-size: 14px; /* You can adjust the font size to your preference */
        }

        .cont {
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .page-title {
      text-align: center;
      color: #243d9e;
      font-weight: bold;
      text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
    }
    .container-form {
  background: #fff;
  padding: 20px;
 border: none; /* Remove the border */
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.2); /* Shadow effect */
}
 body {
      background-image: url('https://thumbs.dreamstime.com/b/blue-print-8821299.jpg'); 
      background-size: cover;
      background-repeat: no-repeat;
      background-attachment: fixed;
      background-position: center;
    }
    </style>
    <title>Edit Admin Page</title>
</head>
<body style="background-color:#ceedcf">
<%@include file="nav2.jsp" %>
<h1 class="text-center" style="color: white; font-weight: bold; text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);">CRUD-Employee: An Easy Way to Maintain Employee Details</h1>
<div class="container p-3 my-3  cont"> <!-- Add "container-form" class to the form container -->
<div class="container-form">
 <h2 style="color: green;" class="text-center page-title">Edit Admin Record!!</h2>
    <form action="updateadmin" method="post">
        <div class="form-group">
            <label for="employeeName">Id:</label>
            <input type="text" name="employeeId" value="${admin.adminId}" readonly>
        </div>
        <div class="form-group">
            <label for="employeeName">Name:</label>
            <input type="text" class="form-control" id="adminName" name="name" value="${admin.name}">
        </div>
        
        <div class="form-group">
            <label for="emailId">Email address:</label>
            <input type="text" class="form-control" id="emailId" name="emailId" value="${admin.emailId}">
        </div>
        <div class="form-group">
            <label for="password">Password:</label>
            <input type="text" class="form-control" id="password" name="password" value="${admin.password}">
        </div>
        <div class="d-flex justify-content-center align-items-center">
     <button type="submit" class="btn btn-success mr-2">Save Changes <i class="fas fa-user-edit ml-2"></i></button>
      <button type="reset" class="btn btn-warning ml-2">Reverse <i class="fas fa-user-times ml-2"></i></button>
     <a href="deleteadmin?adminId=${admin.adminId}" class="btn btn-danger ml-2"><i class="fas fa-user-times ml-2"></i> Delete</a>
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
