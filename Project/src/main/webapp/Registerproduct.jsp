<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register a Product</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<form action="C_85_AddProduct">
<div class="form-group row">
    <label for="username" class="col-sm-2 col-form-label" >Username </label>
    <div class="col-sm-3">
      <input type="text" class="form-control" name="username">
    </div>
  </div>
  <div class="form-group row">
    <label for="productname" class="col-sm-2 col-form-label" >Product name</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" name="productname">
    </div>
  </div>
  <div class="form-group row">
    <label for="serialno" class="col-sm-2 col-form-label" >Serial no</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" name="serialno">
    </div>
  </div>
  <div class="form-group row">
    <label for="purchasedate" class="col-sm-2 col-form-label" >Purchase date </label>
    <div class="col-sm-3">
      <input type="text" class="form-control" name="purchasedate">
    </div>
  </div>

<input class="btn btn-primary" type="submit" value="Register a product">

</form>
</body>
</html>