package br.com.venum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String execute(){
		
		System.out.println("Sistema Rodando");
		
		return "index";
	}

}
