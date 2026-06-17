import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {//Exercicio DO... WHILE 1

		Scanner leia = new Scanner(System.in);

		int numero = 1, somaPositivos = 0;
		
			do {
				System.out.print("Digite um número: ");
				numero = leia.nextInt();
				
			if(numero >=0)
				somaPositivos = (somaPositivos+numero);
	
				
			}while(numero ++ != 0);
		
		
		System.out.printf("\nA soma dos números positivos é: %d", somaPositivos);
		
		leia.close();
	}

}
