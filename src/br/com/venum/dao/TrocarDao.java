package br.com.venum.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.venum.modelo.Trocar;

public class TrocarDao {
	
private EntityManager manager;
	
	public TrocarDao(EntityManager manager) {
		this.manager = manager;
	}
	
	
	///Metodos DAO GRUD
	
	public void adiciona(Trocar trocar){
		this.manager.persist(trocar);
	}
	
	public void remove(Trocar trocar){
		this.manager.remove(trocar);
	}
	
	public Trocar busca(long id){
		return this.manager.find(Trocar.class, id);
	}
	
	public List<Trocar> lista() {
		return this.manager.createQuery("select t from Trocar t",Trocar.class).getResultList();
	}

}
