
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
input[type=text] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=email] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}


input[type=reset] {
  width: 50%;
  background-color: red;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}


input[type=submit] {
  width: 50%;
  background-color: red;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
  margin: 2% 25%;
}

.form__buttons{
	display: flex;
    flex-direction: row;
    gap: 20px;
}


</style>
<body>

<h1><center>User Register<center></h1>

<div>
  <form action="RegisterServlet" method="post" >
    <label for="fname">Enter Name</label>
    <input type="text" id="fname" name="name" placeholder="Entername" required>

    <label for="password">Enter Password</label>
    <input type="password" id="lname" name="pass" placeholder="Enter password"  required>
    
    <label for="email">Enter Email:</label>
    <input type="email" name="email" placeholder="Enter email" required><br>
    
    Have an account already?<a href="login.jsp">Login</a>
    

    
    <div class="form__buttons">
    	<input type="reset">
        <input type="submit" value="Register">
    </div>

    
  </form>
</div>

</body>
</html>

