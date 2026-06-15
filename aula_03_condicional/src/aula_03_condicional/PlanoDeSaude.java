package aula_03_condicional;

import java.util.Scanner;
//Exemplo: simulação de venda de plano de saúde.
public class PlanoDeSaude {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.print("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.print("Digite a sua idade: ");
		idade = leia.nextInt();
		
		/**
		 * 0 - 10 anos = R$150,00
		 * 11 - 29 anos = R$300,00
		 * 30 - 45 anos = R$500,00
		 * 46 - 59 anos = R$750,00
		 * 60 - 65 anos = R$900,00
		 * acima 65 anos = R$1200,00
		 */
		
		System.out.printf("%s\n", nome);
		
		if(idade >0 && idade <= 10) {
			System.out.println("Seu plano é de R$150,00 por mês.");
		}else if (idade>10 && idade<=29) {
			System.out.println("Seu plano é de R$300,00 por mês.");
		}else if (idade>=30 && idade <=45) {
			System.out.println("Seu plano é de R$500,00 por mês.");
		}else if(idade>=46 && idade <=59) {
			System.out.println("Seu plano é de R$750,00 por mês.");
		}else if(idade>=60 && idade<=65) {
			System.out.println("Seu plano é de R$900,00 por mês.");
		}else {
			System.out.println("Seu plano é de R$1.200,00 por mês.");
		}
		
		
		
		leia.close();
	}

}
