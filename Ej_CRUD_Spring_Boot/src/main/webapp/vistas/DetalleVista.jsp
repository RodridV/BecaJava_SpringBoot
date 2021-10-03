<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html> 					
	<head>
		<meta charset="UTF-8">
		<title>Detalle alumno</title>						<!--Comentario en html-->
	</head>
	<body>
		<h2>Alumno ${modelo.matricula}</h2>
			Nº de matrícula: <label>${modelo.matricula}</label> <br />
			Nombre: <label>${modelo.nombre}</label> <br />
			Apellido: <label>${modelo.apellido}</label> <br />
			<p>			
			<a href="/alumnos">Volver al listado</a>
	</body>
</html>