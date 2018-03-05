package br.com.jsa.controleFinanceiro.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="tb_despesa")
public class Despesa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(length=300)
	private String descricao;
	private double valor;
	private double valorPago;
	@Temporal(TemporalType.DATE)
	private Date dataVencimento;
	@Temporal(TemporalType.DATE)
	private Date dataPagamento;
	
	
	

}
