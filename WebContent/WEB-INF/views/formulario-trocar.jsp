<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Trocar</title>
</head>
<body>

	<form action="adicionaTrocar" method="post">
	
		<fieldset>
			
			Produto:<input type="text" name="produto" /><br>
			Descrição:<input type="text" name="descricao" /><br>
			Imagem:<input type="file" name="imagemUm" /><br>
			Imagem:<input type="file" name="imagemDois" /><br>
			Imagem:<input type="file" name="imagemTres" /><br>
			Imagem:<input type="file" name="imagemQuatro" /><br>
			Interesse:<input type="text" name="interesse" /><br>
			
			<input type="submit" value="Publicar" /><br>
			
		</fieldset>
	</form>

</body>
</html>