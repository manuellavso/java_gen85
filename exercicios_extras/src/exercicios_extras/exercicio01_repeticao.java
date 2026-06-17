package exercicios_extras;

import java.util.Scanner;

public class exercicio01_repeticao {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero1, numero2;
		
		System.out.print("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		
		System.out.print("Digite o primeiro número: ");
		numero2 = leia.nextInt();
		
		if(numero1>numero2) {
			System.out.println("Intervalo inválido!");
		}else {
			
			System.out.printf("\n No intervalo entre %d e %d. Os números pares são:  ", numero1, numero2);
		}
		
			for(int contador = numero1; contador <= numero2 ; contador ++) {
				if(contador % 2 == 0) {
					System.out.printf("\n %d", contador);
				}
			
		leia.close();
		}
	}
}
