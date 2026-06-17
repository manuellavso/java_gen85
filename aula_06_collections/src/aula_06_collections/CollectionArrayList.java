package aula_06_collections;

import java.util.ArrayList;
import java.util.Comparator;

public class CollectionArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(1);
		numeros.add(3);
		numeros.add(5);
		numeros.add(7);
		numeros.add(9);
		numeros.add(7);
		
		for(int numero: numeros) {
			System.out.println(numero);
		}
		
		//Encontra o objeto que está no índice.
		System.out.println("O objeto está presente no índice 1: "+ numeros.get(1));
		//Acha o índice do objeto.
		System.out.println("O índice do objeto 7: "+ numeros.indexOf(7));

		//Set = altera um objeto nome.set(indice, novo valor):
		numeros.set(3, 25);
		
		for(int numero: numeros) {
			System.out.println(numero);
		}
		
		//Remover/excluir alguma coisa (pelo índice):
		numeros.remove(0);
		
		for(int numero: numeros) {
			System.out.println(numero);
		}
	
		//Mostra os números em ordem crescente
		numeros.sort(null);
		
		//Pega os elementos do início e joga para o final (troca as posições dos elementos):
		numeros.sort(Comparator.reverseOrder());
		
	}
}
