package br.com.venum.controller;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.venum.dao.UsuarioDao;
import br.com.venum.modelo.Usuario;
import br.com.venum.util.JPAUtil;


@Controller
public class UsuarioController {
	
	@RequestMapping("/formUsuario")
	public String formularioUsuario(){
		return "formulario-usuario";
	}
	
	@RequestMapping("adicionaUsuario")
	public String adiciona (Usuario u){
		
		
		EntityManager manager = new JPAUtil().getEntityManager();
		UsuarioDao dao = new UsuarioDao(manager);
		manager.getTransaction().begin();
		dao.adiciona(u);
		manager.getTransaction().commit();
		manager.close();
		System.out.println("Usuario adicionado" + u.getNome());
		return "confirmacao";
		
	}

}
