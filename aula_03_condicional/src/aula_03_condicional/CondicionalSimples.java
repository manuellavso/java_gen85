package aula_03_condicional;

import java.util.Scanner;

public class CondicionalSimples {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int numero = leia.nextInt();
		
		if(numero > 10 && numero < 100) {
			System.out.println("O número digitado está entre 10 e 100!");
		}
		
		System.out.println("*** Fim do programa ***");
		
		
		leia.close();
	}

}
