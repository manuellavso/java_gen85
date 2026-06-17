package exercicios_extras;

import java.util.Scanner;

public class exercicio02_repeticao {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero, contador = 0;
		int positivos = 0, negativos =0;
		
		for(numero = 1; contador < 8; contador++) {
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		if(numero>0)
			positivos++;
			
		if(numero<0)
			negativos++;
		
		}
		
		System.out.printf("\nTotal de números positivos: %d", positivos);
		System.out.printf("\nTotal de números negativos: %d", negativos);

		
		leia.close();
	}

}
