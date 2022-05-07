<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Create account</title>
</head>
<body>

<form action="C_85_Add">
<div class="form-group row">
    <label for="username" class="col-sm-2 col-form-label" >Username</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" name="username">
    </div>
  </div>
  <div class="form-group row">
    <label for="password" class="col-sm-2 col-form-label" >Password</label>
    <div class="col-sm-3">
      <input type="password" class="form-control" name="password">
    </div>
  </div>
  <div class="form-group row">
    <label for="phoneno" class="col-sm-2 col-form-label" >Phone no</label>
    <div class="col-sm-3">
      <input type="phoneno" class="form-control" name="phoneno">
    </div>
  </div>
  <div class="form-group row">
    <label for="email" class="col-sm-2 col-form-label" >email</label>
    <div class="col-sm-3">
      <input type="email" class="form-control" name="email">
    </div>
  </div>
  <div class="form-group row">
    <label for="name" class="col-sm-2 col-form-label" >Name</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" name="name">
    </div>
  </div>
  <div class="form-group row">
    <label for="address" class="col-sm-2 col-form-label" >Address</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" name="address">
    </div>
  </div>
<input class="btn btn-primary" type="submit" value="Create account">
</form><br><br>
 <a class="btn btn-primary" data-toggle="collapse" href="login.jsp" role="button" aria-expanded="false" aria-controls="collapseExample">
    Already account Login
  </a>


</body>
</html>