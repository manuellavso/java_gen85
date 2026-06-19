package aula_06_collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionFila {//Queue
	//Tira sempre o primeiro objeto.
	//Não tem índice.

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Thiago");
		fila.add("Guilherme");
		fila.add("Higor");
		fila.add("Sara");
		fila.add("Bella");
		
	//	System.out.println("Digite o nome do cliente: ");
	//	fila.add(leia.next());
		
		fila.remove();
		
		fila.contains("Sara"); //Encontra elemento
		System.out.println("A Sara ainda está na fila? " + fila.contains("Sara"));

		for(var clientes : fila) {
			System.out.println(clientes);
		}
		
		
		leia.close();
	}

}
