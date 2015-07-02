package br.com.venum.controller;

import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.venum.dao.LeilaoDao;
import br.com.venum.modelo.Leilao;


@Named
@SessionScoped
public class LeilaoController {
	
	@Inject
	private LeilaoDao leilaoDao;

	@RequestMapping("formLeilao")
	public String executa(){
		return "formulario-leilao";
	}
	
	@RequestMapping("adicionaLeilao")
	public String adiciona (Leilao l){
		
		this.leilaoDao.adiciona(l);
		System.out.println("Produto Adicionado" + l.getProduto());
		return "confirmacao";
		
	}
	
	@RequestMapping("listaLeilao")
	public String lista(Model model) {
		
		List<Leilao> leiloes = leilaoDao.lista();
		model.addAttribute("leiloes", leiloes);
		return "lista-leilao";
	}
	
	
}
