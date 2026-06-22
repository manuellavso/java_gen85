package lista_01;

import java.util.Scanner;

public class exercicio8 {//Laços condicionais

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float salario, reajuste, novoSalario;
				
		System.out.print("Digite o valor do salário: ");
		salario = leia.nextFloat();
		
		if(salario <= 1412.00) {
			reajuste=(salario*15)/100;
			novoSalario= salario+reajuste;
			System.out.println("Novo salário: "+novoSalario+ " || Valor do reajuste: "+reajuste+" || Percentual de aumento: 15%");
		}else if(salario > 1412.00 && salario <2824.00) {
			reajuste=(salario*12)/100;
			novoSalario= salario+reajuste;
			System.out.println("Novo salário: "+novoSalario+ " || Valor do reajuste: "+reajuste+" || Percentual de aumento: 12%");
		}else if(salario >=2824.00 && salario < 4236.00) {
			reajuste=(salario*10)/100;
			novoSalario= salario+reajuste;
			System.out.println("Novo salário: "+novoSalario+ " || Valor do reajuste: "+reajuste+" || Percentual de aumento: 10%");
		}else if(salario >= 4236.00 && salario <= 5648.00) {
			reajuste=(salario*7)/100;
			novoSalario= salario+reajuste;
			System.out.println("Novo salário: "+novoSalario+ " || Valor do reajuste: "+reajuste+" || Percentual de aumento: 7%");
		}else if(salario > 5648.00) {
			reajuste=(salario*5)/100;
			novoSalario= salario+reajuste;
			System.out.println("Novo salário: "+novoSalario+ " || Valor do reajuste: "+reajuste+" || Percentual de aumento: 5%");
		}
		
		
		leia.close();
	}

}
