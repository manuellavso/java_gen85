package aula_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoTryCatch {//Try Catch

	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int dividendo = 0;
		int divisor = 0;
		boolean loop = true;
		
		do {
			try {//Vai tentar realizar
				System.out.print("Digite o Dividendo: ");
				dividendo = ler.nextInt();
						
				System.out.print("Digite o Divisor: ");
				divisor = ler.nextInt();
						
				divide(dividendo, divisor);
				
				loop= false;
		
		//Caso de erro, vai pegar esse erro e mostrar uma mensagem
		} catch(InputMismatchException e) {
			System.err.println("Erro de digitação: " +e.getMessage());
			ler.nextLine(); //Limpar o buffer
		}catch(ArithmeticException e) {
			System.err.println("Erro de cálculo: " +e.getMessage());
		} finally {
			System.out.println("Obrigado pela preferência.");
		}
	}while(loop);
		
	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}
