package lista_01;

import java.util.Scanner;

public class exercicio2 {//Variáveis e operadores

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int tempoGasto;
		int velocidadeMedia;
		int rendimento = 12;
		
		System.out.print("Digite o tempo gasto na viagem (em horas): ");
		tempoGasto = leia.nextInt();
		
		System.out.print("Digite a velocidade média (em km/h): ");
		velocidadeMedia = leia.nextInt();
		
		int distancia = tempoGasto*velocidadeMedia;
		float totalConsumoCombustivel = distancia/rendimento;
		
		System.out.printf("%nTotal de combustível gasto: %.2f ", totalConsumoCombustivel);
		
		leia.close();
	}

}
