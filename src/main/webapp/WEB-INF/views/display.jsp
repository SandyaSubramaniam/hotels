<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Hotels Display</title>
</head>
<body>
	<div class="container">
		<h1 align="center">Hotels in ${city}</h1>
		<table class="table">
			
				<c:forEach var="city" items="${cities}">
					<tr>
						<td style="display:none">${city.id}</td>
						<td><a href="/display?id=${city.id}">${city.name}</a></td>
						<td>${city.pricePerNight}</td>
					</tr>
				</c:forEach>
			
		</table>
		<a href="/" class="btn btn-success">Start a new Search</a>
	</div>
</body>
</html>