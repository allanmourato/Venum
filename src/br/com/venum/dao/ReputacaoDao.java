package br.com.venum.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.venum.modelo.Reputacao;

public class ReputacaoDao {
	
private EntityManager manager;
	
	public ReputacaoDao(EntityManager manager) {
		this.manager = manager;
	}
	
	
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
