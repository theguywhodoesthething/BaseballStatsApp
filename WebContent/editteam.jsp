<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Team</title>
</head>
<body>
	<h3>Edit ${team.city} ${team.mascot}</h3>
	<form action="editteam.do" method="POST">
		City:
		<input type="text" name="city" value="${team.city}"/><br/>
		Mascot:
		<input type="text" name="mascot" value="${team.mascot}"/><br/>
		State: 
		<input type="text" name=state value="${team.state}"/><br/>
		League:
		<input type="text" name="league" value="${team.league}"/><br/>
		Division:
		<input type="text" name="division" value="${team.division}"/><br/>
		Logo:
		<input type="text" name="picturePath" value="${team.picturePath}"/><br/>
		<input type="submit" value="Update" />
	</form>
</body>
</html>
