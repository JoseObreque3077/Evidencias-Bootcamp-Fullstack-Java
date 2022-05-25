<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<div class="cointainer">
		<a href="/EjemploBD/AgregarServlet">Vehículos</a>
		<div class="row justify-content-center">
			<div class="col col-lg-8">
				<div class="">
					<form class="form" method="post" action="/EjemploBD/AgregarServlet">
						<div class="form-group">
							<label>Patente</label> <input type="text" placeholder="Patente"
								name="patente" class="form-control" required="required">
							<c:if test="${ sessionScope.error != null }">
								<span> <c:out value="${sessionScope.error }" />
								</span>
								<c:remove var="error" scope="session" />
							</c:if>
						</div>
						<div class="form-group">
							<label>Marca</label> <select name="marca" class="form-select"
								aria-label="Default select example">
								<option selected="selected">Seleccionar</option>
								<option>Ford</option>
								<option>Chevrolet</option>
								<option>Kia</option>
								<option>Suzuki</option>
								<option>Fiat</option>
							</select>
						</div>
						<div class="form-group">
							<label>Año Fabricación</label> <input type="number"
								placeholder="2022" name="fecha" class="form-control" min="1960"
								max="2022">
						</div>
						<div class="form-group form-check">
							<label>Estado vehículo</label>
						</div>
						<div class="form-group form-check">
							<input type="checkbox" name="estado" id="estado"
								class="form-check-input"> <label
								class="form-check-label" for="estado">Nuevo</label>
						</div>
						<div class="form-check">
							<label>Tipo</label>
						</div>
						<div class="form-check">
							<input type="radio" name="tipo" value="suv"
								class="form-check-input"> <label>Suv</label>
						</div>
						<div class="form-check">
							<input type="radio" name="tipo" value="cityCar"
								class="form-check-input"> <label>City Car</label>
						</div>
						<div class="form-check">
							<input type="radio" name="tipo" value="sedan"
								class="form-check-input"> <label>Sedan</label>
						</div>
						<div class="form-check">
							<input type="radio" name="tipo" value="camioneta"
								class="form-check-input"> <label>Camioneta</label>
						</div>
						<div class="form-check">
							<input type="radio" name="tipo" value="4x4"
								class="form-check-input"> <label>4x4</label>
						</div>
						<input type="submit" value="Registrar" class="btn btn-primary">
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>