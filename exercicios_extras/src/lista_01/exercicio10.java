package lista_01;

import java.util.Scanner;

public class exercicio10 {//Laços de repetição

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero;
		
		System.out.print("Digite um número inteiro: ");
		numero = leia.nextInt();
		
		System.out.printf("\nOs divisores positivos do número %d são: ", numero);
		System.out.println();
		for (int i = 1; i <= numero ; i++) {
			if(numero % i == 0)
			System.out.println(i);
		}
		
		leia.close();
	}

}
