package aula_05_array;

import java.util.Scanner;

public class Exercicio_04 {//Matrizes 

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		float matrizClasse[][] = new float[10][4];
		float soma;
		float media = 0;
		float vetorMedias [] = new float [10];

		
		
		for(int linha = 0; linha < matrizClasse.length; linha++) {
				soma = 0;
			for(int coluna = 0; coluna < matrizClasse[linha].length; coluna++) {
				System.out.printf("\nDigite um número para a posição [%d][%d]: ", linha, coluna);
				 matrizClasse[linha][coluna] = leia.nextFloat();	
					soma += matrizClasse[linha][coluna];	
					
					
			}
				media = soma/4;
			
				vetorMedias [linha] = media;
			
				System.out.printf("\nVetor média[%d] = %.1f", linha, media);


		}
		
		for(int contador = 0; contador < vetorMedias.length; contador++) {
			System.out.printf("\nVetor Medias[%d] = %.1f", contador, vetorMedias[contador]);
		}
		
		leia.close();
	}
}
	