package aula_03_condicional;

import java.util.Scanner;

public class Exercicio_01 {//Condicional IF.

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numeroA, numeroB, numeroC;
		
		System.out.print("Digite o valor inteiro A: ");
		numeroA = leia.nextInt();	
		System.out.print("Digite o valor inteiro B: ");
		numeroB = leia.nextInt();
		System.out.print("Digite o valor inteiro C: ");
		numeroC = leia.nextInt();
		
		System.out.printf("%d+%d=%d\n", numeroA, numeroB, numeroA+numeroB);

		
		if(numeroA+numeroB < numeroC) {
			System.out.println("A soma de A+B é menor que o valor de C");
		}else if(numeroA+numeroB > numeroC){
			System.out.println("A soma de A+B é maior que o valor de C");
		}else {
			System.out.println("A soma de A+B é igual ao valor de C");
		}
		
		
		leia.close();
	}

}
