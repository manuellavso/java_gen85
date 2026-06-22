package lista_01;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {//Laços condicionais
		Scanner leia = new Scanner(System.in);

		int tempoRestante, tempop1, tempop2;
				
		System.out.print("Digite o tempo restante(min): ");
		tempoRestante = leia.nextInt();
		
		System.out.print("Digite o tempo de fabricação do presente 01 (min): ");
		tempop1 = leia.nextInt();
		
		System.out.print("Digite o tempo de fabricação do presente 02 (min): ");
		tempop2 = leia.nextInt();
		
		if((tempoRestante <0 || tempoRestante > 100) || (tempop1 <0 || tempop1 > 100) || (tempop2 <0 || tempop2 > 100)) {
			System.out.print("Tempo inválido!");
		}else if((tempop1+tempop2) <= tempoRestante) {
			System.out.print("Farei hoje!");
		}else
			System.out.print("Deixa para amanhâ");
		
		
		
		leia.close();
	}

}
