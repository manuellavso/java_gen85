package aleatorios_aula;

import java.util.Scanner;

public class exercicio03_repeticoes {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero = 0, somaPares = 0;
		
		do {
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			somaPares++;
		}
		
		}while(numero!=999);
		
		
		System.out.printf("\nTotal de números pares: %d", somaPares);
		
		leia.close();
	}

}
