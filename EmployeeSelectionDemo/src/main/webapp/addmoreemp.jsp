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
<form action="saveselected" method="post">
<table border="2">
<tr>
<th>Employee no</th>
<th>Employee name</th>
<th> deptno</th>
<th> salary</th>
<th>Selection</th>
</tr>
<c:forEach var="emp" items="${elist}">
<tr>
<td>${emp.empno}</td>
<td>${emp.ename}</td>
<td>${emp.deptno}</td>
<td>${emp.sal}</td>
<td>
<input type="checkbox" name="sel" value="${emp.empno}:${emp.ename}:${emp.sal}">
</td>
</tr>
</c:forEach>
</table>
<input type="hidden" name="dept" value="${dept}">
<button type="submit" name="btn" value="add">Add selected</button>
</form>
</body>
</html>