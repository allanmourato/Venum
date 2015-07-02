package br.com.venum.controller;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import org.springframework.web.bind.annotation.RequestMapping;

@Named
@SessionScoped
public class IndexController {
	
	@RequestMapping("/")
	public String execute(){
		
		System.out.println("Sistema Rodando");
		
		return "index";
	}

}
