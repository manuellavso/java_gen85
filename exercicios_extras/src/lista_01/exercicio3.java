package lista_01;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {//Variáveis e operadores
		
		Scanner leia = new Scanner(System.in);

		int tempo;
		
		
		System.out.print("Digite o tempo: ");
		tempo = leia.nextInt();
		
		int horas = Math.floorDiv(tempo, 3600);
		int minutos = Math.floorDiv((tempo%3600), 60);
		int segundos = tempo % 60;
		
		System.out.println("O tempo expresso em (hora:min:seg) = " + horas+ ":" +minutos+ ":" +segundos);
		
		
		leia.close();
	}

}
