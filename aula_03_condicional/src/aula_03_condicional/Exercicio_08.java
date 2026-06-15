package aula_03_condicional;

import java.util.Scanner;

public class Exercicio_08 {//Condicional Switch Case.

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float saldo = 1000;
		float saque, deposito;
		int operacao;
		
		System.out.println("***********************************************************");
		System.out.println("		O P E R A Ç Ã O				");
		System.out.println("***********************************************************");
		System.out.println("		1 - Saldo							");
		System.out.println("		2 - Saque						");
		System.out.println("		3 - Depósito						");
		System.out.println("***********************************************************");
		
		System.out.print("Digite o código da operação desejada: ");
		operacao = leia.nextInt();
		
		switch(operacao) {
		case 1:
			System.out.printf("\n Saldo da conta: %.2f", saldo);
		break;
		case 2:
			System.out.print("Digite o valor a ser sacado: R$");
			saque = leia.nextFloat();
			if(saque > saldo) {
				System.out.println("Saldo insuficiente!");
			}else {
				System.out.printf("\n Saldo atual: %.2f | Saque: %.2f | Novo saldo: %.2f", saldo, saque, saldo-saque);
			}
		break;
		case 3:
			System.out.print("Digite o valor a ser depositado: R$");
			deposito = leia.nextFloat();
			if(deposito <= 0) {
				System.out.println("Operação inválida!");
			}else {
				System.out.printf("\n Saldo atual: %.2f | Depósito: %.2f | Novo saldo: %.2f", saldo, deposito, saldo+deposito);
			}
		break;
		default:
			System.out.println("Operação inválida!");
		}
		
		
		leia.close();
	}

}
