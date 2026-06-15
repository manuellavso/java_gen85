package aula_03_condicional;

import java.util.Scanner;

public class CondicionalEncadeado {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		float media = 0.0f;
		
		System.out.print("Digite a primeira nota: ");
		float nota1 = leia.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		float nota2 = leia.nextFloat();

		System.out.print("Digite a terceira nota: ");
		float nota3 = leia.nextFloat();

		media = (nota1 + nota2 + nota3) / 3;
		
		if(media >= 6) {
			System.out.println("Parabéns, você foi aprovado(a)!!");
		}else if(media >= 5) {
			System.out.println("Poxa, você está de recuperação!");
			
		}else {
			System.out.println("Que pena, você foi reprovado(a)...");
		}
		
		
		leia.close();
	}

}
