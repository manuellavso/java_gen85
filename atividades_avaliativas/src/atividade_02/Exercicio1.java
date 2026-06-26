package atividade_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {//Coleção de números e análise:

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		//Variáveis
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int soma = 0;
		float media = 0f;
		
			//Ler os valores digitados:
			for(int contador = 0 ; contador < 5 ; contador++) {
				System.out.print("Digite um número: ");
				numeros.add(leia.nextInt());	
			}
			//Somar os valores:
				for (int n : numeros) {
				soma += n;
				}
			//Tirar a média
			media = soma/5;
			
			System.out.printf("\nA soma é: %d", soma);
			System.out.printf("\nA media é: %.1f", media);
			
			//Por em ordem e pegar o maior número:
			numeros.sort(null);
				System.out.printf("\nO maior valor é: %d", + numeros.get(4));
			
		leia.close();
	}
	
}
