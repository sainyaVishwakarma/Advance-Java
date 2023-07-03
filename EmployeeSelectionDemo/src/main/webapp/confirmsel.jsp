<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>It is confirmed that your project is selected successfully</h1>
<table border="2">
<tr>
<th>Emp no</th>
<th>Emp name</th>
<th>Deptno</th>
<th>salary</th>
</tr>
<c:forEach var="emp" items="${eset }">
<tr>
<td>${emp.empno }</td>
<td>${emp.ename }</td>
<td>${emp.deptno }</td>
<td>${emp.sal }</td>
</tr>
</c:forEach>
</table><br>
<a href="logout">Logout</a>
</body>
</html>