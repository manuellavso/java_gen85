package aula_03_condicional;

import java.util.Scanner;

public class Exercicio_06 {//Condicional Swtich Case.

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String colaborador;
		int codigoCargoColaborador;
		float salario;
		
		System.out.println("***********************************************************");
		System.out.println("		C A R G O S					");
		System.out.println("***********************************************************");
		System.out.println("		1 - Gerente							");
		System.out.println("		2 - Vendedor						");
		System.out.println("		3 - Supervisor						");
		System.out.println("		4 - Motorista						");
		System.out.println("		5 - Estoquista						");
		System.out.println("		6 - Técnico de TI						");
		System.out.println("***********************************************************");
		
		System.out.print("Digite seu nome: ");
		colaborador = leia.next();
		System.out.print("Digite o código do seu cargo: ");
		codigoCargoColaborador = leia.nextInt();	
		System.out.print("Digite seu salário a ser reajustado: R$");
		salario = leia.nextFloat();
		
		switch(codigoCargoColaborador) {
		case 1:
			System.out.printf("\nNome: %s | Cargo: Gerente | Novo salário: R$%.2f", colaborador, salario+(salario*10/100)) ;
		break;
		case 2:
			System.out.printf("\nNome: %s | Cargo: Vendedor | Novo salário: R$%.2f", colaborador, salario+(salario*7/100)) ;
		break;
		case 3:
			System.out.printf("\nNome: %s | Cargo: Supervisor | Novo salário: R$%.2f", colaborador, salario+(salario*9/100)) ;
		break;
		case 4:
			System.out.printf("\nNome: %s | Cargo: Motorista | Novo salário: R$%.2f", colaborador, salario+(salario*6/100)) ;
		break;
		case 5:
			System.out.printf("\nNome: %s | Cargo: Estoquista | Novo salário: R$%.2f", colaborador, salario+(salario*5/100)) ;
		break;
		case 6:
			System.out.printf("\nNome: %s | Cargo: Técnico de TI | Novo salário: R$%.2f", colaborador, salario+(salario*8/100)) ;

		break;
		default:
			System.out.println("Opção inválida.");
	}
		
		
		leia.close();
	}

}
