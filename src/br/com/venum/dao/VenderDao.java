package br.com.venum.dao;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.venum.modelo.Vender;

public class VenderDao {
	
private EntityManager manager;
	
	public VenderDao(EntityManager manager) {
		this.manager = manager;
	}
	
	
	///Metodos DAO GRUD
	
	public void adiciona(Vender vender){
		vender.setDataAnuncio(Calendar.getInstance());
		this.manager.persist(vender);
	}
	
	public void remove(Vender vender){
		this.manager.remove(vender);
	}
	
	public Vender busca(long id){
		return this.manager.find(Vender.class, id);
	}
	
	public List<Vender> lista() {
		return this.manager.createQuery("select v from Vender v",Vender.class).getResultList();
	}

}
