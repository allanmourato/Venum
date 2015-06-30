package br.com.venum.controller;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.venum.dao.TrocarDao;
import br.com.venum.modelo.Trocar;
import br.com.venum.util.JPAUtil;


@Controller
public class TrocarController {
	
	@RequestMapping("formTrocar")
	public String executa(){
		return "formulario-trocar";
	}
	
	@RequestMapping("adicionaTrocar")
	public String adiciona (Trocar t){
		
		
		EntityManager manager = new JPAUtil().getEntityManager();
		TrocarDao dao = new TrocarDao(manager);
		manager.getTransaction().begin();
		dao.adiciona(t);
		manager.getTransaction().commit();
		manager.close();
		System.out.println("Produto Adicionado" + t.getProduto());
		return "confirmacao";
		
	}
	
	@RequestMapping("listaTrocar")
	public String lista(Model model) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		TrocarDao dao = new TrocarDao(manager);
		List<Trocar> trocas = dao.lista();
		model.addAttribute("trocas", trocas);
		return "lista-trocar";
	}

}
