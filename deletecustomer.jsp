 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
 
  <title>delete user of bank</title>
	<link rel="stylesheet" href="css/regi.css">
	<style type="text/css">
	
		body{
		  background-image: url(img/7.jpg);
		  background-attachment: fixed;
		  background-size: cover;
		  background-repeat: no-repeat;
		  padding: 0 10px;
       }
	
	</style>
</head>
<body>

  <%
    String id = request.getParameter("id");
    String fname = request.getParameter("fname");
    String lname = request.getParameter("lname");
    String birthDate = request.getParameter("birth");
    String mobile = request.getParameter("mobile");
    String nic = request.getParameter("nic");
    String email = request.getParameter("email");
    String userName = request.getParameter("uname");
    String password = request.getParameter("pass");
  %>

  
<form action="delete" method="post">

<div class="wrapper">
    <div class="title">
      Customer Account Delete
    </div>
    <div class="form">
    
      <div class="inputfield">
          <label>ID</label>
          <input type="text" class="input" name="cusid" value="<%= id %>" readonly>
       </div> 
       
      <div class="inputfield">
          <label>First Name</label>
          <input type="text" class="input" name="fname" value="<%= fname %>" readonly>
       </div> 
       <div class="inputfield">
          <label>Last Name</label>
          <input type="text" class="input" name="lname" value="<%= lname %>" readonly>
       </div>  
        <div class="inputfield">
          <label>Birth date</label>
          <input type="date" class="input" name="birth" value="<%= birthDate %>" readonly>
       </div>  
       <div class="inputfield">
          <label>Mobile Number</label>
          <input type="text" class="input" name="mobile" value="<%= mobile %>" readonly>
       </div>  
      <div class="inputfield">
          <label>Nic of User</label>
          <input type="text" class="input" name="nic" value="<%= nic %>" readonly>
       </div> 
        <div class="inputfield">
          <label>E-mail Address</label>
          <input type="email" class="input" name="email" value="<%= email %>" readonly>
       </div> 
        <div class="inputfield">
          <label>Username</label>
          <input type="text" class="input" name="username" value="<%= userName %>" readonly>
       </div> 
      <div class="inputfield">
          <label>Password</label>
          <input type="password" class="input" name="password" value="<%= password %>" readonly>
       </div> 
     
      <div class="inputfield">
        <input type="submit" value="Delete My Account" class="btn" name="submit">
      </div>
    </div>
</div>  

</form>

</body>
</html>






