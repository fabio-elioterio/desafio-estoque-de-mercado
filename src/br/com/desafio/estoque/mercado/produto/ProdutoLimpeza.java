package br.com.desafio.estoque.mercado.produto;

import java.util.Date;

public class ProdutoLimpeza extends Produto {

	private String aroma;
	private String parteDaCasa;
	
	

	@Override
	public String toString() {
		return "ProdutoLimpeza [Preco Custo = " + getPrecoCusto() + " Preco Venda = " + getPrecoVenda() + " Nome Produto = " + getNomeProduto() + " Codigo De Barras = " + getCodigoDeBarras()
				+ " Data De Validade = " + getDataDeValidade() + " aroma = " + aroma + ". Parte da casa = " + parteDaCasa + "]\n";
	}


	public ProdutoLimpeza(float precoCusto, float precoVenda, String nomeProduto, int codigoDeBarras,
			Date dataDeValidade, String aroma, String parteDaCasa) {
		super(precoCusto, precoVenda, nomeProduto, codigoDeBarras, dataDeValidade);
		this.aroma = aroma;
		this.parteDaCasa = parteDaCasa;
	}

	
	public String getAroma() {
		return aroma;
	}
	public void setAroma(String aroma) {
		this.aroma = aroma;
	}

	public String getParteDaCasa() {
		return parteDaCasa;
	}

	public void setParteDaCasa(String parteDaCasa) {
		this.parteDaCasa = parteDaCasa;
	}

}
