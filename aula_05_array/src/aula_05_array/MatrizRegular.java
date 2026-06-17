package aula_05_array;

import java.util.Scanner;

public class MatrizRegular {//Mesmo número de linhas e colunas.

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		//Matriz com dados:
		int matrizInteiros[][] = {
				{10,15,20}, 	//1° linha = 0
				{45,55,60},     //2° linha = 1
				{75,80,85}};    //3° linha = 2
		//colunas 0  1  2
		
		//Por ser regular, pode usar o length nas duas posições:
		for(int linha = 0; linha < matrizInteiros.length; linha++) {
			for(int coluna = 0; coluna < matrizInteiros.length; coluna++) {
				System.out.printf("\nMatrizInteiros[%d][%d]: %d", linha, coluna, matrizInteiros[linha][coluna]);
				
			}
		}
		
		/* Simplificação do for
		int vetor[] = {1,2,3,4,5};
		
		for (int numero : vetor) {
			System.out.printl(numero);
		}
		
		*/
		
		
		//Matriz sem dados e IRREGULAR:
		double matrizDouble[][] = new double[2][3];
		
		for(int linha = 0; linha < matrizDouble.length; linha++) {
			for(int coluna = 0; coluna < matrizDouble[linha].length; coluna++) {
				System.out.printf("\nDigite um número para a posição [%d][%d]: ", linha, coluna);
				 matrizDouble[linha][coluna] = leia.nextDouble();
				
			}
		}
		//Esses dois pontos : equivale ao contador e ao incremento do contador (ou seja, é como se falasse "percorre tudo").
		//Laço de repetição For Each (lê todo o array)				- é útil para imprimir os valores.
		for (double linha[] : matrizDouble) {
			for(var numero : linha) {
				System.out.println(numero);
			}
		}
		
		
		

		leia.close();
	}

}
