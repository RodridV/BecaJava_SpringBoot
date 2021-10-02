<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html> 					
	<head>
		<meta charset="UTF-8">
		<title>Detalle alumno</title>							<!--Para comentar en html-->
	</head>
	<body>		
		<input type="number" value="${datos.matricula}"/>
		<br>
		
		<input type = "text" value = "${datos.nombre}"/>
		<br>
		
		<input type = "text" value = "${datos.apellido}"/>
		<br>
	</body>
</html>