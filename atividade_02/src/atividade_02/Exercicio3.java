package atividade_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {//Controle de estoque

		Scanner leia = new Scanner(System.in);

		ArrayList<String> produto = new ArrayList<String>();
		ArrayList<Integer> quantidadeEstoque = new ArrayList<Integer>();
		char continua = 'S';
		int opcao;
		
		//Ficar repetindo quantas vezes o usuario quiser
		while(continua == 'S') {
			System.out.println();
			System.out.println("▛▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▜");
			System.out.println("	⫸ Escolha a opção desejada: ");
			System.out.println(" 1 - Adicionar um novo produto         ");
			System.out.println(" 2 - Atualizar quantidade de produto       ");
			System.out.println(" 3 - Listar todos os produtos             ");
			System.out.println("▙▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▟");
			System.out.print("Digite a opção desejada: ");
				opcao = leia.nextInt();
				leia.nextLine(); //Para limpar o buffer
		
		//Adicionar produto:
		if(opcao == 1) {
			System.out.print("\nDigite o nome do produto: ");
			produto.add(leia.nextLine());
			
			System.out.print("Digite a quantidade de produto: ");
			quantidadeEstoque.add(leia.nextInt());
			
			System.out.println("Produto adicionado!");
		
			
			}//Atualizar quantidade de produtos:
			else if(opcao == 2) {
				System.out.println("Qual produto deseja atualizar?");
					String buscarProduto = leia.next();
						for (int i = 0; i < produto.size(); i++) {
							if(produto.get(i).equals(buscarProduto)) {
						System.out.println("Escreva a nova quantidade: ");
						int atualizacao = leia.nextInt();
						
						quantidadeEstoque.set(i,atualizacao);
						
						System.out.println("Quantidade atualizada.");
					}
				}
			
			
			}//Listar todos os produtos cadastrados:
				else if(opcao == 3) {
					if(!produto.isEmpty()) {
						System.out.println("\n⫸ Lista de todos os produtos: ");
						for(int i =0; i < produto.size(); i++) {
							System.out.println("Nome do produto: " +produto.get(i));
							System.out.println("Quantidade em estoque: " +quantidadeEstoque.get(i));
							System.out.println();
						}
					}else if(produto.isEmpty()) {
						System.out.println("Não há produtos cadastrados - null");
					}
				}
				
			do {//Parar quando o usuário digitar N
				System.out.println("⫸ Deseja continuar? (S/N) ");
				continua = leia.next().toUpperCase().charAt(0);
				}while(!(continua == 'S') && !(continua == 'N'));
				if ((continua == 'N')) {
					System.out.println("Programa finalizado!");
				}
		}	
		
		leia.close();

	}

}
