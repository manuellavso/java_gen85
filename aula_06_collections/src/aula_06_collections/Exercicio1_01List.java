package aula_06_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1_01List {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		for(int contador = 0 ; contador < 5 ; contador++) {
			System.out.print("Digite uma cor: ");
			cores.add(leia.nextLine());
		}
				
		//Mostrar todas as cores:
		System.out.println("Lista de todas as cores: ");
		for(var colours: cores) {
			System.out.println(colours);
		}
		
		System.out.println("                    ");
		
		//Ordenar em ordem:
		cores.sort(null);
		System.out.println("Lista das cores em ORDEM: ");
		for(var colours: cores) {
			System.out.println(colours);
		
		}
		leia.close();
	}

}
