package atividade_01; //Classificação de nota do aluno(a):

import java.util.Scanner;

public class Exercicio2 {//Atividade avaliada.

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome;
		float notaFinal;
		
		System.out.print("Digite seu nome: ");
		nome = leia.nextLine();
		System.out.print("Digite a sua nota final: ");
		notaFinal = leia.nextFloat();	
		
		if(notaFinal >= 7 && notaFinal <=10) {
			System.out.printf("Parabéns!! Aluno(a): %s | Nota: %.1f | Situação: Aprovado(a).", nome, notaFinal);
		}else if (notaFinal >=5 && notaFinal < 7){
			System.out.printf("Dá tempo de passar! Aluno(a): %s | Nota: %.1f | Situação: Em recuperação.", nome, notaFinal);
		}else if(notaFinal < 5){
			System.out.printf("Que pena... Aluno(a): %s | Nota: %.1f | Situação: Reprovado(a).", nome, notaFinal);
		}else {
			System.out.printf("Dados inválidos.");
		}
		
		leia.close();
	}

}
