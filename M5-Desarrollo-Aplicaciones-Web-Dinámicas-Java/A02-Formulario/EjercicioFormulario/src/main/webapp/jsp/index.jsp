<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Formulario</title>
</head>
<body>
    <h1 class="mt-2 mb-3 text-center">Formulario de Registro</h1>
    <div class="mx-4">
        <form class="form row d-flex align-self-center" action="/EjercicioFormulario/FormularioServlet" method="post">
            <div class="col-md-6 mt-1">
                <label class="form-label" for="nombre1">Primer Nombre</label>
                <input type="text" class="form-control" id="nombre1" name="nombre1" placeholder="Ej: Pedro">
            </div>
            <div class="col-md-6 mt-1">
                <label class="form-label" for="nombre2">Segundo Nombre</label>
                <input type="text" class="form-control" id="nombre2" name="nombre2" placeholder="Ej: Pablo">
            </div>
            <div class="col-md-6 mt-1">
                <label class="form-label" for="apellido1">Primer apellido</label>
                <input type="text" class="form-control" id="apellido1" name="apellido1" placeholder="Ej: Perez">
            </div>
            <div class="col-md-6 mt-1">
                <label class="form-label" for="apellido2">Segundo Apellido</label>
                <input type="text" class="form-control" id="apellido2" name="apellido2" placeholder="Ej: Pereira">
            </div>
            <div class="col-md-4 mt-1">
                <label class="form-label" for="edad">Edad</label>
                <input type="number" class="form-control" id="edad" name="edad" placeholder="Ej: 40">
            </div>
            <div class="col-md-4 mt-1">
                <label class="form-label" for="nacionalidad">Nacionalidad</label>
                <input type="text" class="form-control" id="nacionalidad" name="nacionalidad" placeholder="Ej: Chilena">
            </div>
            <div class="col-md-2 mt-1">
                <label class="form-label" for="grupoRadios">Sexo</label>
                <div id="grupoRadios">
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="sexo" id="sexoFemenino" value="Femenino" checked>
                        <label class="form-check-label" for="sexoFemenino">
                            Femenino
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="sexo" id="sexoMasculino" value="Masculino">
                        <label class="form-check-label" for="sexoMasculino">
                            Masculino
                        </label>
                    </div>
                </div>
            </div>
            <div class="col-md-2 mt-1">
                <label class="form-label" for="grupoCheck">Vacunacion</label>
                <div class="form-check" id="grupoCheck">
                    <input class="form-check-input" type="checkbox" id="vacunado" name="vacunado">
                    <label class="form-check-label" for="vacunado">
                      Esquema Completo COVID-19
                    </label>
                  </div>
            </div>
            <div class="col-auto">
                <button type="submit" class="btn btn-primary mb-2">Enviar</button>
            </div>
        </form>
    </div>
</body>
</html>