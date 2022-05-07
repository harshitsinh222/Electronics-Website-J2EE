<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Add a Claim</title>
</head>
<body>

<form action="C_85_availprod">

  <div class="form-group row">
    <label for="productname" class="col-sm-2 col-form-label" >Product name</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" name="productname">
    </div>
  </div>
  <div class="form-group row">
    <label for="model" class="col-sm-2 col-form-label" >Model</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" name="model">
    </div>
  </div>
<input class="btn btn-primary" type="submit" value="Add new product">
</form>
</body>
</html>