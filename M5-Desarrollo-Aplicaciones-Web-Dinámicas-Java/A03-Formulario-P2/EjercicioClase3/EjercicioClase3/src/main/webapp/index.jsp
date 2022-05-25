<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Formulario</title>
</head>
<body>
	<div class="container">
		<div class="row justify-content-center">
			<h1 class="text-center">Formulario de Ingreso de Vehículos</h1>
		</div>
		<a class="btn btn-warning" href="/EjercicioClase3/AgregarServlet" role="button">Ir a Tabla</a>
		<div class="row justify-content-center">
			<div class="col col-lg-8">
				<form class="form" method="post"
					action="/EjercicioClase3/AgregarServlet">
					<div class="form-group">
						<label class="form-label" for="patente">Patente</label>
						<input class="form-control" type="text" name="patente" id="patente" placeholder="Ej: SD9191" required>
						<!-- Si el error existe en la sesión (no nulo), se muestra un mensaje -->
						<c:if test="${ sessionScope.error != null }">
							<span> <c:out value="${ sessionScope.error }"/> </span>
							<c:remove var="error" scope="session"/>
						</c:if>
					</div>
					<div class="form-group mt-2">
						<label class="form-label" for="marca">Marca</label>
						<select class="form-select" id="marca" name="marca">
							<option selected>Seleccione una marca</option>
							<option>Ford</option>
							<option>Chevrolet</option>
							<option>Kia</option>
							<option>Suzuki</option>
							<option>Fiat</option>
						</select>
					</div>
					<div class="form-group mt-2">
						<label class="form-label" for="fecha">Año Fabricacion</label>
						<input type="number" class="form-control" name="fecha" id="fecha" placeholder="Ej: 2022">
					</div>
					<div class="form-group mt-2">
						<label>Estado del Vehiculo</label>
						<div class="form-check">
							<input class="form-check-input" type="checkbox" value="" id="estado" name="estado">
							<label class="form-check-label" for="estado">Nuevo</label>
						</div>
					</div>
					<div class="form-group mt-2">
						<label class="form-label">Tipo de Vehiculo</label>
						<div class="form-check">
							<input class="form-check-input" type="radio" value="Auto" name="tipoVehiculo" id="tipoVehiculo1" checked>
							<label class="form-check-label" for="tipoVehiculo1"> Auto </label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="radio" value="Camioneta" name="tipoVehiculo" id="tipoVehiculo2">
							<label class="form-check-label" for="tipoVehiculo2"> Camioneta</label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="radio" value="Jeep" name="tipoVehiculo" id="tipoVehiculo2">
							<label class="form-check-label" for="tipoVehiculo2"> Jeep </label>
						</div>
					</div>
					<button type="submit" class="btn btn-primary">Enviar</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>