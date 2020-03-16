package br.com.desafio.estoque.mercado.estoque;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import br.com.desafio.estoque.mercado.produto.Produto;
import br.com.desafio.estoque.mercado.produto.ProdutoLimpeza;

public class EstoqueLimpeza implements Estoque {

	private List<Produto> produtosLimpeza = new ArrayList<Produto>();

	@Override
	public void alteraPrecoProdutos(float porcentagem, boolean aumenta) {
		for (int i = 0; i < produtosLimpeza.size(); i++) {
			if (aumenta == true) {
				this.produtosLimpeza.get(i).aumentaPercentualPrecoVenda(porcentagem);
			} else {
				this.produtosLimpeza.get(i).diminuiPercentualPrecoVenda(porcentagem);

			}
		}
	}

	@Override
	public boolean cadastrarProduto(Produto produto) {
		if (produto instanceof ProdutoLimpeza) {
			this.produtosLimpeza.add((ProdutoLimpeza) produto);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean removeProduto(Integer codigoDeBarras) {
		for (int i = 0; i < produtosLimpeza.size(); i++) {
			if (produtosLimpeza.get(i).getCodigoDeBarras() == codigoDeBarras) {
				produtosLimpeza.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Produto> listaDeProdutos() {
		return this.produtosLimpeza;
	}

	@Override
	public boolean alteraPrecoProduto(float porcentagem, boolean aumenta, int codigoDeBarras) {
		for (int i = 0; i < produtosLimpeza.size(); i++) {
			if (produtosLimpeza.get(i).getCodigoDeBarras() == codigoDeBarras) {
				if (aumenta = true) {
					this.produtosLimpeza.get(i).aumentaPercentualPrecoVenda(porcentagem);
				} else {
					this.produtosLimpeza.get(i).diminuiPercentualPrecoVenda(porcentagem);

				}
				return true;
			}
		}
		return false;
	}

	@Override
	public Produto consultaProduto(Integer codigoDeBarras) throws Exception {
		for (int i = 0; i < produtosLimpeza.size(); i++) {
			if (produtosLimpeza.get(i).getCodigoDeBarras() == codigoDeBarras) {
				return produtosLimpeza.get(i);
			}
		}
		throw new Exception("Produto não encontrado!");
	}

	@Override
	public boolean gravaListaProdutos() {
		try {
			FileWriter arquivo = new FileWriter("ListaDosProdutos.txt");
			PrintWriter gravaArquivo = new PrintWriter(arquivo);

			gravaArquivo.print("PRODUTOS EM ESTOQUE\n");

			for (int i = 0; i < produtosLimpeza.size(); i++) {

				
				gravaArquivo.print(produtosLimpeza.get(i));
			}

			arquivo.close();
			gravaArquivo.close();
		} catch (IOException e) {
			System.out.println("Falha ao gravar produto.");
			e.printStackTrace();
			return false;
		}

		return true;
	}

	@Override
	public int qtdProdutosEmEstoque() {
		return  produtosLimpeza.size();
	}

}