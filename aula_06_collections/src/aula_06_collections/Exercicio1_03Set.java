package aula_06_collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio1_03Set {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		
		for(int contador = 0 ; contador < 10 ; contador++) {
			System.out.print("Digite um número inteiro: ");
			numeros.add(leia.nextInt());
		}
	
	//Utilizando a Classe Iterator:
		System.out.println("Lista de dados do SET: ");
		for(int numbers : numeros) {
			System.out.println(numbers);
		}
	}
}