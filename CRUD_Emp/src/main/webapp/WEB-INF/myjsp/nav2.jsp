<nav class="navbar navbar-expand-sm navbar-dark bg-dark sticky-top">
  <a class="navbar-brand" href="home"><i class="fa-solid fa-building-circle-arrow-right"></i> Employee CRUD</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <ul class="navbar-nav">
  <li class="nav-item active">
        <a class="nav-link" href="home"><i class="fa-solid fa-house-chimney-user"></i> Home<span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="registration"><i class="fa-solid fa-square-plus"></i> Add Employees</a>
      </li>
    <li class="nav-item active">
      <a class="nav-link" href="showAll"><i class="fa-solid fa-user"></i> View Employee</a>
    </li>
    <li class="nav-item active">
      <a class="nav-link" href="showcomments"><i class="fa-solid fa-user"></i> View Comments</a>
    </li>
    <li class="nav-item active">
      <a class="nav-link" href="#about"><i class="fa-solid fa-address-card"></i> About</a>
    </li>
  </ul>
  <form class="form-inline my-2 my-lg-0 ml-auto"> 
   <a href="editadmin?adminId=${admin.adminId}" class="btn btn-warning text-white">Admin Profile</a>
    <a href="logout" class="btn btn-danger ml-2"><i class="fa-solid fa-user"></i> Logout</a>
</form>
</nav>