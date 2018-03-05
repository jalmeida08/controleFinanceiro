package br.com.jsa.controleFinanceiro.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.jsa.controleFinanceiro.model.Usuario;

public class UsuarioRepository {

	@PersistenceContext
	EntityManager em;
	
	public void salvar(Usuario usuario){
		em.persist(usuario);
	}
}
