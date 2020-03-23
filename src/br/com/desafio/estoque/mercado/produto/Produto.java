package br.com.desafio.estoque.mercado.produto;

import java.util.Date;

public abstract class Produto {

	private float precoCusto;
	private float precoVenda;
	private String nomeProduto;
	private int codigoDeBarras;
	private Date dataDeValidade;

	
	@Override
	public String toString() {
		return "Produto [precoCusto=" + precoCusto + " precoVenda=" + precoVenda + " nomeProduto=" + nomeProduto
				+ " codigoDeBarras=" + codigoDeBarras + " dataDeValidade=" + dataDeValidade + "] \n";
	}

	public Produto(float precoCusto, float precoVenda, String nomeProduto, int codigoDeBarras, Date dataDeValidade) {
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.nomeProduto = nomeProduto;
		this.codigoDeBarras = codigoDeBarras;
		this.dataDeValidade = dataDeValidade;
	}
	
	public void aumentaPercentualPrecoVenda(float porcentagem) {
		// XXX: Essa conta precisa ser revista.
		this.precoVenda += this.precoVenda * porcentagem; 
	}
	
	public void diminuiPercentualPrecoVenda(float porcentagem) {
		this.precoVenda -= this.precoVenda * porcentagem;
	}

	public float getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(float precoCusto) {
		this.precoCusto = precoCusto;
	}

	public float getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(int codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	public Date getDataDeValidade() {
		return dataDeValidade;
	}

	public void setDataDeValidade(Date dataDeValidade) {
		this.dataDeValidade = dataDeValidade;

	}
}
