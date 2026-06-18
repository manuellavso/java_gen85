package aula_06_collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionPilha {

	public static void main(String[] args) {

		Deque<String> pilha = new ArrayDeque<String>();
		
		pilha.push("Azul");
		pilha.push("Verde");
		pilha.push("Amarelo");
		pilha.push("Branco");
		pilha.push("Rosa");
		pilha.push("Laranja"); //O último a ser inserido é o primeiro da lista.

		pilha.pop(); //Remove o último elemento da pilha.
		
		
		System.out.println("A cor rosa ainda está na Pilha? "+ pilha.contains("Rosa"));
		
		for(var cor : pilha) {
			System.out.println(cor);
		}
		
		
	}

}
