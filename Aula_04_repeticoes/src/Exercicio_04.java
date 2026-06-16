import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {//Exercicio WHILE 2

		Scanner leia = new Scanner(System.in);

		int idade = 0, genero = 0, desenvolvedor = 0, desBack = 0, somaIdade = 0;
		int mulherFront = 0, homemMobile = 0, fullStack30 = 0, totalPesquisa = 0;
		double mediaIdade = 0.0;
		char continua = 'S';
		
		while(continua == 'S') {
			System.out.print("Digite sua idade: ");
			idade = leia.nextInt();
		
			System.out.println("Escolha sua Identidade de Gênero: ");
			System.out.println("1- Mulher cis");
			System.out.println("2- Homem cis");
			System.out.println("3- Não binário");
			System.out.println("4- Mulher trans");
			System.out.println("5- Homem trans");
			System.out.println("6- Outro");
			genero = leia.nextInt();
		
			System.out.println("Pessoa desenvolvedora de qual área: ");
			System.out.println("1- Backend");
			System.out.println("2- Frontend");
			System.out.println("3- Mobile");
			System.out.println("4- FullStack");
			desenvolvedor = leia.nextInt();
		
		//Total de pessoas desenvolvedoras Backend:
		if (desenvolvedor == 1)
			desBack ++;
		
		//Total de mulheres desenvolvedoras Frontend:
		if (genero == 1 || genero == 4 && desenvolvedor == 2)
			mulherFront ++;
		
		//Total de homens desenvolv. Mobile com mais de 40 anos:
		if (genero == 2 || genero ==5 && desenvolvedor == 3 && idade > 40)
			homemMobile ++;
		
		//Total de não binárias desenvolv. FullStack menores de 30 anos:
		if (genero == 3 && desenvolvedor == 4 && idade < 30)
			fullStack30 ++;
				
		//Total de pessoas que responderam a pesquisa:
			totalPesquisa ++;
		
		//Soma das idades das pessoas que responderam:
			somaIdade += idade;
		
			System.out.println("Deseja continuar? (S/N) ");
			continua = leia.next().toUpperCase().charAt(0);
			
		}
		
		mediaIdade = somaIdade/totalPesquisa;

		
		System.out.printf("\nTotal de pessoas desenvolvedoras Backend: %d", desBack);
		System.out.printf("\nTotal de mulheres desenvolvedoras Frontend: %d", mulherFront);
		System.out.printf("\nTotal de homens desenvolvedores Mobile com mais de 40 anos: %d", homemMobile);
		System.out.printf("\nTotal de não binárias desenvolv. FullStack menores de 30 anos: %d", fullStack30);
		System.out.printf("\nTotal de pessoas que responderam a pesquisa: %d", totalPesquisa);
		System.out.printf("\nMédia de idade das pessoas que responderam a pesquisa: %.2f", mediaIdade);
		
		
		
		leia.close();
	}

}
