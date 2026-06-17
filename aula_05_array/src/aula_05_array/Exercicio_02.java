package aula_05_array;

import java.util.Scanner;

public class Exercicio_02 {//Vetores

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int vetorInteiros[] = new int[10];
		int soma = 0;
		float media = 0f;
		
			//Digitar os números para o vetor:
			for(int contador = 0; contador < vetorInteiros.length; contador++) {
				System.out.printf("Digite um número inteiro para a posição [%d]: ", contador);
				vetorInteiros[contador] = leia.nextInt();
				
			//Soma de todos os valores digitados:
				soma += vetorInteiros[contador];
			}
		
			//Elementos dos indices ímpares:
			for(int contador = 1; contador < vetorInteiros.length; contador+=2) {
				System.out.printf("\nElementos nos índices ímpares: %d", vetorInteiros[contador]);
			}
			
			//Elementos pares:
			for(int contador=0; contador < vetorInteiros.length; contador++) {
				if(vetorInteiros[contador] % 2 == 0) {
					System.out.printf("\nElementos pares: %d", vetorInteiros[contador]);
				}
			}
			
			
		
			//Média de todos os valores digitados:
				media = soma/10;
				
				System.out.printf("\nSoma de todos os valores digitados: %d", soma);
				System.out.printf("\nMedia de todos os valores digitados: %.2f", media);
				
		
		leia.close();
	}

}
