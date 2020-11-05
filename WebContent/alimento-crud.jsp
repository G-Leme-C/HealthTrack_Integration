<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>


	<form action="alimento" method="POST">
		<div>
			<label>Nome do alimento</label>
			<input type="text" name="nomeAlimento">
		</div>
		
		<div>
			<label>kCal/g)</label>
			<input type="text" name="vlKCal">
		</div>
		
		<div>
			<label>Gordura (g):</label>
			<input type="text" name="vlGord">
		</div>
		
		<div>
			<label>Carboidratos (g):</label>
			<input type="text" name="vlCarb">
		</div>
		
		<div>
			<label>Proteínas (g):</label>
			<input type="text" name="vlProt">
		</div>
		
		<button type="submit">Cadastrar</button>
	</form>
	
	<table>
		<tr>
			<th>Nome:</th>
			<th>kCal:</th>
			<th>Gord.:</th>
			<th>Carb.:</th>
			<th>Prot.:</th>
		</tr>
		
		<c:forEach items="${alimentos}" var="a">
			<tr>
				<td>${a.nomeAlimento }</td>
				<td>${a.valorkCalGrama }</td>
				<td>${a.valorGordGrama }</td>
				<td>${a.valorCarbGrama }</td>
				<td>${avalorProtGrama }</td>
			</tr>
		</c:forEach>
		
	</table>
	
	</body>
</html>