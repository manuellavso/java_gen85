package lista_02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicio6 {//Fila

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();
		char continua = 'S';
		int opcao;
		
		while(continua == 'S') {
			System.out.println();
			System.out.println("M E N U:	");  
			System.out.println("________________________________");  
			System.out.println("1 - Adicionar novo cliente a fila");  
			System.out.println("2 - Atender (remover) o próximo cliente ");  
			System.out.println("3 - Exibir a fila atual com nome e quantidade de itens");  
			System.out.println("0 - Sair");  
			System.out.println();  
			System.out.print("Digite a opção desejada: ");  
			opcao = leia.nextInt();		
			
			switch(opcao) {
			case 0:
				encerrar();
			break;
			case 1:
				System.out.print("Digite o nome do cliente: ");
				fila.add(leia.next());
				System.out.println("Cliente adicionado!");
			break;
			case 2:
				System.out.println("Cliente chamado: "+fila.poll());	
				System.out.println("Os clientes restantes na fila são: ");
				for(var todos : fila) {
					System.out.println(todos);	
				}
			break;
			case 3:
				System.out.println("Os clientes na fila são: ");
				for(var todos : fila) {
					System.out.println(todos);	
				}		
				System.out.println("Há " +fila.size()+ " clientes na fila.");
			break;
			default:
				System.out.println("Erro, escolha um valor de 0 a 4.");
			}
		
		
		}do {
			System.out.println("Deseja continuar? s ou n ");
				continua = leia.next().toUpperCase().charAt(0);
				}while(!(continua == 'S') && !(continua == 'N'));
					if ((continua == 'N')) {
						encerrar();
			}
		leia.close();
	}
	
	public static void encerrar() {
		System.out.println("Programa finalizado.");
		System.exit(0);
									}
}
