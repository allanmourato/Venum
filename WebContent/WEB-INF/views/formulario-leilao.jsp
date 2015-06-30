<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Leilao</title>
</head>
<body>

	<form action="adicionaLeilao" method="post">
		<fieldset>
		
			Produto:<input type="text" name="produto" /><br>
			Descrição:<input type="text" name="descricao" /><br>
			Imagem: <input type="file" name="imagemUm" /><br>
			Imagem: <input type="file" name="imagemDois" /><br>
			Imagem: <input type="file" name="imagemTres" /><br>
			Imagem: <input type="file" name="imagemQuatro" /><br>
			Valor Inicial:<input type="text" name="valorinicial" /><br>
			
			<input type="submit" value="Publicar" /><br>
		</fieldset>
	</form>

</body>
</html>