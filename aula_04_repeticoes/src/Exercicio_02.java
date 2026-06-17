import java.util.Scanner;

public class Exercicio_02 {//Exercicio FOR 2

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero, contador = 0;
		int numerosPares = 0, numerosImpares = 0;
	
		
		for(numero = 1;	contador < 10; contador ++) {
				
			System.out.print("Digite um número inteiro: ");
			numero = leia.nextInt();
			
			//Total de números pares
			if (numero % 2 == 0)
				numerosPares ++;
			
			//Total de números impares
			if (numero % 2 != 0)
				numerosImpares ++;
				
				
		}
		
		System.out.printf("\nTotal de números pares: %d", numerosPares);
		System.out.printf("\nTotal de números impares: %d", numerosImpares);

		leia.close();
	}

}
