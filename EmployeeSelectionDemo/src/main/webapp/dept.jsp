<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addmoreemp" method="get">
<select name="dept">
<c:forEach var="dept" items="${dlist}">
<option value="${dept.deptno}">${dept.dname}</option>
</c:forEach>
<option></option>
</select>
<br><br>
<button type="submit" name="btn" value="btn">Add More Employee</button>
</form>
<a href="showselemp.jsp">Show selected</a>
<a href="logout">Logout</a>
</body>
</html>