package aula_02_operadores;

import java.util.Scanner;

public class DescontoLoja {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		//Variável constante ("final" escrito no início) e tudo deve ser maiúsculo.
		final double VALOR_MINIMO_FRETE_GRATIS = 150.00;
		
		System.out.print("Digite o valor total da compra: R$ ");
		double valorCompra = leia.nextDouble();
		
		System.out.print("O cliente é prime? ");
		boolean isPrime = leia.nextBoolean();
		
		boolean ganhouFrete = valorCompra >= VALOR_MINIMO_FRETE_GRATIS;
		
		
		
		System.out.println("--- Status do pedido ---");
		System.out.printf("\nValor da compra: R$ %.2f", valorCompra);
		System.out.printf("\nClinte Prime? %b", isPrime);
		System.out.printf("\nFrete Grátis? %b", ganhouFrete);
		
		
		leia.close();
	}

}
