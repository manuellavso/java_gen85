package aula_02_operadores; 

import java.util.Scanner;

public class Exercicio_03 {//Atividade do módulo 5.

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horaExtra, descontos;
		
		System.out.print("O salário bruto é de: R$");
		salarioBruto = leia.nextFloat();
		System.out.print("O adicional noturno é de: R$");
		adicionalNoturno = leia.nextFloat();
		System.out.print("A hora extra equivale: R$");
		horaExtra = leia.nextFloat();
		System.out.print("Os descontos são de: R$");
		descontos = leia.nextFloat();
		
		float totalHorasExtras = horaExtra*5;
		float salarioLiquido = salarioBruto+adicionalNoturno+totalHorasExtras-descontos;
		
		
		System.out.printf("\n %.2f + %.2f + %.2f - %.2f = %.2f", salarioBruto, adicionalNoturno, totalHorasExtras, descontos, salarioLiquido);
		System.out.printf("\n O salário líquido é de: R$%.2f", salarioLiquido);
		
		leia.close();
	}

}
