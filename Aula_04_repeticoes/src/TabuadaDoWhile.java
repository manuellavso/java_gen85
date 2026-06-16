import java.util.Scanner;

public class TabuadaDoWhile {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int numero;
		int contador = 11;
		
		System.out.print("Digite um número inteiro: ");
		numero = leia.nextInt();
		
		do {
			System.out.printf("\n%d x %d = %d", numero, contador, numero*contador);
			contador++;
		} while(contador <= 10);
		
		
		
		leia.close();
	}

}
