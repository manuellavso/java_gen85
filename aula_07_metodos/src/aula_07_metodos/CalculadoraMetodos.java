package aula_07_metodos;

import java.util.Scanner;

public class CalculadoraMetodos {
//Caso o Scanner estivesse aqui, seria global.
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); //Scanner local.
			
		double numero1, numero2;

		System.out.println("*** CALCULADORA BÁSICA ***");
			
		System.out.print("Digite o primeiro número: ");
		numero1 = leia.nextDouble();
			
		System.out.print("Digite o segundo número: ");
		numero2 = leia.nextDouble();
			
		System.out.printf("%n %.2f + %.2f = %.2f", numero1, numero2, somar(numero1, numero2));
		System.out.printf("%n %.2f - %.2f = %.2f", numero1, numero2, subtrair(numero1, numero2));
		System.out.printf("%n %.2f * %.2f = %.2f", numero1, numero2, multiplicar(numero1, numero2));
		System.out.printf("%n %.2f / %.2f = %.2f", numero1, numero2, dividir(numero1, numero2));
		
		sobre();
		
		leia.close();
	}
	public static double somar(double num1, double num2) {
			return num1+num2;
	}
	public static double subtrair(double numero1, double numero2) {
			return numero1-numero2;
	}
	public static double multiplicar(double numero1, double numero2) {
		return numero1*numero2;
	}
	public static double dividir(double numero1, double numero2) {
		return numero1/numero2;
	}
	public static double potencia(double numero1, double numero2) {
		return Math.pow(numero1, numero2);
	}
	
	
	public static void sobre() {
		System.out.println();
		System.out.println("Projeto calculadora básica.");
		System.out.println("Desenvolvido por: Manuella.");
	}
	
}
