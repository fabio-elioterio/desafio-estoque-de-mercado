package br.com.desafio.estoque.mercado.produto;

public class Produto {
	
	private float precoCusto;
	private float precoVenda;
	private String nomeProduto;
	private int codigoDeBarras;
	private String dataDeValidade;
	
	
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
	public String getDataDeValidade() {
		return dataDeValidade;
	}
	public void setDataDeValidade(String dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}
	
	
}
