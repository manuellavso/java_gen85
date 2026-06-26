package atividade_01; //Análise de idade e acesso:

import java.util.Scanner;

public class Exercicio1 {//Atividade avaliativa.

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome;
		int idade;
		boolean autorizacao;
		
		System.out.print("Digite seu nome: ");
		nome = leia.nextLine();
		System.out.print("Digite a sua idade: ");
		idade = leia.nextInt();	
		System.out.print("Você possui autorização dos seus responsáveis? ");
		autorizacao = leia.nextBoolean();
		
		if(idade >= 18) {
			System.out.printf("Acesso liberado para %s.", nome);
		}else if (idade < 18 && autorizacao == true){
			System.out.printf("Acesso liberado com autorização para %s.", nome);
		}else if(idade < 18 && autorizacao == false) {
			System.out.printf("Acesso negado para %s.", nome);
		}else {
			System.out.printf("Acesso negado para %s.", nome);
		} leia.close();
	}

}
