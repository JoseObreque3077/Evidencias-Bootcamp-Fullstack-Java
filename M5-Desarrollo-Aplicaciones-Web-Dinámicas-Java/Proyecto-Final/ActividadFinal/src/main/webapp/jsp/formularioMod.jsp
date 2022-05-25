<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.3/dist/jquery.validate.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.2/additional-methods.min.js"></script>
<script type="text/javascript" src="../js/validacionFormMod.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="../css/estiloValidacion.css">
<link rel="stylesheet" href="../css/estiloForm.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Formulario Feedback</title>
</head>
<c:set var="o" value="${ sessionScope.editar }"/>
<body>
	<div class="container">
		<div class="row mb-3 d-flex justify-content-center">
			<div class="col-lg-6">
				<h1 class="text-center bg-secondary text-light">Formulario de
					Ingreso de Órdenes</h1>
			</div>
		</div>
		<div class="row mb-3 d-flex justify-content-center">
			<div class="col-lg-10">
				<div class="card" id="tarjetaForm">
					<div class="card-body">
						<form class="form row g-3" action="/ActividadFinal/ActualizarServlet" method="post" id="formulario" name="formulario" accept-charset="UTF-8">
							<div class="col-md-6 mt-2">
								<label class="form-label" for="id">Id de Orden</label> 
								<input type="text" class="form-control" id="id" name="id" value="${o.id}" readonly>
							</div>
							<div class="col-md-6 mt-2">
								<label class="form-label" for="rut">RUT</label> 
								<input type="text" class="form-control" id="rut" name="rut" value="${o.rut}" readonly>
							</div>
							<div class="col-md-6 mt-2">
								<label class="form-label" for="nombre1">Primer Nombre</label>
								<input type="text" class="form-control" id="nombre1" name="nombre1" value="${o.nombre1}" readonly>
							</div>
							<div class="col-md-6 mt-2">
								<label class="form-label" for="nombre2">Segundo Nombre</label>
								<input type="text" class="form-control" id="nombre2" name="nombre2" value="${o.nombre2}" readonly>
							</div>
							<div class="col-md-6 mt-2">
								<label class="form-label" for="apellido1">Primer apellido</label>
								<input type="text" class="form-control" id="apellido1" name="apellido1" value="${o.apellido1}" readonly>
							</div>
							<div class="col-md-6 mt-2">
								<label class="form-label" for="apellido2">Segundo Apellido</label>
								<input type="text" class="form-control" id="apellido2" name="apellido2" value="${o.apellido2}" readonly>
							</div>
							<div class="col-md-4 mt-2">
								<label class="form-label" for="direccion">Dirección</label>
								<input type="text" class="form-control" id="direccion" name="direccion" value="${o.direccion}" readonly>
							</div>
							<div class="col-md-4 mt-2">
								<label class="form-label" for="comuna">Comuna</label>
								<input type="text" class="form-control" id="comuna" name="comuna" value="${o.comuna}" readonly>
							</div>
							<div class="col-md-4 mt-2">
								<label class="form-label" for="region">Región</label>
								<input type="text" class="form-control" id="region" name="region" value="${o.region.region}" readonly>
								<input type="hidden" class="form-control" id="regionId" name="regionId" value="${o.region.id}" readonly>
							</div>
							<div class="col-md-4 mt-2">
								<label class="form-label" for="telefono">Teléfono</label>
								<input type="text" class="form-control" id="telefono" name="telefono" value="${o.telefono}" readonly>
							</div>
							<div class="col-md-4 mt-2">
								<label class="form-label" for="fecha">Fecha de Ingreso</label>
								<input type="date" class="form-control" id="fecha" name="fecha" value="${o.fechaIng}" readonly>
							</div>
							<div class="col-md-4 mt-2">
								<label class="form-label" for="producto">Tipo de Electrodoméstico</label>
								<input type="text" class="form-control" id="producto" name="producto" value="${o.producto.descripcion}" readonly>
								<input type="hidden" class="form-control" id="productoId" name="productoId" value="${o.producto.id}" readonly>
							</div>
							<div class="col-md-4 mt-2">
								<label for="estado">Estado Orden</label>
								<select class="form-select mt-2" id="estado" name="estado">
									<c:forEach var="est" items="${ sessionScope.estados }">
										<c:choose>
											<c:when test="${est.id==o.estado.id}">
												<option value="${ est.id }" selected> <c:out value="${ est.descripcion }"></c:out> </option>
											</c:when>
											<c:otherwise>
												<option value="${ est.id }"> <c:out value="${ est.descripcion }"></c:out> </option>
											</c:otherwise>
										</c:choose>
									</c:forEach>
								</select>
							</div>
							<div class="col-md-4 mt-2">
								<label class="form-label" for="fechaMod">Fecha Modificacion</label>
								<input type="date" class="form-control" id="fechaMod" name="fechaMod" min="${o.fechaIng}">
							</div>
							<div class="col-md-4 mt-2">
								<label class="form-label" for="observaciones">Observaciones</label>
								<textarea class="form-control" id="observaciones" name="observaciones" rows=4></textarea>
							</div>
							<div class="col-md-2 mt-4">
								<button type="submit" class="btn btn-primary form-control">Enviar</button>
							</div>
							<div class="col-md-3 mt-4">
								<a class="btn btn-warning form-control" href="/ActividadFinal/jsp/resumen.jsp">Volver al Resumen</a>
							</div>
							<div class="col-md-7"></div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>