<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
  <title>Employee Details</title>
  <style>
    body {
      background-color: #ceedcf;
    }

    .navbar {
      background-color: #343a40;
    }

    .navbar a {
      color: white;
    }

    .navbar a:hover {
      color: #007bff;
    }

    .page-title {
      text-align: center;
      color: #243d9e;
      font-weight: bold;
      text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
    }

   .table-container {
    display: flex;
    flex-direction: column; /* Stack the children vertically */
    align-items: center; /* Center items horizontally */
    justify-content: center; /* Center items vertically */
    min-height: 60vh;
    padding: 0 50px; /* Add padding to create space on the left and right */
  }
    .table {
      background: white;
      padding: 20px;
      border: 2px solid #007bff;
      border-radius: 20px;
      box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
    }
    body {
      background-image: url('https://media.istockphoto.com/id/466004357/photo/ink-fingerprint-on-paper-05.jpg?s=2048x2048&w=is&k=20&c=1LrpMaj9KEYK0b4cERPaCRTR4yKuhs3rZwhbAbsD7e0='); 
      background-size: cover;
      background-repeat: no-repeat;
      background-attachment: fixed;
      background-position: center;
    }
  </style>
</head>
<body style="background-color:#ceedcf">
<%@include file="nav2.jsp" %>
<h1 class="text-center" style="color: white; font-weight: bold; text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);">CRUD-Employee: An Easy Way to Maintain Employee Details</h1>
<h1 style="color: white;" class="text-center page-title">Employee Record!!</h1>
<div class="container justify-content-center">
  <div class="row">
    <c:forEach items="${listOfEmployees}" var="employee" varStatus="loop">
      <div class="col-md-4 mb-3">
        <div class="card" style="max-width: 18rem;">
          <div class="card-header"> <b style="color:#243d9e">${employee.employeeName}</b></div>
          <div class="card-body">
            <h5 class="card-title"><b>Employee ID: ${employee.employeeId}</b></h5>
            <p class="card-text">
            
              <strong>Email:</strong> ${employee.emailId} <br>
              <strong>Address/Location:</strong> ${employee.address} <br>
              <strong>Phone:</strong> ${employee.phone} <br>
              <strong>Salary:</strong> ${employee.salary}<br>
              <strong>Role:</strong> <b style="color:red;">${employee.designation}</b> <br>

            </p>
            <div class="text-center">
              <a href="editEmployee?employeeId=${employee.employeeId}" class="btn btn-success"><i class="fas fa-user-edit ml-2"></i> Edit</a>
              <a href="deleteEmployee?employeeId=${employee.employeeId}" class="btn btn-danger"><i class="fas fa-user-times ml-2"></i> Delete</a>
            </div>
          </div>
        </div>
      </div>
      <c:if test="${loop.index % 3 == 2 or loop.last}">
        </div>
        <c:if test="${not loop.last}">
          <div class="row">
        </c:if>
      </c:if>
    </c:forEach>
  </div>
</div>


<div id="about" class="container-fluid bg-dark p-1">
<h4 class="my-3" style="color:white; text-align: center;"><b>CRUD-Employee</b></h4>
      <strong><p style="color:white; text-align: center;">© 2023 <a href="/">CRUD-Employee</a>. All Rights Reserved by CRUD-Employee</p></strong>
</div>
</body>
</html>
