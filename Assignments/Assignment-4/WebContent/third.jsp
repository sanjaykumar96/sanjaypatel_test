<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- To automatically refresh after 12 seconds -->
	<%
	response.setIntHeader("REFRESH", 12);
	%>
	<h1>From third.jsp page</h1>
	<jsp:useBean id="ref" class="com.cts.training.day31.LoginBean" scope="application">
	</jsp:useBean>
	
	<jsp:getProperty property="userName" name="ref" />
	<jsp:getProperty property="password" name="ref" />
</body>
</html>