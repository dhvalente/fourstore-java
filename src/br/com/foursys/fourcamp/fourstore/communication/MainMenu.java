package br.com.foursys.fourcamp.fourstore.communication;

import java.util.Scanner;

public class MainMenu {

	public void mainMenu() {

		primaryMenu();

	}
	
	private void primaryMenu() {
		Scanner scanner = new Scanner(System.in);
		int option = -1;
		
		while(option != 0) {
			System.out.println("\n\n### FourStore - Sistema Comercial de Controle de Vendas e Estoque ###");
			System.out.println("      ==================================================");
			System.out.println("      ||              1 - Produtos                    ||");
			System.out.println("      ||              2 - Vendas                      ||");
			System.out.println("      ||              0 - Sair do sistema             ||");
			System.out.print("                      Insira uma opção:");
			option = scanner.nextInt();
			System.out.println("      ||                                              ||");
			System.out.println("      ==================================================");


			switch(option) {
				case 0:
					System.out.println("\nSistema encerrado");
					break;
				case 1:
					this.menuProducts();
					break;
				case 2:
					this.menuSales();
					break;
//				case 3:
//					this.menuClients();
//					break;
				default:
					System.out.println("\nOpção invalida. Tente novamente.\n");
			}
		}
	}

	private void menuSales() {
		int option = -1;
		
		while(option != 0) {
			System.out.println("1 - Realizar Venda"
					+ "\n2 - Consultar uma venda"
					+ "\n0 - Para voltar");
			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();
			switch(option) {
				case 0:{
					primaryMenu();
					break;
				}
				case 1:{
				//	saleConsultation(); metodo para consultar venda
					break;
				}
				case 2:{
				//saleRegister(); metodo para realizar venda
					break;
				}
				default:
					System.out.println("\nOpção invalida. Tente Novamente. \n");
			}
		}
		
	}

	private void menuProducts() {
		int option = -1;
		
		while(option != 0) {
			System.out.println("1 - Cadastrar Produto"
					+ "\n2 - Buscar Produto (ID)"
					+ "\n3 - Buscar Produto (SKU)"
					+ "\n4 - Lista Produtos"
					+ "\n5 - Atualizar Produtos"
					+ "\n6 - Excluir Produto"
					+ "\n0 - Para voltar");
			
			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();
			
			switch(option) {
				case 0:{
					primaryMenu();
					break;
				}
				case 1:{
					//cadastrarProduto(); metodo para cadastrar produto
					break;
				}
				case 2:{
					//buscarProdutoId(); metodo para buscar produto pelo ID
					break;
				}
				case 3:{
					//buscarProdutoSku(); metodo para buscar pelo SKU
					break;
				}
				case 4:{
					//listarProdutos(); metodo para listar produtos
					break;
				}
				case 5:{
					//atualizarProdutos(); metodo para atualizar produtos
					break;
				}
				case 6:{
					//excluirProdutos(); metodo para excluir produtos
					break;
				}
				default:
					System.out.println("\nOpção invalida. Tente Novamente \n");
			}
			
		}
	}

//	private void menuClients() {
//		
//		
//	}
//		
}