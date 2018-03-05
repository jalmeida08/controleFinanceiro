package br.com.jsa.controleFinanceiro.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import br.com.jsa.controleFinanceiro.model.Usuario;
import br.com.jsa.controleFinanceiro.service.UsuarioService;

@ManagedBean
public class UsuarioBean {

	@Inject
	private UsuarioService service;
	private FacesContext context;
	private Usuario usuario = new Usuario();
	private String confirmeSenha;
	private List<Usuario>listar;

	public Usuario getUsuario() {
		return usuario;
	}

	public String getConfirmeSenha() {
		return confirmeSenha;
	}

	public void setConfirmeSenha(String confirmeSenha) {
		this.confirmeSenha = confirmeSenha;
	}
	
	public String salvar() {
		context = FacesContext.getCurrentInstance();
		
		if(service.checarSenha(usuario.getSenha(), confirmeSenha)) {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Alerta", "Por favor, confirme a senha."));
			return null;
		}
		
		service.salvar(this.usuario);
		
		this.usuario = new Usuario();
		return null;
	}

	public List<Usuario> getListar() {
		listar = service.listar();
		return listar;
	}
	
	
	
	
	
	
}
