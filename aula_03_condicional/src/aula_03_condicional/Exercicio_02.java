package aula_03_condicional;

import java.util.Scanner;

public class Exercicio_02 {//Condicional IF.

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero;
	
		System.out.print("Digite um número inteiro: ");
		numero = leia.nextInt();	
		
		if(numero >= 0 && numero % 2==0) {
			System.out.printf("O número %d é par e positivo!", numero);
		}else if (numero >= 0 && numero % 2!=0){
			System.out.printf("O número %d é impar e positivo!", numero);
		}else if(numero< 0 && numero % 2==0) {
			System.out.printf("O número %d é par e negativo!", numero);
		}else {
			System.out.printf("O número %d é impar e negativo!", numero);
		}
	
		leia.close();
	}

}
