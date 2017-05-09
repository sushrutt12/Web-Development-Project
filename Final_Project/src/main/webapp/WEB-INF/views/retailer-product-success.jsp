<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>product Created Successfully</title>
</head>
<body>
	<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<nav class="navbar navbar-default" style="background-color:#0F1B4F;">
<a href="${contextPath}/user/retailer.htm" class="btn btn-success btn-lg">Home</a><br/>
</nav>

<div style="background-color:#4BC6FE" class="container">
<center>

	<h2>Product Posted Successfully: ${product.title}</h2>
	</center></div>
</body>
</html>