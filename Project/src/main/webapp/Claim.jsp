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
<h4>Add a Claim</h4><br><br>
<form action="C_85_AddClaim">

  <div class="form-group row">
    <label for="claimdate" class="col-sm-2 col-form-label" >Date of claim </label>
    <div class="col-sm-3">
      <input type="text" class="form-control" name="claimdate">
    </div>
  </div>
  <div class="form-group row">
    <label for="description" class="col-sm-2 col-form-label" >Description</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" name="description">
    </div>
  </div>
    <div class="form-group row">
    <label for="username" class="col-sm-2 col-form-label" >Username</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" name="username">
    </div>
  </div>
    <div class="form-group row">
    <label for="serialno" class="col-sm-2 col-form-label" >Serialno</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" name="serialno">
    </div>
  </div>
	   <div class="form-group row">
    <label for="claimstatus" class="col-sm-2 col-form-label" >Claim status</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" name="claimstatus">
    </div>
  </div>
 


<input class="btn btn-primary" type="submit" value="Claim">
</form>
</body>
</html>