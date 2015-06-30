package br.com.venum.teste;

import javax.persistence.EntityManager;

import br.com.venum.dao.UsuarioDao;
import br.com.venum.modelo.Usuario;
import br.com.venum.util.JPAUtil;

public class TesteInsereUsuario {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();
		Usuario usuario = new Usuario();
		UsuarioDao dao = new UsuarioDao(manager);
		
		usuario.setNome("Allan");
		usuario.setEmail("sjfhjsh@gmail.com");
		usuario.setSobrenome("Gulio");
		usuario.setSenha("220188ljsfk");
		
		dao.adiciona(usuario);
		
		System.out.println("Usuario adicionado" + usuario.getNome());

		
	}

}
