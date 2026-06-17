import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {//Exercicio WHILE 1
		
		Scanner leia = new Scanner(System.in);

		int idade = 0, menor21 = 0, maior50 = 0;
		
		while(idade>=0) {
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		 if (idade<0)
			System.out.println("Leitura de dados finalizada.");
		
		
		//Total de pessoas com menos de 21 anos:
		if (idade < 21 && idade >= 0)
			menor21 ++;
		
		//Total de pessoas com mais de 50 anos:
		if (idade > 50)
			maior50 ++;
		}
		
		System.out.printf("\nTotal de pessoas com menos de 21 anos: %d", menor21);
		System.out.printf("\nTotal de pessoas com mais de 50 anos: %d", maior50);
		
		
		leia.close();
	}

}
