package br.com.venum.controller;

import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.venum.dao.TrocarDao;
import br.com.venum.modelo.Trocar;


@Named
@SessionScoped
public class TrocarController {
	
	@Inject
	public TrocarDao trocarDao;
	
	@RequestMapping("formTrocar")
	public String executa(){
		return "formulario-trocar";
	}
	
	@RequestMapping("adicionaTrocar")
	public String adiciona (Trocar t){
		
		trocarDao.adiciona(t);
		System.out.println("Produto Adicionado" + t.getProduto());
		return "confirmacao";
		
	}
	
	@RequestMapping("listaTrocar")
	public String lista(Model model) {
		
		List<Trocar> trocas = trocarDao.lista();
		model.addAttribute("trocas", trocas);
		return "lista-trocar";
	}

}
