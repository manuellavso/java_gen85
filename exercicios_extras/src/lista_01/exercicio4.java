package lista_01;

import java.util.Scanner;

public class exercicio4 {//Variáveis e operadores

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int valor;
		

		System.out.print("Digite um valor em reais sem os centavos: R$");
		valor = leia.nextInt();
		
		int valorRestante = valor;
		int numNotas200 = Math.floorDiv(valorRestante, 200);
		valorRestante %= 200;
		
		int numNotas100 = Math.floorDiv(valorRestante, 100);
		valorRestante %= 100;
		
		int numNotas50 = Math.floorDiv(valorRestante, 50);
		valorRestante %= 50;
		
		int numNotas20 = Math.floorDiv(valorRestante, 20);
		valorRestante %= 20;
		
		int numNotas10 = Math.floorDiv(valorRestante, 10);
		valorRestante %= 10;
		
		int numNotas5 = Math.floorDiv(valorRestante, 5);
		valorRestante %= 5;
		
		int numNotas2 = Math.floorDiv(valorRestante, 2);
		valorRestante %= 2;
		
		int numNotas1 = Math.floorDiv(valorRestante, 1);
		valorRestante %= 1;
		
		System.out.println();
		System.out.println("Para a decomposição do valor R$" +valor+ " utilizaremos");
		System.out.println(+numNotas200+ "nota(s) de R$200,00;");
		System.out.println(+numNotas100+ "nota(s) de R$100,00;");
		System.out.println(+numNotas50+ "nota(s) de R$50,00;");
		System.out.println(+numNotas20+ "nota(s) de R$20,00;");
		System.out.println(+numNotas10+ "nota(s) de R$10,00;");
		System.out.println(+numNotas5+ "nota(s) de R$5,00;");
		System.out.println(+numNotas2+ "nota(s) de R$2,00;");
		System.out.println(+numNotas1+ "nota(s) de R$1,00.");

		
		leia.close();
	}

}
