<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="mytag" uri="/calculate"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String n1="40";
String n2="20";
%>

<h1>Welcome to custom tags</h1>
<mytag:mycalculate n1="<%=n1 %>" n2="<%=n2 %>"></mytag:mycalculate>
<mytag:myhello fname="sainya" lname="vishwakarma"></mytag:myhello>
</body>
</html>