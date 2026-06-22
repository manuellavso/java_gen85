package lista_01;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio5 {//Laços condicionais

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int valor[] = new int[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.print("Digite um valor inteiro: ");
			valor[i] = leia.nextInt();
		}
		System.out.println();
		System.out.println("Números digitados: ");
		for(int i = 0; i < 3; i++) {
		System.out.println(+valor[i]);
		}
		
		//Ordem crescente:
		Arrays.sort(valor);
		System.out.println();
		System.out.println("Números em ordem crescente: ");
		for(int i = 0; i < 3; i++) {
		System.out.println(+valor[i]);
		}
		
		
		//Ordem decrescente:
		System.out.println();
		System.out.println("Números em ordem decrescente: ");
		for(int i = 2; i >= 0; i--) {
		System.out.println(+valor[i]);
		}
		
		leia.close();
	}

}
