<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
	crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<header class="container">
		<h1>
			<c:out value="Listado de mensajes"></c:out>
		</h1>
	</header>
	
	<section class="container">
		<form action="/mensajes/filtrar" method="post">
			<input type="text" name="origen">
			<button type="submit">filtrar</button>
		</form>
	</section>
	
	<section class="container">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">identificador</th>
					<th scope="col">nombre</th>
					<th scope="col">mensaje</th>
					<th scope="col">origen</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="mensaje" items="${mensajes}">
					<tr>
						<th scope="row"><c:out value="${mensaje.id}"></c:out></th>
						<td><c:out value="${mensaje.nombre}"></c:out></td>
						<td><c:out value="${mensaje.mensaje}"></c:out></td>
						<td><c:out value="${mensaje.origen}"></c:out></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</section>

</body>
</html>