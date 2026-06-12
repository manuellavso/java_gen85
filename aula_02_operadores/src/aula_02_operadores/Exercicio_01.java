package aula_02_operadores; 

import java.util.Scanner;

public class Exercicio_01 {//Atividade do módulo 5.

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario, abono;
		
		System.out.println("*** CÁLCULO DO SALÁRIO ***");
		
		System.out.print("Digite o valor do salário: R$ ");
		salario = leia.nextFloat();
		
		System.out.print("Digite o valor do abono: R$ ");
		abono = leia.nextFloat();
		
		float novoSalario = salario + abono;
		
		System.out.printf("\n Salário atual é de R$%.2f + O abono é de R$%.2f = O novo salário é de R$%.2f", salario, abono, novoSalario);			
		
		
		leia.close();

	}

}
