package atividade_01; //Simulação de calculadora:

import java.util.Scanner;

public class Exercicio3 {//Atividade avaliada.

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float numero1, numero2;
		int operacao;
		
		System.out.println("┎————————————————————————————————┐");
		System.out.println("│	 Operadores  	 			");
		System.out.println("│————————————————————————————————");
		System.out.println("│	1 - Soma				");
		System.out.println("│	2 - Subtração		 	");
		System.out.println("│	3 - Multiplicação 		");
		System.out.println("│	4 - Divisão				");
		System.out.println("└————————————————————————————————┛");
		
		System.out.print("Digite o primeiro número: ");
		numero1 = leia.nextFloat();
		System.out.print("Digite o segundo número: ");
		numero2 = leia.nextFloat();	
		System.out.print("Escolha a operação: ");
		operacao = leia.nextInt();
				
		switch(operacao) {
		case 1: 
			System.out.printf("\nOperação realizada: Soma | Cálculo: %.1f + %.1f | Resultado: %.1f", numero1, numero2, numero1+numero2);
		break;
		case 2:
			System.out.printf("\nOperação realizada: Subtração | Cálculo: %.1f - %.1f | Resultado: %.1f", numero1, numero2, numero1-numero2);
		break;
		case 3:
			System.out.printf("\nOperação realizada: Multiplicação | Cálculo: %.1f x %.1f | Resultado: %.1f", numero1, numero2, numero1*numero2);

		break;
		case 4:
			if(numero2 != 0) {
				System.out.printf("\nOperação realizada: Divisão | Cálculo:  %.1f : %.1f | Resultado: %.1f", numero1, numero2, numero1/numero2);
			}else {
				System.out.println("Operação inválida!");
			}
		break;
		default:
			System.out.print("Operação inválida!");
		}
		
				
		leia.close();
		
		
	}

}
