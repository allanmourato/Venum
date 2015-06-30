package br.com.venum.controller;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.venum.dao.VenderDao;
import br.com.venum.modelo.Vender;
import br.com.venum.util.JPAUtil;


@Controller
public class VenderController {
	
	@RequestMapping("formVender")
	public String executa(){
		return "formulario-vender";
	}
	
	
	@RequestMapping("adicionaProduto")
	public String adiciona (Vender v){
		
		
		EntityManager manager = new JPAUtil().getEntityManager();
		VenderDao dao = new VenderDao(manager);
		manager.getTransaction().begin();
		dao.adiciona(v);
		manager.getTransaction().commit();
		manager.close();
		System.out.println("Produto Adicionado" + v.getProduto());
		return "confirmacao";
		
	}
	
	@RequestMapping("listaVendas")
	public String lista(Model model) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		VenderDao dao = new VenderDao(manager);
		List<Vender> vendas = dao.lista();
		model.addAttribute("vendas", vendas);
		return "lista-vendas";
	}

}
