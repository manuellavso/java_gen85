package aula_06_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1_02List {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int number;
		
			numeros.add(2); numeros.add(5); numeros.add(1); numeros.add(3);
			numeros.add(4); numeros.add(9); numeros.add(7); numeros.add(8);
			numeros.add(10); numeros.add(6);
			
			System.out.print("Digite um número inteiro: ");
			number = leia.nextInt();
			
			if(number >0 && number <=10) {
			//Acha o índice do objeto(number):
				System.out.println("O número " +number+ " está localizado na posição: "+ numeros.indexOf(number));

			}else {
				System.out.println("O número " +number+ " não foi encontrado!");
			}
			
			

	}

}
