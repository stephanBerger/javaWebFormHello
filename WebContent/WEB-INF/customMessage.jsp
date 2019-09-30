<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Custom Message</title>
</head>
<body>
	
	<h1 style="text-align: center;
    margin:30px 0px;
    text-shadow: 12px 8px 6px rgba(206,0,155,0.44);">
    <%=request.getAttribute("customMessage")%></h1>
	

</body>
</html>