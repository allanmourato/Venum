package br.com.venum.controller;

import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.venum.dao.VenderDao;
import br.com.venum.modelo.Vender;


@Named
@SessionScoped
public class VenderController {
	
	@Inject
	public VenderDao venderDao;
	
	@RequestMapping("formVender")
	public String executa(){
		return "formulario-vender";
	}
	
	
	@RequestMapping("adicionaProduto")
	public String adiciona (Vender v){
		
		venderDao.adiciona(v);
		System.out.println("Produto Adicionado" + v.getProduto());
		return "confirmacao";
		
	}
	
	@RequestMapping("listaVendas")
	public String lista(Model model) {
		
		List<Vender> vendas = venderDao.lista();
		model.addAttribute("vendas", vendas);
		return "lista-vendas";
	}

}
