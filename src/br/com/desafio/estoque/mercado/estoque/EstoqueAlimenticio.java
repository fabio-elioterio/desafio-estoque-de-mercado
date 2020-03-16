package br.com.desafio.estoque.mercado.estoque;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import br.com.desafio.estoque.mercado.produto.Produto;
import br.com.desafio.estoque.mercado.produto.ProdutoAlimenticio;


public class EstoqueAlimenticio implements Estoque {
	
	private List<Produto> produtosAlimenticio = new ArrayList<Produto>();
	private String nomeProdutosAlimenticios;

	@Override
	public void alteraPrecoProdutos(float porcentagem, boolean aumenta) {
		for (int i = 0; i < produtosAlimenticio.size(); i++) {
			if (aumenta == true) {
				this.produtosAlimenticio.get(i).aumentaPercentualPrecoVenda(porcentagem);
			} else {
				this.produtosAlimenticio.get(i).diminuiPercentualPrecoVenda(porcentagem);
			}
		}
		
	}

	@Override
	public boolean cadastrarProduto(Produto produto) {
		if (produto instanceof ProdutoAlimenticio) {
			this.produtosAlimenticio.add((ProdutoAlimenticio) produto);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean removeProduto(Integer codigoDeBarras) {
		for (int i = 0; i < produtosAlimenticio.size(); i++) {
			if (produtosAlimenticio.get(i).getCodigoDeBarras() == codigoDeBarras) {
				produtosAlimenticio.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Produto> listaDeProdutos() {
		return this.produtosAlimenticio;
	}

	@Override
	public boolean alteraPrecoProduto(float porcentagem, boolean aumenta, int codigoDeBarras) {
		for (int i = 0; i < produtosAlimenticio.size(); i++) {
			if (produtosAlimenticio.get(i).getCodigoDeBarras() == codigoDeBarras) {
				if (aumenta = true) {
					this.produtosAlimenticio.get(i).aumentaPercentualPrecoVenda(porcentagem);
				} else {
					this.produtosAlimenticio.get(i).diminuiPercentualPrecoVenda(porcentagem);

				}
				return true;
			}
		}
		return false;
	}

	@Override
	public Produto consultaProduto(Integer codigoDeBarras) throws Exception {
		for (int i = 0; i < produtosAlimenticio.size(); i++) {
			if (produtosAlimenticio.get(i).getCodigoDeBarras() == codigoDeBarras) {
				return produtosAlimenticio.get(i);
			}
		}
		throw new Exception("Produto não encontrado!");
	}

	@Override
	public boolean gravaListaProdutos() {
		try {
			FileWriter arquivoA = new FileWriter("ProdutosAlimenticios.txt");
			PrintWriter gravaArquivoA = new PrintWriter(arquivoA);

			gravaArquivoA.print("PRODUTOS EM ESTOQUE\n");

			for (int i = 0; i < produtosAlimenticio.size(); i++) {

				
				gravaArquivoA.print(produtosAlimenticio.get(i));
			}

			arquivoA.close();
			gravaArquivoA.close();
		} catch (IOException e) {
			System.out.println("Falha ao gravar produto.");
			e.printStackTrace();
			return false;
		}

		return true;
	}

	@Override
	public int qtdProdutosEmEstoque() {
		return  produtosAlimenticio.size();
	}

	public String getNomeProdutosAlimenticios() {
		return nomeProdutosAlimenticios;
	}

	public void setNomeProdutosAlimenticios(String nomeProdutosAlimenticios) {
		this.nomeProdutosAlimenticios = nomeProdutosAlimenticios;
	}

	
	

}
