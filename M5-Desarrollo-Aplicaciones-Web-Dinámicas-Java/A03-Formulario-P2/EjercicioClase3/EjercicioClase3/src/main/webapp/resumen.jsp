<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Resumen</title>
</head>
<body>
	<div class="container">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">Patente</th>
                    <th scope="col">Marca</th>
                    <th scope="col">Año Fabricación</th>
                    <th scope="col">Estado</th>
                    <th scope="col">Tipo</th>
                </tr>			
            </thead>
            <tbody>
                	<c:forEach var="v" items="${sessionScope.llave}">
                		<tr>
	                		<td> <c:out value="${ v.patente }"></c:out> </td>
		                    <td> <c:out value="${ v.marca }"></c:out> </td>
		                    <td> <c:out value="${ v.annFabricacion }"></c:out> </td>
	                    	<td> <c:out value="${ v.vehiculoNuevo?'Nuevo':'Usado' }"></c:out> </td>
	                    	<td> <c:out value="${ v.tipo }"></c:out> </td>
	                    </tr>
                	</c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>