package aula_05_array;

import java.util.Scanner;

public class Exercicio_4_2 {//Colocar o nome antes de colocar as notas
	
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);

	String matrizClasse[][] = new String[3][5];
	float soma;
	float media = 0;
	float vetorMedias [] = new float [3];
	String nome;
	
	
		for(int aluno = 0; aluno < matrizClasse.length; aluno++) {
			System.out.print("\nDigite seu nome: ");
			nome = leia.next();
			matrizClasse[aluno][0] = nome;
			soma = 0;
		for(int bimestre = 1; bimestre < matrizClasse[aluno].length; bimestre++) {
			System.out.printf("%s, digite sua nota: ", matrizClasse[aluno][0]);
			 matrizClasse[aluno][bimestre] = leia.next();	
			 		soma += Float.parseFloat(matrizClasse[aluno][bimestre].replace(",", "."));	
	
		}
			media = soma/ (matrizClasse[aluno].length - 1);
		
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
