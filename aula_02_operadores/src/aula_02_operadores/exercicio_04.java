package aula_02_operadores; 

import java.util.Scanner;

public class exercicio_04 {//Atividade do módulo 5.

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		float numero1, numero2, numero3, numero4;
		
		System.out.print("O valor do primeiro número é: ");
		numero1 = leia.nextFloat();
		System.out.print("O valor do segundo número é: ");
		numero2 = leia.nextFloat();
		
		float produto1 = numero1 * numero2;
		System.out.printf("O produto dos dois primeiros números é: %.1f", produto1);
		
		System.out.print("\n O valor do terceiro número é: ");
		numero3 = leia.nextFloat();
		System.out.print("O valor do quarto número é: ");
		numero4 = leia.nextFloat();
		
		float produto2 = numero3 * numero4;
		System.out.printf("O produto dos outros dois números é: %.1f", produto2);

		float diferencaDosProdutos = produto1 - produto2;
		System.out.printf("\n %.1f - %.1f = %.1f", produto1, produto2, diferencaDosProdutos);
		System.out.printf("\n A diferença do produto entre o 1°número e o 2°número pelo produto do 3°número com o 4°número é de: %.1f", diferencaDosProdutos);
		
		leia.close();
	}

}
