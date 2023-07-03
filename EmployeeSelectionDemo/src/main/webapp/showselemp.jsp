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
</table>
<br>
<a href="confirmsel.jsp">Confirm Selection</a>
<a href="departments">Select More</a>&nbsp;&nbsp;
<a href="logout">Logout</a>
</body>
</html>