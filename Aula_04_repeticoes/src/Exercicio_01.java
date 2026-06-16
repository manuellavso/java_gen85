import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {//Exercício FOR 1

		Scanner leia = new Scanner(System.in);

		int numero1, numero2;
		
		System.out.print("Digite o primeiro número inteiro: ");
		numero1 = leia.nextInt();
		
		System.out.print("Digite o segundo número inteiro: ");
		numero2 = leia.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("Intervalo inválido.");
			
			 System.out.println("Fim do programa.");
		}else {
			
			System.out.printf("\n No intervalo entre %d e %d. Os números múltiplos de 3 e 5 são:  ", numero1, numero2);

			for(int contador = numero1; contador <= numero2 ; contador ++) {
				if(contador % 3 == 0 && contador % 5 == 0) {
					System.out.printf("\n %d", contador);
				}			
			}
		}
		
		leia.close();
	}

}
