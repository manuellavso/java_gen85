package lista_01;

import java.util.Scanner;

public class exercicio1 {//Variáveis e operadores

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float numero;
		float area;
		
		System.out.print("Digite o raio do círculo: ");
		numero = leia.nextFloat();
		
		area = (float) (Math.PI * (numero*numero));
		System.out.printf("%nA área do círculo é: %.2f",area);
		
		
		
		leia.close();
	}

}
