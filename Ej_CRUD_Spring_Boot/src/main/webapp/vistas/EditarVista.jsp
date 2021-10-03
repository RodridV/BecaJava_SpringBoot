<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Editar alumno</title>
	</head>
	<body>
		<form method="POST" action="/alumnos/editar">
			<div>
				<label>Nº de matrícula</label>
			</div>
			<div>
				<input type="hidden" name="matricula_OLD" value="${modelo.matricula}" />
				<input type="text" name="matricula" value="${modelo.matricula}" />
			</div>
			<div>
				<label>Nombre</label>
			</div>
			<div>
				<input type="text" name="nombre" value="${modelo.nombre}" />
			</div>
			<div>
				<label>Apellido</label>
			</div>
			<div>
				<input type="text" name="apellido" value="${modelo.apellido}" />
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