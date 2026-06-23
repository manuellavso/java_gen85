package lista_02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercicio3 {//SET

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Set<String> carro = new HashSet<String>();
		int opcao;
		char continua = 'S';
		
		while(continua == 'S') {
		System.out.println();
		System.out.println("M E N U:	");  
		System.out.println("________________________________");  
		System.out.println("1 - Adicionar nova placa");  
		System.out.println("2 - Verificar se a placa já entrou ");  
		System.out.println("3 - Exibir todas as placas");  
		System.out.println("0 - Sair");  
		System.out.println();  
		System.out.print("Digite a opção desejada: ");  
		opcao = leia.nextInt();		
		
		switch(opcao) {
		case 0:
			encerrar();
		break;
		case 1:
			System.out.print("Digite a placa do veículo:");
			carro.add(leia.next());
			
			System.out.println("Placa adicionada.");
		break;
		case 2:
			System.out.println("Digite a placa:");
			String buscarProduto = leia.next();
			
					if(carro.contains(buscarProduto)) {
						System.out.println("Essa placa já foi registrada/entrou.");
			}else {
				System.out.println("Placa não encontrada!");
			}
		break;
		case 3:
			if(!carro.isEmpty()){
			System.out.println("Todas as placas:");
			for(var placas : carro) {
				System.out.println(placas);
			}
			}else if(carro.isEmpty()) {
				System.out.println("Nenhuma placa registrada.");
			}
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
