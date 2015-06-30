package br.com.venum.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.venum.modelo.Usuario;


public class UsuarioDao {
	
	private EntityManager manager;
	
	
	public UsuarioDao(EntityManager manager) {
		this.manager = manager;
	}
	
	
	
	
	///Metodos DAO GRUD
	
	public void adiciona(Usuario usuario){
		this.manager.persist(usuario);
	}
	
	public void remove(Usuario usuario){
		this.manager.remove(usuario);
	}
	
	public Usuario busca(long id){
		return this.manager.find(Usuario.class, id);
	}
	
	public List<Usuario> lista() {
		return this.manager.createQuery("select u from Usuario u",Usuario.class).getResultList();
	}
	
	

}
