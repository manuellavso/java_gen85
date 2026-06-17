package aula_05_array;

import java.util.Scanner;

public class Exercicio_01 {//Vetores

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int vetorNumero[] = {2,5,1,3,4,9,7,8,10,6};
		int numero;
		Integer posicao = null;
		
		
		System.out.print("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		
		for(int contador = 0; contador < vetorNumero.length ; contador++ ) {
			if(vetorNumero[contador] == numero) {
				posicao = contador;
			}
		}
		
		if(numero>10 || numero<=0) {
			System.out.printf("\nO número %d não foi encontrado!", numero);
		}else {
			System.out.printf("\nO número %d está localizado na posição: %d", numero, posicao);

		
		}
		
		leia.close();
	}
}
