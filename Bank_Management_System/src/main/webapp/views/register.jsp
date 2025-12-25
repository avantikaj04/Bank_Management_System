<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Registration</h1>
<form action="submit">

<label for="no">Enter account number</label>
<input type="number" name="accno" id="no"><br><br>
<label for="an">Enter account holder name</label>
<input type="text" name="name" id="an"><br><br>

<label for="an">Enter account holder's age</label><br><br>
<input type="number" name="age" id="an"><br><br>

<label for="e">Enter email</label><br><br>
<input type="email" name="email" id="e"><br><br>

<label for="b">Enter inital balance</label><br><br>
<input type="number" name="balance" id="b"><br><br>

<input type="submit" value="submit" >


</form>
</body>
</html>