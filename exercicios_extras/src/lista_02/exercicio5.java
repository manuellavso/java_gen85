package lista_02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicio5 {//Fila

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();
		char continua = 'S';
		int opcao;
		
		while(continua == 'S') {
			System.out.println();
			System.out.println("M E N U:	");  
			System.out.println("________________________________");  
			System.out.println("1 - Adicionar novo paciente a fila");  
			System.out.println("2 - Chamar (remover) o próximo da fila ");  
			System.out.println("3 - Exibir o próximo da fila");  
			System.out.println("4 - Exibir fila completa");  
			System.out.println("0 - Sair");  
			System.out.println();  
			System.out.print("Digite a opção desejada: ");  
			opcao = leia.nextInt();		
			
			switch(opcao) {
			case 0:
				encerrar();
			break;
			case 1:
				System.out.print("Digite o nome do paciente: ");
				fila.add(leia.next());
				System.out.println("Paciente adicionado!");
			break;
			case 2:
				System.out.println("Paciente chamado: "+fila.poll());	
				System.out.println("Os pacientes restantes na fila são: ");
				for(var todos : fila) {
					System.out.println(todos);	
				}
			break;
			case 3:
				System.out.println("Próximo paciente: "+fila.peek());	
			break;
			case 4:
				System.out.println("Os pacientes na fila são: ");
				for(var todos : fila) {
					System.out.println(todos);	
				}
			break;
			default:
				System.out.println("Erro, escolha um valor de 0 a 4.");
			}
		
		
		
		}	do {
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
