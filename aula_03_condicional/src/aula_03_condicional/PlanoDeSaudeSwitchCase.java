package aula_03_condicional;

import java.util.Scanner;

public class PlanoDeSaudeSwitchCase {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String nome;
		int faixaEtaria;
		
		System.out.print("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.println("***********************************************************");
		System.out.println("		F A I X A   E T Á R I A						");
		System.out.println("***********************************************************");
		System.out.println("		1 - De 0 a 10 anos de idade							");
		System.out.println("		2 - De 11 a 29 anos de idade						");
		System.out.println("		3 - De 30 a 45 anos de idade						");
		System.out.println("		4 - De 46 a 59 anos de idade						");
		System.out.println("		5 - De 60 a 65 anos de idade						");
		System.out.println("		6 - Acima de 65 anos de idade						");
		System.out.println("***********************************************************");

		System.out.print("Escolha a sua faixa etária: ");
		faixaEtaria = leia.nextInt();
		
		System.out.printf("%s\n", nome);
		
		switch(faixaEtaria) {
			case 1:
				System.out.println("Seu plano é de R$150,00 por mês.");
			break;
			case 2:
				System.out.println("Seu plano é de R$300,00 por mês.");
			break;
			case 3:
				System.out.println("Seu plano é de R$500,00 por mês.");
			break;
			case 4:
				System.out.println("Seu plano é de R$750,00 por mês.");
			break;
			case 5:
				System.out.println("Seu plano é de R$900,00 por mês.");
			break;
			case 6:
				System.out.println("Seu plano é de R$1.200,00 por mês.");

			break;
			default:
				System.out.println("Opção inválida, o número escolhido deve ser de 1 à 6.");
		}
		
		
		
		leia.close();
	}

}
