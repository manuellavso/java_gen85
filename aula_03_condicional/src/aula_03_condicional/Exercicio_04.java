package aula_03_condicional;

import java.util.Scanner;

public class Exercicio_04 {//Condicional IF.

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String palavra1, palavra2, palavra3;
		
		System.out.print("Digite se o animal é vertebrado ou invertebrado: ");
		palavra1 = leia.next();	
		System.out.print("Digite se o animal é ave ou mamífero: ");
		palavra2 = leia.next();
		System.out.print("Digite se o animal é carnívoro ou onívoro: ");
		palavra3 = leia.next();	
		
		String resultado = palavra1 + palavra2 + palavra3;
		
		
		if(resultado.equalsIgnoreCase("vertebradoavecarnivoro")) {	
				System.out.println("Águia");
		}else if (resultado.equalsIgnoreCase("vertebradoaveonivoro")){
			System.out.println("Pomba");
		}else if (resultado.equalsIgnoreCase("vertebradomamiferoonivoro")){
			System.out.println("Homem");
		}else if (resultado.equalsIgnoreCase("vertebradomamiferoherbivoro")){
				System.out.println("Vaca");
		}else if (resultado.equalsIgnoreCase("invertebradoinsetohematofago")){
			System.out.println("Pulga");
		}else if (resultado.equalsIgnoreCase("invertebradoinsetoherbivoro")){
			System.out.println("Lagarta");
		}else if (resultado.equalsIgnoreCase("invertebradoanelideohematofago")){
			System.out.println("Sanguessuga");
		}else if (resultado.equalsIgnoreCase("invertebradoanelideoonivoro")){
			System.out.println("Minhoca");
		}else {
			System.out.println("Resposta inválida.");
		}
			
		leia.close();
	}

}
