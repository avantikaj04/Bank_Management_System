<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>To Withdraw money add following</h2>
<form action="withdrawsubmit">
<label for="un">Enter account no.</label><br><br>
<input type="number" name="number" id="un"><br><br>

<label for="d">Enter amount to withdraw</label><br><br>
<input type="number" name="amount" id="d">

<input type="submit" value="Submit">
</form>
</body>
</html>