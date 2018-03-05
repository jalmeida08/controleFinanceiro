package br.com.jsa.controleFinanceiro.repository;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.jsa.controleFinanceiro.model.Usuario;

@Stateless
public class UsuarioRepository {

	@PersistenceContext
	EntityManager em;

	public void salvar(Usuario usuario) {
		em.persist(usuario);
	}

	public List<Usuario> listar() {
		return em.createQuery("select u from Usuario u", Usuario.class).getResultList();
	}
}
