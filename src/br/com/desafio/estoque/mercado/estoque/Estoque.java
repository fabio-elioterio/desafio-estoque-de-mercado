package br.com.desafio.estoque.mercado.estoque;

import java.util.List;

import br.com.desafio.estoque.mercado.produto.Produto;

public interface Estoque {

	void alteraPrecoProdutos(float porcentagem, boolean aumenta);
	// Altera o pre�o de todos os produtos com base em uma porcentagem, se a
	// vari�vel aumenta for verdadeira aumenta o pre�o de venda e se for false
	// dever� diminuir o pre�o de venda.

	boolean cadastrarProduto(Produto produto);

	boolean removeProduto(Integer codigoDeBarras);

	List<Produto> listaDeProdutos();

	boolean alteraPrecoProduto(float porcentagem, boolean aumenta, int codigodeBarras);
	// Altera o pre�o de um produto com base em uma porcentagem, se a vari�vel
	// aumenta for verdadeira aumenta o pre�o de venda e se for false dever�
	// diminuir o pre�o de venda.
	
	Produto consultaProduto(Integer codigoDeBarras) throws Exception;
	
	boolean gravaListaProdutos();
	//Guarda em um arquivo chamado produtosLimpeza.txt ou produtosAlimenticios.txt um produto por linha.
	
	int qtdProdutosEmEstoque();
	
}