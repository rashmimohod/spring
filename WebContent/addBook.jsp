<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/css/login1.css" rel="stylesheet" type="text/css">
</head>
<body>
	<form action="addBook">
	
			Book Id<input type="text" name="bookId"><br> 
			Book Name<input type="text" name="bookName"><br> 
			Book Auth<input type="text" name="bookAuth"><br> 
			Book Pub<input type="text" name="bookPub"><br> 
			Email Id<input type="text" name="email"><br> 
			
			 <input type="submit" value="ADD THE BOOK"><br>
	</form>
</body>
</html>