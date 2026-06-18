package aula_06_collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio1_04Set {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		int number;
			
		numeros.add(2); numeros.add(5); numeros.add(1); numeros.add(3);
		numeros.add(4); numeros.add(9); numeros.add(7); numeros.add(8);
		numeros.add(10); numeros.add(6);
				
		System.out.print("Digite o número que você deseja encontrar: ");
		number = leia.nextInt();
				
		if(number >0 && number <=10) {
		//Achar o objeto(number):
			if(numeros.contains(number))
			System.out.println("O número " +number+ " foi encontrado!");

			}else {
				System.out.println("O número " +number+ " não foi encontrado!");
				}
				
				
		}
	}
