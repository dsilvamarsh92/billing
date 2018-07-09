<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<header>

	<div class="w3-container w3-teal"></div>
	<tiles:insertAttribute value="header"></tiles:insertAttribute>
</header>
<body>

	<tiles:insertAttribute value="body"></tiles:insertAttribute>

</body>

<footer>

	<tiles:insertAttribute value="footer">
	</tiles:insertAttribute>
</footer>
</html>