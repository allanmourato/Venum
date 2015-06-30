package br.com.venum.controller;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.venum.dao.LeilaoDao;
import br.com.venum.modelo.Leilao;
import br.com.venum.util.JPAUtil;


@Controller
public class LeilaoController {

	@RequestMapping("formLeilao")
	public String executa(){
		return "formulario-leilao";
	}
	
	@RequestMapping("adicionaLeilao")
	public String adiciona (Leilao l){
		
		
		EntityManager manager = new JPAUtil().getEntityManager();
		LeilaoDao dao = new LeilaoDao(manager);
		manager.getTransaction().begin();
		dao.adiciona(l);
		manager.getTransaction().commit();
		manager.close();
		System.out.println("Produto Adicionado" + l.getProduto());
		return "confirmacao";
		
	}
	
	@RequestMapping("listaLeilao")
	public String lista(Model model) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		LeilaoDao dao = new LeilaoDao(manager);
		List<Leilao> leiloes = dao.lista();
		model.addAttribute("leiloes", leiloes);
		return "lista-leilao";
	}
	
	
}
