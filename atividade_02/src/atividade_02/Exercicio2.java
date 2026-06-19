package atividade_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {//Cadastro de Alunos:

		Scanner leia = new Scanner(System.in);

		ArrayList<String> alunos = new ArrayList<String>();
		ArrayList<Integer> idades = new ArrayList<Integer>();
		ArrayList<Float> notaFinal = new ArrayList<Float>();
		char continua = 'S';
		int opcao;
		float soma = 0, media = 0;
		
		//Ficar repetindo quantas vezes o usuario quiser
		while(continua == 'S') {
			System.out.println();
			System.out.println("▛▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▜");
			System.out.println("	⫸ Escolha a opção desejada: ");
			System.out.println(" 1 - Adicionar um novo aluno a coleção         ");
			System.out.println(" 2 - Listar todos os alunos cadastrados       ");
			System.out.println(" 3 - Calcular média geral das notas             ");
			System.out.println("▙▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▟");
			System.out.print("Digite a opção desejada: ");
				opcao = leia.nextInt();
				leia.nextLine(); //Para limpar o buffer
		
		//Adicionar aluno:
		if(opcao == 1) {
			System.out.print("\nDigite o nome do aluno(a): ");
			alunos.add(leia.nextLine());
			
			System.out.print("Digite a idade do aluno(a): ");
			idades.add(leia.nextInt());
			
			System.out.print("Digite a nota final do aluno(a): ");
			notaFinal.add(leia.nextFloat());
			
			System.out.println("Aluno adicionado!");
			
			
			}//Listar todos os alunos cadastrados:
			else if(opcao == 2) {
				if(!alunos.isEmpty()) {
					System.out.println("\n⫸ Lista de todos os alunos");
					for(int i =0; i < alunos.size(); i++) {
						System.out.println("Nome do aluno(a): " +alunos.get(i));
						System.out.println("Idade do aluno(a): " +idades.get(i));
						System.out.println("Nota final do aluno(a): " +notaFinal.get(i));
						System.out.println();
					}
				}else if(alunos.isEmpty()) {
					System.out.println("Não há alunos cadastrados - null");
				}
			
			}//Calcular a soma e depois a média geral das notas:
			else if(opcao == 3) {
				if(!alunos.isEmpty()) {
				for(int i = 0; i < alunos.size(); i++) {
					soma += notaFinal.get(i);
				} media = soma / notaFinal.size();
				
				System.out.printf("\nA média geral das notas é: %.2f ", media);	
				}else if(alunos.isEmpty()) {
					System.out.println("Não há notas cadastrados - null");
				}
			}do {//Parar quando o usuário digitar N
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
