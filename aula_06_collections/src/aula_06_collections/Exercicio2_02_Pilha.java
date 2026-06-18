package aula_06_collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Exercicio2_02_Pilha {

	public static void main(String[] args) {

		Deque<String> pilha = new ArrayDeque<String>();
		char continua = '4';
		int opcao;
		
		Scanner leia = new Scanner(System.in);
		
		while(continua == '4') {
			System.out.println("▛▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▜");
			System.out.println("⛶		● M E N U 📚📖 ●		     ⛶");
			System.out.println("⛶ 1 - Adicionar um novo livro na pilha       ⛶");
			System.out.println("⛶ 2 - Listar todos os livros da pilha        ⛶");
			System.out.println("⛶ 3 - Retirar um livro da pilha              ⛶");
			System.out.println("⛶ 0 - Finalizar programa                     ⛶");
			System.out.println("▙▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▟");
			System.out.print("Digite a opção desejada: ");
				opcao = leia.nextInt();
				leia.nextLine(); //Para limpar o buffer
		
		//Adicionar livro na pilha:
		if(opcao == 1) {
			System.out.print("Digite o nome do livro: ");
			pilha.add(leia.nextLine());
			
			System.out.println("Livro adicionado!");
			
			
			}//Listar os livros:
			else if(opcao == 2) {
				if(!pilha.isEmpty()) {
				System.out.println("Os livros na pilha são: ");
				for(var todosLivros : pilha) {
					System.out.println(todosLivros);	
				}
				}else if(pilha.isEmpty()) {
					System.out.println("A pilha está vazia - null");
				}
				
				
			}//Retirar um livro e mostrar os que sobraram:
				else if(opcao == 3) {		
					System.out.println("Livro removido: "+pilha.poll());	
					System.out.println("Os livros na pilha são: ");
					for(var todosLivros : pilha) {
						System.out.println(todosLivros);	
				}
					
					
			}//Finalizar programa:
		do {
			System.out.println("Deseja continuar? 4 para SIM e 0 para NÃO ");
			continua = leia.next().toUpperCase().charAt(0);
			}while(!(continua == '4') && !(continua == '0'));
					if((continua=='0')) {
						System.out.println("Programa finalizado!");
						break;
					}
		
		}
	
	leia.close();
  }
}