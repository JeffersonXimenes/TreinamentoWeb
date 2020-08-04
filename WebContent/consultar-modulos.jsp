<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
			<title>Instrutores</title>
			
			<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	
	</head>
	<body style="background-color: #404040;">
		
		<h1 style="text-align:center; color: white;">LISTA DE INSTRUTORES</h1>
		
		<table class="table table-dark">
			<tr >
				<th scope="col">NOME MODULO</th>
				<th scope="col">NOME ISTRUTOR TITULAR</th>
				<th scope="col">INSTRUTOR AUXILIAR</th>
				<th scope="col">DATA INÍCIO</th>
		    	<th scope="col">
		    		<form class="form-inline my-2 my-lg-0 float-right">
      					<input class="form-control mr-sm-2" type="search" placeholder="Buscar Instrutor titular..." aria-label="Pesquisar">
      					<button class="btn btn-outline-success my-2 my-sm-0" type="submit">BUSCAR</button>
    				</form>
    			</th>
			</tr>

			<c:forEach var="instrutor" items= "${instrutores}">
				<tr>
					<td><c:out value="${instrutor.nomeModulo}"></c:out></td>
					<td><c:out value="${instrutor.instrutorTitular}"></c:out></td>
					<td><c:out value="${instrutor.instrutorAuxiliar}"></c:out></td>
					<td><fmt:formatDate value="${instrutor.dtInicio}" pattern="dd/MM/yyyy"/></td>
					
				</tr>
			</c:forEach>
		</table>
	</body>
</html>