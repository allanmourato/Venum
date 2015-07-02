package br.com.venum.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.venum.modelo.Leilao;

@Stateless
public class LeilaoDao {


	@PersistenceContext
	EntityManager manager;
	
	
	///Metodos DAO GRUD
	
	public void adiciona(Leilao leilao){
		this.manager.persist(leilao);
	}
	
	public void remove(Leilao leilao){
		this.manager.remove(leilao);
	}
	
	public Leilao busca(long id){
		return this.manager.find(Leilao.class, id);
	}
	
	public List<Leilao> lista() {
		return this.manager.createQuery("select l from Leilao l",Leilao.class).getResultList();
	}

}
