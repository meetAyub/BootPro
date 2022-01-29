<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Management</title>
</head>
<body>

<h3> WELCOME </h3>
<style>h3 {text-align: center;}</style>

</style>
<h4>Enter The Details : </h4>
<form  action=" insert"  method="post">
<h4>Enter Id :</h4> <input type="text"  name=ID><br>
<h4>Enter Name :</h4> <input type="text"  name=NAME>
<h4>Enter Age : </h4> <input type="text"  name=AGE>
<style> .button1 {background-color:rgb(240, 240, 240);}</style>
<button class="button button1">Save</button>
<h5>${entity}</h5>
</form>

<h4> Enter The View Id :</h4>
<form action="view">
<input type="text" name=ID >
<style> .button1 {background-color:rgb(240, 240, 240);}</style>
<button class="button button1">View</button><br>
</form>
<body style="background-color:LightSkyBlue ;">

<form action="view1">
<h4>Enter The Delete Id :</h4> <input type="text" name=ID >
<style> .button1 {background-color:rgb(240, 240, 240);}</style>
<button class="button button1">Delete</button>
</form>
<h4>Enter The Update Id  :</h4>
<form action="view2">
<input type="text"  name=ID>
<style> .button1 {background-color:rgb(240, 240, 240);}</style>
<button class="button button1">Update</button>
</form>
<form action="all">
<h4>AllData :</h4>
<style> .AllData {background-color:rgb(240, 240, 240);}</style>
<button class="button AllData">AllData</button>
</form>

</body>
</html>