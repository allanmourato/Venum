<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Usuario</title>
</head>
<body>

	<h3>Adicionar Usuario</h3>
	
	<form action="adicionaUsuario" method="post">
	
		<fieldset>
			Nome:<input type="text" name="nome" ><br>
			Sobrenome:<input type="text" name="sobrenome"><br>
			E-Mail:<input type="text" value="email"><br>
			Senha:<input type="password" value="senha"><br>
			
			<input type="submit" value="Criar">
		</fieldset>
		
	
	
	</form>
</body>
</html>