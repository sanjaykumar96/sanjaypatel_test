<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>From view.jsp page</h1>
	<jsp:useBean id="ref" class="com.cts.training.day31.LoginBean" scope="application">
	</jsp:useBean>
	
	<jsp:getProperty property="userName" name="ref" />
	<jsp:getProperty property="password" name="ref" />
	
	<!-- This is not possible in getProperty since it returns multiple values so we will encounter an error -->
	<%-- <jsp:getProperty property="*" name="ref" /> --%>
	<a href="Logout.jsp">Logout</a>
</body>
</html>