<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Anuncios Leilões</title>
</head>
<body>

<a href="formLeilao">Leilão</a>
	
	<br> <br>
	
	<table>
		
		<tr>
			<th>Código</th>
			<th>Produto</th>
			<th>Descrição</th>
			<th>Imagem_1</th>
			<th>Imagem_2</th>
			<th>Imagem_3</th>
			<th>Imagem_4</th>
			<th>Valor Inicial</th>
			<th>Valor Final</th>
			<th>Data do Anuncio</th>
			
		</tr>
		<c:forEach items="${leiloes}" var="leilao">
		
			<tr>
			
				<td>${leilao.id}</td>
				<td>${leilao.produto}</td>
				<td>${leilaodescricao}</td>
				<td><img src="<c:url value="${leilao.imagemUm}" />"/></td>
				<td><img src="<c:url value="${leilao.imagemDois}" />"/></td>
				<td><img src="<c:url value="${leilao.imagemTres}" />"/></td>
				<td><img src="<c:url value="${leilao.imagemQuatro}" />"/></td>
				<td>${leilao.valorinicial}</td>
				<td>${leilao.valorfinal}</td>
				<td><fmt:formatDate value="${leilao.dataAnuncio.time}" pattern="dd/MM/yyyy"/></td>
				
				
			
			</tr>
		
		</c:forEach>
	</table>

</body>
</html>