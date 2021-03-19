<%@page import="com.java.web.model.Alien"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to naveen DB</title>
</head>
<body bgcolor="pink">
<!--  -->
<%
   //Getting the data from controller by getAttribute by request object alien
	Alien a1 =(Alien) request.getAttribute("alien");
   //Printing the page
	out.println(a1);
%>

</body>
</html>