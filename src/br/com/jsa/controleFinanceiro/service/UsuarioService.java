package br.com.jsa.controleFinanceiro.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import br.com.jsa.controleFinanceiro.model.Usuario;
import br.com.jsa.controleFinanceiro.repository.UsuarioRepository;

@Stateless
public class UsuarioService {

	@Inject
	UsuarioRepository repository;

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void salvar(Usuario usuario) {
		repository.salvar(usuario);
	}

	public List<Usuario> listar() {
		return repository.listar();
	}

	public boolean checarSenha(String senha, String confirmeSenha) {
		if (!senha.equals(confirmeSenha)) {
			return false;
		}
		return true;
	}
}
