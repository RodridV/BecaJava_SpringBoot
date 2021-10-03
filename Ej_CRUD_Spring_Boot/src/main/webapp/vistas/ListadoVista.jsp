<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%-- Añadimos la dependencia en el fichero pom.xml --%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Listado de alumnos</title>
	</head>
	<body>
		<h2>Listado de alumnos</h2>
		<c:forEach var="item" items="${modelo}">
			Nº de matrícula: <label>${item.matricula}</label> <br />
			Nombre: <label>${item.nombre}</label> <br />
			Apellido: <label>${item.apellido}</label> <br />
			<hr />
		</c:forEach>
		
		<br>
		<a href="/alumnos/nuevo">Nuevo</a>
		
		<h2>Listado de alumnos</h2>
		<table>
			<tr>
				<td>Nº de matrícula</td>
				<td>Nombre</td>
				<td>Apellido</td>
			</tr>
			<c:forEach var="item" items="${modelo}">
				<tr>
					<td>${item.matricula}</td>
					<td>${item.nombre}</td>
					<td>${item.apellido}</td>
					<td>
						<a href="/alumnos/eliminar/${item.matricula}">Eliminar</a>
					</td>
					<td>
						<a href="/alumnos/editar/${item.matricula}">Editar</a>
					</td>
				</tr>
			</c:forEach>
		</table>	
	</body>
</html>