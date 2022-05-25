<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.3/dist/jquery.validate.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.2/additional-methods.min.js"></script>
<script type="text/javascript" src="../js/validacionForm.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="../css/estiloValidacion.css">
<link rel="stylesheet" href="../css/estiloForm.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

<title>Ingreso de Órdenes</title>
</head>
<body>
	<div class="container">
		<div class="row mb-3 d-flex justify-content-center">
			<div class="col-lg-6">
				<h1 class="text-center bg-secondary text-light">Formulario de Ingreso de Órdenes</h1>
			</div>
		</div>
		<div class="row mb-3 d-flex justify-content-center">
			<div class="col-lg-10">
				<div class="card" id="tarjetaForm">
					<div class="card-body">
						<form class="form row g-3" action="/ActividadFinal/AgregarServlet" method="post" id="formulario" name="formulario" accept-charset="UTF-8">
							<c:if test="${ sessionScope.permiso==1 }">
								<div class="col-md-4 mt-2">
									<label class="form-label" for="rut">RUT</label>
									<input type="text" class="form-control" id="rut" name="rut" placeholder="Ej: 12345678-9" required>
								</div>
								<div class="col-md-4 mt-2">
									<label class="form-label" for="nombre1">Primer Nombre</label>
									<input type="text" class="form-control" id="nombre1" name="nombre1" placeholder="Ej: Pedro">
								</div>
								<div class="col-md-4 mt-2">
									<label class="form-label" for="nombre2">Segundo Nombre</label>
									<input type="text" class="form-control" id="nombre2" name="nombre2" placeholder="Ej: Pablo" required>
								</div>
							</c:if>
							<c:if test="${ sessionScope.permiso==2 }">
								<div class="col-md-6 mt-2">
									<label class="form-label" for="nombre1">Primer Nombre</label>
									<input type="text" class="form-control" id="nombre1" name="nombre1" placeholder="Ej: Pedro">
								</div>
								<div class="col-md-6 mt-2">
									<label class="form-label" for="nombre2">Segundo Nombre</label>
									<input type="text" class="form-control" id="nombre2" name="nombre2" placeholder="Ej: Pablo" required>
								</div>
							</c:if>
							<div class="col-md-6 mt-2">
								<label class="form-label" for="apellido1">Primer
									apellido</label> <input type="text" class="form-control" id="apellido1" name="apellido1" placeholder="Ej: Perez" required>
							</div>
							<div class="col-md-6 mt-2">
								<label class="form-label" for="apellido2">Segundo Apellido</label>
								<input type="text" class="form-control" id="apellido2" name="apellido2" placeholder="Ej: Pereira" required>
							</div>
							<div class="col-md-4 mt-2">
								<label class="form-label" for="direccion">Dirección</label>
								<input type="text" class="form-control" id="direccion" name="direccion" placeholder="Ej: Av. Siempreviva 742" required>
							</div>
							<div class="col-md-4 mt-2">
								<label class="form-label" for="comuna">Comuna</label>
								<input type="text" class="form-control" id="comuna" name="comuna" placeholder="Ej: Villarrica" required>
							</div>
							<div class="col-md-4 mt-2">
								<label for="region">Región</label>
								<select class="form-select mt-2" id="region" name="region">
									<option value="">Seleccione región...</option>
									<c:forEach var="r" items="${ sessionScope.regiones }">
										<option value="${ r.id }"> <c:out value="${ r.region }"></c:out> </option>
									</c:forEach>
								</select>
							</div>
							<div class="col-md-4 mt-2">
								<label class="form-label" for="telefono">Teléfono de Contacto</label>
								<input type="text" class="form-control" id="telefono" name="telefono" placeholder="Ej: 912345678" required>
							</div>					
							<div class="col-md-4 mt-2">
								<label class="form-label" for="fecha">Fecha de Ingreso</label>
								<input type="date" class="form-control" id="fecha" name="fecha" required>
							</div>
							<div class="col-md-4 mt-2">
								<label class="form-label" for="producto">Tipo de Electrodoméstico</label>
								<select class="form-select" id="producto" name="producto" required>
									<option value="">Seleccione producto...</option>
									<c:forEach var="p" items="${ sessionScope.productos }">
										<option value="${ p.id }"> <c:out value="${ p.descripcion }"></c:out> </option>
									</c:forEach>
								</select>
							</div>
							<div class="col-md-12 mt-2 justify-items-center">
								<label class="form-label" for="observaciones">Observaciones</label>
								<textarea class="form-control" id="observaciones" name="observaciones" rows=4></textarea>
							</div>
							<div class="col-md-3 mt-4 d-flex justify-content-center">
							</div>
							<div class="col-md-3 mt-4 d-flex justify-content-center">
								<button type="submit" class="btn btn-primary">Enviar</button>
							</div>
							<div class="col-md-3 mt-4 d-flex justify-content-center">
								<a class="btn btn-warning" href="/ActividadFinal/jsp/menu.jsp">Volver al Menú</a>
							</div>
							<div class="col-md-3 mt-4 d-flex justify-content-center">
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>