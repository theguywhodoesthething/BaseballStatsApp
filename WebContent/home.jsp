<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>2016 MLB Stats</title>
</head>
<h1>2016 Major League Baseball Statistics</h1>
<body>
	<form action="getteambyname.do" method="POST">
		Team: <input type="text" name="name" /> <input type="submit"
			value="Search" />
	</form>
	<a href="addteam.html">Add new Team</a><br>
	<c:forEach var="team" items="${teams}">
		<img src="${team.picturePath}">
		<a href="retrieve.do?abr=${team.abr}">${team.city} ${team.mascot}</a>
		<br>
	</c:forEach>
</body>
</html>
