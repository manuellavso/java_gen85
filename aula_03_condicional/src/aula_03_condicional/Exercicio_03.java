package aula_03_condicional;

import java.util.Scanner;

public class Exercicio_03 {//Condicional IF.

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome;
		int idade;
		boolean doarSangue;
		
		System.out.print("Digite o nome do doador(a): ");
		nome = leia.next();	
		System.out.print("Digite a idade do doador(a): ");
		idade = leia.nextInt();
		System.out.print("Primeira doação de sangue? ");
		doarSangue = leia.nextBoolean();
		
		if(idade < 18) {
			System.out.printf("%s não está apto(a) para doar sangue", nome);
		}else if (idade >= 18 && idade < 60){
			System.out.printf("%s está apto(a) para doar sangue", nome);
		}else if(idade >= 60 && doarSangue == false) {
			System.out.printf("%s está apto(a) para doar sangue", nome);
		}else {
			System.out.printf("%s não está apto(a) para doar sangue", nome);
		}
		
		
		leia.close();
	}

}
