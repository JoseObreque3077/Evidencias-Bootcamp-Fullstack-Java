<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script type="text/javascript" src="js/seguro.js" ></script>
<title>Vehículos</title>
</head>
<body>
	<div class="cointainer">
		<div class="row justify-content-center">
			<div class="col col-lg-8">
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Patente</th>
							<th scope="col">Marca</th>
							<th scope="col">Año</th>
							<th scope="col">Estado</th>
							<th scope="col">Tipo</th>
							<th scope="col">Modificar</th>
							<th scope="col">Eliminar</th>
						</tr>	
					</thead>
					<tbody>
						<c:forEach var="v" items="${ sessionScope.llave }">
						<tr>							
							<td><c:out value="${v.patente }"/></td>
							<td><c:out value="${v.marca }"/></td>
							<td><c:out value="${v.anio }"/></td>
							<td><c:out value="${v.estado }"/></td>
							<td><c:out value="${v.tipo }"/></td>
							<td>
								<form action="" method="post">
									<input type="hidden" value="${v.patente}" name="patente">
									<input type="submit" value="Modificar">
								</form>
							</td>
							<td>
								<form id="eliminar${v.patente}" action="" method="post">
									<input type="hidden" value="${v.patente}" name="patente">
									<input type="button" value="eliminar" onclick="eliminar('${v.patente}')">
								</form>							
							</td>
						</c:forEach>						
					</tbody>
				</table>			
			</div>
		</div>
	</div>
</body>
</html>