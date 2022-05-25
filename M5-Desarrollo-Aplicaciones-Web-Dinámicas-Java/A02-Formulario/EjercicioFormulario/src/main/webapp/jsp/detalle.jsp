<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Resumen de Datos</title>
<c:set var="p" value="${sessionScope.persona}"  />
</head>
<body>
    <div class="container">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">Primer Nombre</th>
                    <th scope="col">Segundo Nombre</th>
                    <th scope="col">Primer Apellido</th>
                    <th scope="col">Segundo Apellido</th>
                    <th scope="col">Edad</th>
                    <th scope="col">Nacionalidad</th>
                    <th scope="col">Sexo</th>
                    <th scope="col">Esquema Completo COVID-19</th>
                </tr>			
            </thead>
            <tbody>
                <tr>
                    <td> <c:out value="${ p.nombre1 }"></c:out> </td>
                    <td> <c:out value="${ p.nombre2 }"></c:out> </td>
                    <td> <c:out value="${ p.apellido1 }"></c:out> </td>
                    <td> <c:out value="${ p.apellido2 }"></c:out> </td>
                    <td> <c:out value="${ p.edad }"></c:out> </td>
                    <td> <c:out value="${ p.nacionalidad }"></c:out> </td>
                    <td> <c:out value="${ p.sexo }"></c:out> </td>
                    <td> <c:out value="${ p.esquemaVac?'Si':'No' }"></c:out> </td>
                </tr>
            </tbody>
        </table>
    </div>
</body>
</html>