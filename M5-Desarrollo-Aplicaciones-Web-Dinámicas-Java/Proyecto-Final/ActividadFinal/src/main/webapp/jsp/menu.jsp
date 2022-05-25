<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<link href="../css/estiloMenu.css" rel="stylesheet">
<script src="https://kit.fontawesome.com/744fb39b26.js" crossorigin="anonymous"></script>
<title>Menú de Usuario</title>
</head>
<body>
	<div class="container">
		<div class="row mt-3 d-flex justify-content-center">
			<div class="col-lg-6">
				<h1 class="text-center bg-secondary text-light">Menú Servicio Técnico</h1>
			</div>
		</div>
		<div class="row justify-content-center">
			<div class="col-md-8">
				<div class="card-group mt-4">
					<div class="card text-dark text-center align-items-center pt-3" id="menu1">
						<i class="fa-solid fa-list fa-4x"></i>
						<div class="card-body">
							<h5 class="card-title">Ingresar Orden de Servicio</h5>
							<p class="card-text">Permite el ingreso de una orden de servicio para el envío de un producto electrodoméstico a servicio técnico.</p>
							<a class="btn btn-warning" href="/ActividadFinal/FormularioServlet" role="button">Ir al Formulario</a>
						</div>
					</div>
					<div class="card text-dark text-center align-items-center pt-3" id="menu2">
						<i class="fa-solid fa-database fa-4x"></i>
						<div class="card-body">
							<h5 class="card-title">Ver Registros</h5>
							<p class="card-text">Permite ver el registro de las órdenes de servicio.</p>
							<a class="btn btn-primary mt-4" href="/ActividadFinal/ResumenServlet" role="button">Ir al Registro</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row mt-3">
			<div class="col-md-5"></div>
			<div class="col-md-2 d-flex justify-content-center">
				<a class="btn btn-danger" href="/ActividadFinal/jsp/login.jsp">Cerrar Sesión</a>
			</div>
			<div class="col-md-5"></div>
		</div>
	</div>
</body>
</html>