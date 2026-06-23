package lista_02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercicio4 {//SET

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Set<String> sala = new HashSet<String>();
		int opcao;
		char continua = 'S';
		
		while(continua == 'S') {
		System.out.println();
		System.out.println("M E N U:	");  
		System.out.println("________________________________");  
		System.out.println("1 - Adicionar novo aluno");  
		System.out.println("2 - Verificar se aluno está na aula ");  
		System.out.println("3 - Exibir todas os presentes");  
		System.out.println("0 - Sair");  
		System.out.println();  
		System.out.print("Digite a opção desejada: ");  
		opcao = leia.nextInt();		
		
		switch(opcao) {
		case 0:
			encerrar();
		break;
		case 1:
			System.out.print("Digite o nome do aluno:");
			sala.add(leia.next());
			
			System.out.println("Aluno adicionado");
		break;
		case 2:
			System.out.print("Digite o nome do aluno:");
			String buscar = leia.next();
			
					if(sala.contains(buscar)) {
						System.out.println("Aluno presente");
			}else {
				System.out.println("Aluno ausente");
			}
		break;
		case 3:
			if(!sala.isEmpty()){
			System.out.println("Lista de alunos:");
			for(var alunos : sala) {
				System.out.println(alunos);
			}
			}else if(sala.isEmpty()) {
				System.out.println("Nenhuma aluno presente");
			}
		default:
			System.out.println("Erro, escolha um valor de 0 a 3.");
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
