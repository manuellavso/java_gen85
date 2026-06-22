package lista_01;

import java.util.Scanner;

public class exercicio6 {//Laços condicionais

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float a, b, c;
		
		System.out.print("Digite o tamanho do lado A: ");
		a = leia.nextFloat();
		
		System.out.print("Digite o tamanho do lado B: ");
		b = leia.nextFloat();
		
		System.out.print("Digite o tamanho do lado C: ");
		c = leia.nextFloat();
		
		if(a >= (b+c)) {
			System.out.println("Não forma triângulo.");
		}else if(a==b && b==c) {
			System.out.println("Triângulo equilátero.");
		}else if((a==b && b!=c) || (a==c && b!=c) || (c==b && b!=a)) {
			System.out.println("Triângulo isósceles.");
		}else if(a!=b && b!=c && c!=a) {
			System.out.println("Triângulo escaleno.");
		}
		
		leia.close();
	}

}
