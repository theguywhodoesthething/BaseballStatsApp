<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${team.mascot}</title>
</head>
<body>
	<c:choose>
		<c:when test="${team != null}">
	<h1>${team.city} ${team.mascot}</h1>
	<a href="removeteam.do?abr=${team.abr}">Delete Team</a>
	<a href="routeedit.do?abr=${team.abr}">Edit Team</a>
	<a href="addplayer.do?abr=${team.abr}">Add player</a>
	
	<h2>Player Roster</h2>
	<c:forEach var="hitter" items="${hitters}">
		<p>${hitter.lastName}, ${hitter.firstName}</p>
	</c:forEach>
	<br>
	<h3>Pitchers</h3>
	<c:forEach var="pitcher" items="${pitchers}">
		<p>${pitcher.lastName}, ${pitcher.firstName}</p>
	</c:forEach>
			</c:when>
		<c:otherwise>
			<p>No Team found</p>
			<a href="welcome.do">Home</a>
		</c:otherwise>
	</c:choose>
</body>
</html>