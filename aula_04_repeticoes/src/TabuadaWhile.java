import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);
		
		int numero;
		int contador = 1;
		
		System.out.print("Digite um número inteiro: ");
		numero = leia.nextInt();
		
		while(contador <= 10) {
			System.out.printf("\n%d x %d = %d", numero, contador, numero*contador);
			contador++;
		}
		
		
		leia.close();
	}

}
