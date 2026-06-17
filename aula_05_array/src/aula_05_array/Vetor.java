package aula_05_array;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Vetor inicializado com dados:
		int vetorInteiros[] = {10,20,70,45,78,100, 35, 70};
		
		//Vetor vazio, só com a quantidade de posições declarada:
		float vetorReais[] = new float[5];
		
		
		
		//Listar todos os dados do vetor de inteiros (com for):
		for(int contador = 0; contador < vetorInteiros.length; contador++) {
			System.out.printf("\nvetorInteiros[%d] = %d", contador, vetorInteiros[contador]);
		}//Obs: a variável for é de escopo local, só existe dentro do for.
		
		System.out.println("\nTamanho do Vetor de Inteiros: "+ vetorInteiros.length);

		
		
		//Inserir dados no vetor de reais:
		for(int contador = 0; contador < vetorReais.length; contador++) {
			System.out.printf("Digite um valor real para a posição vetorReais[%d]: ", contador);
			vetorReais[contador] = leia.nextFloat();
		}
		
		//Ordena o vetor em ordem crescente (muda a ordem no vetor)
		Arrays.sort(vetorReais);
		
		//Listar todos os dados do vetor de reais em ordem decrescente (não muda ordem do vetor):
		for(int contador = vetorReais.length - 1; contador >=0 ; contador++) {
			System.out.printf("\nvetorReais[%d] = %.2f", contador, vetorReais[contador]);
		}
		
		System.out.println("\nTamanho do Vetor de Reais: "+ vetorReais.length);

		System.out.println("Qual é o índice do valor 10 no vetor de reais? "+ Arrays.binarySearch(vetorReais, 10));
		
		leia.close();
	}

}
