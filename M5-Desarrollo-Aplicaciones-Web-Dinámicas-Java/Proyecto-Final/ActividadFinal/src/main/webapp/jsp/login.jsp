<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link href="../css/estiloLogin.css" rel="stylesheet">
<link href="../css/estiloValidacion.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.3/dist/jquery.validate.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.2/additional-methods.min.js"></script>
<script src="../js/validacionLogin.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<title>Autentificación</title>
</head>
<body>
	<div class="container">
		<div class="row d-flex justify-content-center">
			<div class="col-lg-6">
				<div class="card text-dark mb-3 mt-4" id="tarjetaLogin">
					<div class="card-header text-center">Autentificación</div>
					<div class="card-body">
						<form class="form" action="/ActividadFinal/LoginServlet" method="post" id="formLogin">
							<div class="form-group">
								<label class="form-label" for="usuario">Usuario</label>
								<input class="form-control" type="text" id="usuario" name="usuario" placeholder="Ingrese nombre de usuario">
							</div>
							<div class="form-group mt-2">
								<label class="form-label" for="pass">Contraseña</label>
								<input class="form-control" type="password" id="pass" name="pass" placeholder="Ingrese su contraseña">
							</div>
							<button type="submit" class="btn btn-warning mt-3">Ingresar</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>