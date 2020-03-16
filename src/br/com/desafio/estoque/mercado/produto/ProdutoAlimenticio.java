package br.com.desafio.estoque.mercado.produto;

import java.util.Date;

public class ProdutoAlimenticio extends Produto{
	
	private String origem;
	
	
	
	@Override
	public String toString() {
		return "ProdutoAlimenticio [ Preco Custo = " + getPrecoCusto() + " Preco Venda = " + getPrecoVenda()+ " Nome Produto =" + getNomeProduto() + " Codigo De Barras =" + getCodigoDeBarras()
				+ " Data De Validade =" + getDataDeValidade() + "origem =" + origem + "]";
	}

	public ProdutoAlimenticio(float precoCusto, float precoVenda, String nomeProduto, int codigoDeBarras,
			Date dataDeValidade, String origem) {
		super(precoCusto, precoVenda, nomeProduto, codigoDeBarras, dataDeValidade);
		this.origem = origem;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	
	
	
	

}
