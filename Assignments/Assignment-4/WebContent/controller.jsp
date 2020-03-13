<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- This will make values null after 10 seconds -->
	<%
	session.setMaxInactiveInterval(10);
	%>
	<!-- com.cts.training.day31.LoginBean ref = new LoginBean()	i.e. we are creating the object of our package -->
	<jsp:useBean id="ref" class="com.cts.training.day31.LoginBean" scope="application">
	</jsp:useBean>

	<!-- ref.setUserName(request.getParameter("userName")); -->
	<%-- <jsp:setProperty property="userName" name="ref"/>	
	<jsp:setProperty property="password" name="ref"/> --%>
	
	<!-- we use * to select all properties at once i.e. to reduce number of lines of code -->
	<jsp:setProperty property="*" name="ref"/>	
	
	<jsp:forward page="view.jsp"></jsp:forward>
</body>
</html>