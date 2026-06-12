package aula_02_operadores;

import java.util.Scanner;

public class Exercicio_02 {//Atividade do módulo 5.

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		float numero1;
		float numero2;
		float numero3;
		float numero4;
		
		System.out.print("A primeira nota é: ");
		numero1 = leia.nextFloat();
		System.out.print("A segunda nota é: ");
		numero2 = leia.nextFloat();
		System.out.print("A terceira nota é: ");
		numero3 = leia.nextFloat();
		System.out.print("A quarta e última nota é: ");
		numero4 = leia.nextFloat();
	
		float soma= numero1+numero2+numero3+numero4;
		
		System.out.printf("\n %.1f + %.1f + %.1f + %.1f = %.1f", numero1, numero2, numero3, numero4, soma);
		System.out.printf("\n %.1f / 4 = %.1f", soma, soma / 4);
		float media= soma /4 ;
		
		System.out.printf("\n Sua média final é: %.1f", media);
		
		leia.close();
	}

}
