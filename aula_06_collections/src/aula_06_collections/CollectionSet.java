package aula_06_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CollectionSet {//Não aceita elementos repetidos.
//Precisa indicar o objeto que quer remover.
	
	public static void main(String[] args) {

		Set<String> frutas = new HashSet<String>();
		ArrayList<String> listaFrutas = new ArrayList<String>(Arrays.asList("Abacaxi", "Pera"));
		
		frutas.add("Abacate");
		frutas.add("abacate");
		frutas.add("Morango");
		frutas.add("Maçã");
		frutas.add("Abacate");
		frutas.add("Laranja");
		frutas.addAll(listaFrutas);

		//For Each
		for(String fruta: frutas) {
			System.out.println(fruta);
			System.out.println(fruta.hashCode());
		}
		
		//Método contains (identificar se existe na lista)
		System.out.println("A fruta laranja está presente? "+ frutas.contains("Laranja"));
		
		//Método de remover elemento
		frutas.remove("Laranja");
		
		for(String fruta: frutas) {
			System.out.println(fruta);
		}
		
		
	}

}
