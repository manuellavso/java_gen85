package lista_01;

import java.util.Scanner;

public class exercicio7 {//Laços condicionais

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int ddd;
		
		System.out.print("Digite um DDD: ");
		ddd = leia.nextInt();
		
		if(ddd==11) {
			System.out.print("O DDD 11 pertence à cidade São Paulo.");
		}else if(ddd==21) {
			System.out.print("O DDD 21 pertence à cidade Rio de Janeiro.");
		}else if(ddd==27) {
			System.out.print("O DDD 27 pertence à cidade Vitória.");
		}else if(ddd==31) {
			System.out.print("O DDD 31 pertence à cidade Belo Horizonte.");
		}else {
			System.out.print("DDD não encontrado!");
		}
		
		
		leia.close();
	}

}
