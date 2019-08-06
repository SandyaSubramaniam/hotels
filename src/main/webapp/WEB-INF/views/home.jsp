<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">

<title>Hotel Search</title>
</head>
<body>
	<h1>Hotel Search</h1>
	
	<form action = "displayHotels">
	<c:if test="${ not empty message }">
		<p class="message">${ message }</p>
	</c:if>
	<label for="city">City</label>
	<select name="city">
	<option value="Select">Select</option>
		<option value="Detroit">Detroit</option>
		<option value="Troy">Troy</option>
		<option value="Farmington Hills">Farmington Hills</option>
	</select>
	<br>
	<br>
	<label for="Max Price">Max Price</label>
	<input id="maxprice" type = "number"
				name="maxprice" value="Max Price" />
	<br>
	<button type="submit" class="btn btn-primary">Go!</button>
	
	</form>
	
</body>
</html>