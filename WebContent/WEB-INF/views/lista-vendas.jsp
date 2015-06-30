<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Anuncios Vender</title>
</head>
<body>

	<a href="formVender">Vender</a>
	
	<br> <br>
	
	<table>
		
		<tr>
			<th>Código</th>
			<th>Produto</th>
			<th>Descrição</th>
			<th>Valor</th>
			<th>Data do Anúncio</th>
			<th>Imagem_1</th>
			<th>Imagem_2</th>
			<th>Imagem_3</th>
			<th>Imagem_4</th>
			
		</tr>
		<c:forEach items="${vendas}" var="venda">
		
			<tr>
			
				<td>${venda.id}</td>
				<td>${venda.produto}</td>
				<td>${venda.descricao}</td>
				<td>${venda.valor}</td>
				<td><fmt:formatDate value="${venda.dataAnuncio.time}" pattern="dd/MM/yyyy"/></td>
				<td><img src="<c:url value="${venda.imagemUm}" />"/></td>
				<td><img src="<c:url value="${venda.imagemDois}" />"/></td>
				<td><img src="<c:url value="${venda.imagemTres}" />"/></td>
				<td><img src="<c:url value="${venda.imagemQuatro}" />"/></td>
				
			
			</tr>
		
		</c:forEach>
	</table>

</body>
</html>