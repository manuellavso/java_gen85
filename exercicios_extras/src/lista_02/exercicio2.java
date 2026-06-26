package lista_02;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio2 {//ArrayList

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cliente = new ArrayList<String>();
		int opcao;
		
		while (true) {
		System.out.println();
		System.out.println("M E N U:	");  
		System.out.println("________________________________");  
		System.out.println("1 - Cadastrar cliente;");  
		System.out.println("2 - Remover cliente; ");  
		System.out.println("3 - Listar todos os clientes;");  
		System.out.println("0 - Sair");  
		System.out.println();  
		System.out.print("Digite a opção desejada: ");  
		opcao = leia.nextInt();		
		
		switch(opcao) {
		case 0:
			encerrar();
		break;
		case 1:
			System.out.print("Digite seu nome: ");
			cliente.add(leia.next());
			System.out.println("Cliente adicionado!");
		break;
		case 2:
			System.out.print("Digite qual cliente deseja excluir: ");
			String buscar = leia.next();
			boolean encontrado = false;
			
			for(int i =0; i < cliente.size(); i++) {
				if(cliente.get(i).equalsIgnoreCase(buscar)) {
					cliente.remove(i);
					System.out.println("Cliente removido!");
					encontrado = true;
					break;
				}
			}	if(!encontrado) {
					System.out.println("Cliente não encontrado!");
		}
		break;
		case 3:
			if(!cliente.isEmpty()) {
				System.out.println("Os clientes são: ");
				for(var clientes : cliente) {
					System.out.println(clientes);
				}
			}else {
				System.out.println("Não há clientes!");
				  }
		default:
			System.out.println("Erro, escolha um valor de 0 a 4.");
			} leia.close();
		}
	
	}
	public static void encerrar() {
		System.out.println("Porgrama finalizado!");
		System.exit(0);
	}
	
}
