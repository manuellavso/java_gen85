package aula_03_condicional;

import java.util.Scanner;

public class Exercicio_05 {//Condicional Switch case.

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int codigo, quantidade;
		
		System.out.println("***********************************************************");
		System.out.println("		C A R D Á P I O						");
		System.out.println("***********************************************************");
		System.out.println("		1 - Cachorro quente - R$10,00 unidade							");
		System.out.println("		2 - X-Salada - R$15,00 unidade						");
		System.out.println("		3 - X-Bacon - R$18,00 unidade						");
		System.out.println("		4 - Bauru - R$12,00 unidade						");
		System.out.println("		5 - Refrigerante - R$8,00 unidade						");
		System.out.println("		6 - Suco de laranja - R$13,00 unidade						");
		System.out.println("***********************************************************");
		
		
		System.out.print("Escolha o produto digitando o código: ");
		codigo = leia.nextInt();
		
		System.out.print("Escolha a quantidade desejada: ");
		quantidade = leia.nextInt();
				
		switch(codigo) {
		case 1:
			System.out.printf("Produto escolhido: Cachorro quente - Valor total: R$%d.", (10*quantidade));
		break;
		case 2:
			System.out.printf("Produto escolhido: X-Salada - Valor total: R$%d.", (15*quantidade));
		break;
		case 3:
			System.out.printf("Produto escolhido: X-Bacon - Valor total: R$%d.", (18*quantidade));
		break;
		case 4:
			System.out.printf("Produto escolhido: Bauru - Valor total: R$%d.", (12*quantidade));
		break;
		case 5:
			System.out.printf("Produto escolhido: Refrigerante - Valor total: R$%d.", (8*quantidade));
		break;
		case 6:
			System.out.printf("Produto escolhido: Suco de laranja - Valor total: R$%d.", (13*quantidade));

		break;
		default:
			System.out.println("Opção inválida, o código do produto escolhido deve ser de 1 à 6.");
	}
		
		leia.close();
	}

}
