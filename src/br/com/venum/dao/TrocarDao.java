package br.com.venum.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.venum.modelo.Trocar;

@Stateless
public class TrocarDao {
	
	
	@PersistenceContext
	EntityManager manager;
	
	
	
	
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
