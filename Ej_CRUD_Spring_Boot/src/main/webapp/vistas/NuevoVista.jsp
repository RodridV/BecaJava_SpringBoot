<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Nuevo alumno</title>
	</head>
	<body>
		<form method="POST" action="/alumnos/nuevo">
			<div>
				<label>Nº de matrícula</label>
			</div>
			<div>
				<input type="text" name="Matrícula" value="${modelo.matricula}" />
			</div>
			<div>
				<label>Nombre</label>
			</div>
			<div>
				<input type="text" name="Nombre" value="${modelo.nombre}" />
			</div>
			<div>
				<label>Apellido</label>
			</div>
			<div>
				<input type="text" name="Apellido" value="${modelo.apellido}" />
			</div>
			<p>
			<div>
				<button>Guardar</button>
			</div>			
		</form>
		<p>
		<a href="/alumnos">Volver al listado</a>
	</body>
</html>