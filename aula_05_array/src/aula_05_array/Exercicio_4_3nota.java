package aula_05_array;

import java.util.Scanner;


public class Exercicio_4_3nota {//Colocar o nome antes de colocar as notas, mas com limite de 0 a 10
	
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);

	String matrizClasse[][] = new String[3][5];
	float soma, nota;
	float media = 0;
	float vetorMedias [] = new float [3];
	String nome;
	
	
		for(int aluno = 0; aluno < matrizClasse.length; aluno++) {
			System.out.print("\nDigite seu nome: ");
			nome = leia.next();
			matrizClasse[aluno][0] = nome;
			soma = 0;
		for(int bimestre = 1; bimestre < matrizClasse[aluno].length; bimestre++) {
			do {
				System.out.printf("%s, digite sua nota: ", matrizClasse[aluno][0]);
				nota = leia.nextFloat();
			
			if(nota < 0 || nota > 10) {
				System.out.println("Nota inválida. Digite novamente");
				}
			}while(nota < 0 || nota > 10);
			
			 	matrizClasse[aluno][bimestre] = String.valueOf(nota);	
			 		soma += nota;	
			
		}
			media = soma/4;
		
			vetorMedias [aluno] = media;
		
			System.out.printf("A média do aluno(a) %s é = %.1f",nome, media);
			System.out.println();

	}
			System.out.println();
			System.out.print("As médias são:");
		for(int contador = 0; contador < vetorMedias.length; contador++) {
			System.out.printf("\nA média de %s é %.1f", matrizClasse[contador][0], vetorMedias[contador]);
	}
		
		
		
	leia.close();
	}
}
