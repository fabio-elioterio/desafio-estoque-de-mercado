package br.com.desafio.estoque.mercado.programa;

import java.util.Date;
import java.util.Scanner;

import br.com.desafio.estoque.mercado.estoque.EstoqueAlimenticio;
import br.com.desafio.estoque.mercado.estoque.EstoqueLimpeza;


public class ProgramaPrincipal {

	public static void main(String[] args) throws Exception {

		EstoqueLimpeza estoqueDeLimpeza = new EstoqueLimpeza();
		EstoqueAlimenticio estoqueDeAlimentos = new EstoqueAlimenticio();
		Scanner teclado = new Scanner(System.in);
		
		
		String opcao = null;
		do {
			System.out.println("1 - Para ir para estoque de limpeza.");
			System.out.println("2 - Para ir para estoque de alimenticio.");
			System.out.println("0 - Para finalizar o dia.");

			switch (opcao) {
			case "1": {
				
				submenuEstoqueDeLimpeza(teclado);
				break;
			}
			case "2": {
				// submenu
				break;
			}
			case "0": {
				System.out.println("Obrigado! Tenha um otimo dia.");
				break;

			}
			default:

			}

		} while (!opcao.equals("0"));

	}

	private static void submenuEstoqueDeLimpeza(Scanner teclado) {
		String opcaoEstoqueLimpeza = null;
		do {
			System.out.println("1 - Para criar um produto de limpeza.");
			System.out.println("2 - Para alterar o preço de todos os produtos de limpeza.");
			System.out.println("3 - Para remover um produto.");
			System.out.println("4 - Para mostrar a lista dos produtos.");
			System.out.println("5 - Para alterar o preço de um produto expecífico.");
			System.out.println("6 - Para consultar um produto.");
			System.out.println("7 - Para gravar um produto na lista.");
			System.out.println("8 - Para mostrar a quantidade de produtos existentes.");
			System.out.println("9 - Para voltar ao menu principal.");

			switch (opcaoEstoqueLimpeza) {
			case "1": {
				System.out.println("Digite o preço de custo do produto:");
				float precoCusto = teclado.nextFloat();
				System.out.println("Digite o preço de venda do produto:");
				float precoVenda = teclado.nextFloat();
				System.out.println("Digite o nome do produto:");
				String nomeProduto = teclado.next();
				System.out.println("Digite o código de barras do produto:");
				int codigoDeBarras = teclado.nextInt();
				System.out.println("Digite a data de validade do produto:");
				Date dataValidade = new Date(teclado.next());
			}
			case "2": {

			}
			case "3": {

			}
			case "4": {

			}
			case "5": {

			}
			case "6": {

			}
			case "7": {

			}
			case "8": {

			}
			case "9	": {

			}
			default:

			}
		} while (!opcaoEstoqueLimpeza.equals("9"));
	}
}
