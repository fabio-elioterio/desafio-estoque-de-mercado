package br.com.desafio.estoque.mercado.programa;

import java.util.Date;

import br.com.desafio.estoque.mercado.estoque.EstoqueAlimenticio;
import br.com.desafio.estoque.mercado.estoque.EstoqueLimpeza;
import br.com.desafio.estoque.mercado.produto.Produto;
import br.com.desafio.estoque.mercado.produto.ProdutoAlimenticio;
import br.com.desafio.estoque.mercado.produto.ProdutoLimpeza;

public class ProgramaPrincipal {

	public static void main(String[] args) throws Exception {
		
		
		
		Produto superVeniche = new ProdutoLimpeza(10, 15, "Veniche", 1242345, new Date(2020, 07, 13), "Doce", "Cozinha");
		
		Produto detergente = new ProdutoLimpeza(10, 20, "Detergente", 1267549, new Date(2030, 07, 13), "Doce", "Cozinha");
		
		EstoqueLimpeza estoqueDeLimpeza = new EstoqueLimpeza();
		EstoqueAlimenticio estoqueAlimenticio = new EstoqueAlimenticio();
		
		System.out.println(estoqueDeLimpeza.cadastrarProduto(superVeniche));
		System.out.println(estoqueDeLimpeza.cadastrarProduto(detergente));
		
		
		System.out.println(estoqueDeLimpeza.listaDeProdutos());
		
		
		
		
		System.out.println("\n");
		Produto pao = new ProdutoAlimenticio(10, 15, "pao", 12334556, new Date(2020, 05, 14) , "fazenda");
		
		System.out.println(estoqueAlimenticio.cadastrarProduto(pao));
		
		System.out.println(estoqueAlimenticio.listaDeProdutos());
		
		estoqueDeLimpeza.gravaListaProdutos();
		estoqueAlimenticio.gravaListaProdutos();
	}
}
