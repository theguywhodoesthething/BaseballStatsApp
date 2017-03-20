<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>${team.mascot}</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
<body>
	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	      </button>
	      <a class="navbar-brand" href="welcome.do">Home</a>
	    </div>
	    <div class="collapse navbar-collapse" id="myNavbar">
	      <ul class="nav navbar-nav">
	        <li class="active"><a href="removeteam.do?abr=${team.abr}">Delete Team</a></li>
	        <li><a href="routeedit.do?abr=${team.abr}">Edit Team</a></li>
	        <li><a href="addplayer.html">Add Player</a></li>
	    </div>
		</nav>
	<div id="tablebody">
	<c:choose>
		<c:when test="${team != null}">
			<h1>${team.city} ${team.mascot}</h1>
			<h2>Player Roster</h2>
			<table>
				<tr>
					<th>Player Name</th>
					<th>Pos</th>
					<th>G</th>
					<th>AB</th>
					<th>P/PA</th>
					<th>Bunts</th>
					<th>GIDP</th>
					<th>IBB</th>
					<th>BB</th>
					<th>K</th>
					<th>BB%</th>
					<th>BB/K</th>
					<th>CT%</th>
					<th>SBO%</th>
					<th>AVG</th>
					<th>BABIP</th>
				</tr>
				<c:forEach var="hitter" items="${hitters}">
					<tr>
						<td>${hitter.firstName} ${hitter.lastName}</td>
						<td>${hitter.pos}</td>
						<td>${hitter.g}</td>
						<td>${hitter.ab}</td>
						<td>${hitter.ppPerA}</td>
						<td>${hitter.bunts}</td>
						<td>${hitter.gidp}</td>
						<td>${hitter.ibb}</td>
						<td>${hitter.bb}</td>
						<td>${hitter.k}</td>
						<td>${hitter.bbPercentage}</td>
						<td>${hitter.bbPerK}</td>
						<td>${hitter.ctPercentage}</td>
						<td>${hitter.sboPercentage}</td>
						<td>${hitter.avg}</td>
						<td>${hitter.babip}</td>
						<td><a
							href="deleteplayer.do?list=h&firstName=${hitter.firstName}&lastName=${hitter.lastName}">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
			<br>
			<h3>Pitchers</h3>
			<table>
				<tr>
					<th>Player Name</th>
					<th>G</th>
					<th>IP</th>
					<th>GS</th>
					<th>QS</th>
					<th>QS%</th>
					<th>K/BB</th>
					<th>K/9</th>
					<th>BB/9</th>
					<th>HR/9</th>
					<th>BABIP</th>
					<th>Str %</th>
					<th>FB MPH</th>
					<th>ERA</th>
					<th>FIP</th>
				</tr>
				<c:forEach var="pitcher" items="${pitchers}">
					<tr>
						<td>${pitcher.firstName} ${pitcher.lastName}</td>
						<td>${pitcher.g}</td>
						<td>${pitcher.ip}</td>
						<td>${pitcher.gs}</td>
						<td>${pitcher.qs}</td>
						<td>${pitcher.qsPercentage}</td>
						<td>${pitcher.kPerBb}</td>
						<td>${pitcher.kPer9}</td>
						<td>${pitcher.bbPer9}</td>
						<td>${pitcher.hrPer9}</td>
						<td>${pitcher.babip}</td>
						<td>${pitcher.strPercentage}</td>
						<td>${pitcher.fbmph}</td>
						<td>${pitcher.era}</td>
						<td>${pitcher.fip}</td>
						<td><a
							href="deleteplayer.do?list=p&firstName=${pitcher.firstName}&lastName=${pitcher.lastName}">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
			<br><br>
		</c:when>
		<c:otherwise>
			<p>No Team found</p>
			<a href="welcome.do">Home</a>
		</c:otherwise>
	</c:choose>
</div>
</body>
</html>
