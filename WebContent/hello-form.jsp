<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire</title>
</head>
<body>
	<form action="/Hello/form" method="post">
		<fieldset>
			<legend>Information personnel:</legend>
			First name:<br> <input type="text" name="firstname"><br>
			Last name:<br> <input type="text" name="lastname"><br>
			Time :<br> <input type="time" name="time"><br>
			 <input type="submit" value="Submit">
		</fieldset>
	</form>
</body>
</html>