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
<title>Hotel Details</title>
</head>
<body>
	<h2>${name}</h2>
	<h4>
		Price per night: ${price}
		</h2>
		<iframe src="${map}" width="400" height="400"> Sorry your
			browser does not support frames. </iframe>
		<p>
			<a href="/">Back to Search</a>
		</p>
</body>
</html>