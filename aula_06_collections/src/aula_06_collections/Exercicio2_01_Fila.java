package aula_06_collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio2_01_Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		char continua = '4';
		int opcao;
		
		Scanner leia = new Scanner(System.in);
		
		while(continua == '4') {
			System.out.println("▛▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▜");
			System.out.println("⛶		● M E N U 🏦💰💵 ●	     ⛶");
			System.out.println("⛶ 1 - Adicionar novo cliente na fila         ⛶");
			System.out.println("⛶ 2 - Listar todos os clientes na fila       ⛶");
			System.out.println("⛶ 3 - Retirar um cliente da fila             ⛶");
			System.out.println("⛶ 0 - Sair                                   ⛶");
			System.out.println("▙▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▟");
			System.out.print("Digite a opção desejada: ");
				opcao = leia.nextInt();
				leia.nextLine(); //Para limpar o buffer
		
		//Adicionar cliente:
		if(opcao == 1) {
			System.out.print("Digite seu nome: ");
			fila.add(leia.nextLine());
			
			System.out.println("Cliente adicionado!");
			
			}//Listar os clientes:
			else if(opcao == 2) {
				if(!fila.isEmpty()) {
				System.out.println("Os clientes na fila são: ");
				for(var todosClientes : fila) {
					System.out.println(todosClientes);	
				}
				}else if(fila.isEmpty()) {
					System.out.println("A fila está vazia - null");
				}
			}//Retirar um cliente da fila e mostrar os que sobraram:
				else if(opcao == 3) {		
					System.out.println("Cliente removido: "+fila.poll());	
					System.out.println("Os clientes na fila são: ");
					for(var todosClientes : fila) {
						System.out.println(todosClientes);	
					}
					
			}//Finalizar programa
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