package br.com.jsa.controleFinanceiro.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "tb_pessoa")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(length = 30)
	private String nome;
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	@ManyToMany(mappedBy = "pessoa")
	private List<Despesa> despesa = new ArrayList<Despesa>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Despesa> getDespesa() {
		return despesa;
	}

	public void setDespesa(List<Despesa> despesa) {
		this.despesa = despesa;
	}

}
