package br.com.venum.controller;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.web.bind.annotation.RequestMapping;

import br.com.venum.dao.UsuarioDao;
import br.com.venum.modelo.Usuario;


@Named
@SessionScoped
public class UsuarioController {
	
	@Inject
	public UsuarioDao usuarioDao;
	
	@RequestMapping("/formUsuario")
	public String formularioUsuario(){
		return "formulario-usuario";
	}
	
	@RequestMapping("adicionaUsuario")
	public String adiciona (Usuario u){
		
		usuarioDao.adiciona(u);
		System.out.println("Usuario adicionado" + u.getNome());
		return "confirmacao";
		
	}

}
