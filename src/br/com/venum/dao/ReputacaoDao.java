package br.com.venum.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.venum.modelo.Reputacao;

@Stateless
public class ReputacaoDao {
	

	@PersistenceContext
	EntityManager manager;
	
	
	///Metodos DAO GRUD
	
	public void adiciona(Reputacao reputacao){
		this.manager.persist(reputacao);
	}
	
	public void remove(Reputacao reputacao){
		this.manager.remove(reputacao);
	}
	
	public Reputacao busca(long id){
		return this.manager.find(Reputacao.class, id);
	}
	
	public List<Reputacao> lista() {
		return this.manager.createQuery("select r from Reputacao r",Reputacao.class).getResultList();
	}

}
