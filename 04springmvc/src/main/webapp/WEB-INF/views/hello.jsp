<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello and welcome to Spring MVC!!</h1>
	
	<%
		Integer id = (Integer) request.getAttribute("id");
		String name = (String) request.getAttribute("name");
		Integer salary = (Integer) request.getAttribute("salary");
		out.println("Id: " + id);
		out.println("| Name: " + name);
		out.println("| Salary: " + salary);
	%>
	
	<br/><br/>
	
	${id} | ${name} | ${salary}
	
</body>
</html>