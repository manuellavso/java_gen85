package lista_02;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class exercicio7 {//Pilha

	public static void main(String[] args) {
		Deque<String> pilha = new ArrayDeque<String>();
		char continua = 'S';
		int opcao;
		
		Scanner leia = new Scanner(System.in);
		
		while(continua == 'S') {
			System.out.println();
			System.out.println("M E N U:	");  
			System.out.println("________________________________");  
			System.out.println("1 - Realizar ação");  
			System.out.println("2 - Desfazer ultima ação ");  
			System.out.println("3 - Mostrar histórico de ações");  
			System.out.println("0 - Sair");  
			System.out.println();  
			System.out.print("Digite a opção desejada: ");  
			opcao = leia.nextInt();		
		
		switch(opcao) {
		case 0:
			encerrar();
		break;
		case 1:
			System.out.print("Digite uma ação: ");
			pilha.add(leia.next());
			System.out.println("Ação adicionado!");
		break;
		case 2:
			System.out.println("A ação "+pilha.poll()+ " foi desfeita");
		break;
		case 3:
			if(!pilha.isEmpty()) {
				System.out.println("Lista de ações na pilha: ");
				for(var acoes : pilha) {
					System.out.println(acoes);	
				}
				}else if(pilha.isEmpty()) {
					System.out.println("Não foi feita nenhuma ação - null");
				}
		break;
		default:
			System.out.println("Erro, escolha uma opção de 0 a 3.");
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
