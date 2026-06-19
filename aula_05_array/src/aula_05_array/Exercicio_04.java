package aula_05_array;

import java.util.Scanner;

public class Exercicio_04 {//Matrizes 

public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		float matrizClasse[][] = new float[2][4];
		float soma;
		float media = 0;
		float vetorMedias [] = new float [2];

		
		
		for(int aluno = 0; aluno < matrizClasse.length; aluno++) {
				soma = 0;
			for(int bimestre = 0; bimestre < matrizClasse[aluno].length; bimestre++) {
				System.out.printf("\nDigite um número para a posição [%d][%d]: ", aluno, bimestre);
				 matrizClasse[aluno][bimestre] = leia.nextFloat();	
					soma += matrizClasse[aluno][bimestre];	
					
					
			}
				media = soma/4;
			
				vetorMedias [aluno] = media;
			
				System.out.printf("\nA média do aluno [%d] é = %.1f", aluno, media);


		}
		
		for(int contador = 0; contador < vetorMedias.length; contador++) {
			System.out.printf("\nAs médias dos alunos são[%d] = %.1f    ", contador, vetorMedias[contador]);
		}
		
		leia.close();
	}

}
	