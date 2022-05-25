<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- BOOTSTRAP (CSS) -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- DATATABLES (CSS) -->
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs5/dt-1.11.5/datatables.min.css"/>
<!-- ESTILO DE VENTANA RESUMEN (CSS) -->
<link href="../css/estiloResumen.css" rel="stylesheet">
<!-- JQUERY (JS) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!-- DATATABLES (JS) -->
<script type="text/javascript" src="https://cdn.datatables.net/v/bs5/dt-1.11.5/datatables.min.js"></script>
<!-- CONFIGURACIÓN PERSONALIZADA DE DATATABLES (JS) -->
<script src="../js/filtrosTabla.js"></script>
<title>Resumen de Órdenes de Servicio</title>
</head>
<body>
	<div class="container-fluid">
		<div class="row justify-content-center">
			<div class="col-md-12 mt-2">
				<h1 class="text-center">Resumen Órdenes de Servicio</h1>
			</div>
		</div>
		<div class="row justify-content-center mt-4">
			<div class="col col-md-12 responsive-table">
				<table id="tablaResumen" class="table table-striped" style="width:100%">
					<thead>
						<tr>
							<th scope="col">Id Orden</th>
							<th scope="col">RUT</th>
							<th scope="col">Primer Nombre</th>
							<th scope="col">Segundo Nombre</th>
							<th scope="col">Primer Apellido</th>
							<th scope="col">Segundo Apellido</th>
							<th scope="col">Dirección</th>
							<th scope="col">Comuna</th>
							<th scope="col">Región</th>
							<th scope="col">Teléfono</th>
							<th scope="col">Fecha Ingreso</th>
							<th scope="col">Producto</th>
							<th scope="col">Estado Orden</th>
							<th scope="col">Fecha Actualización</th>
							<th scope="col">Observaciones</th>
							<c:if test="${ sessionScope.permiso == 1 }">
								<th scope="col">Modificar</th>
							</c:if>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="v" items="${ sessionScope.listado }">
							<tr>
								<td><c:out value="${ v.id }" /></td>
								<td><c:out value="${ v.rut }" /></td>
								<td><c:out value="${ v.nombre1 }" /></td>
								<td><c:out value="${ v.nombre2 }" /></td>
								<td><c:out value="${ v.apellido1 }" /></td>
								<td><c:out value="${ v.apellido2 }" /></td>
								<td><c:out value="${ v.direccion }" /></td>
								<td><c:out value="${ v.comuna }" /></td>
								<td><c:out value="${ v.region.region }" /></td>
								<td><c:out value="${ v.telefono }" /></td>
								<td><c:out value="${ v.fechaIng }" /></td>
								<td><c:out value="${ v.producto.descripcion }" /></td>
								<td><c:out value="${ v.estado.descripcion }" /></td>
								<td><c:out value="${ v.fechaMod }" /></td>
								<td><c:out value="${ v.observaciones }" /></td>
								<c:if test="${ sessionScope.permiso == 1 }">
									<td>
										<form action="/ActividadFinal/ModificarServlet" method="post">
											<input type="hidden" value="${v.id}" name="idOrdenMod">
											<button class="form-control btn btn-primary" type="submit">Modificar</button>
										</form>
									</td>
								</c:if>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		<div class="row justify-content-center">
			<div class="col-md-4 mt-2">
				<a class="btn btn-warning" href="/ActividadFinal/jsp/menu.jsp">Volver al Menú</a>
			</div>
			<div class="col-md-8 mt-2">
			</div>
		</div>
	</div>
</body>
</html>