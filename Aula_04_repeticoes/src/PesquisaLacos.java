import java.util.Scanner;

public class PesquisaLacos {//Objetivo: identificar qual esporte a pessoa gosta.

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idade, esporte, totalRespostas = 0, somaIdades = 0, futebol = 0, voleiM18 = 0;
		double mediaIdades = 0.0;
		char continua = 'S';
		
		while(continua == 'S') {
			
			System.out.println("_____________________________________________");
			System.out.println(" 	Pesquisa sobre Esportes Favoritos:");
			System.out.println("_____________________________________________");

			System.out.print("	Digite a sua idade: ");
			idade = leia.nextInt();
			
			do {
				System.out.println("Escolha o seu Esporte Favorito: ");
				System.out.println("1- Futebol");
				System.out.println("2- Voleibol");
				System.out.println("3- Basquetebol");
				System.out.println("4- Outros");
			
			
				esporte = leia.nextInt();
			}while(esporte < 1 || esporte > 4);
			
			/* Estatísticas */
			
			
			//Total de pessoas que responderam a pesquisa:
			totalRespostas ++;
			
			//Soma total das idades de todas as pessoas que responderam a pesquisa:
			somaIdades += idade;
			
			//Total de pessoas que gostam de futebol
			if (esporte == 1)
				futebol ++;
			
			//Total de pessoas que gostam de voleibol com mais de 18 anos
			if (esporte == 2 && idade > 18)
				voleiM18 ++;
			
			
			do {
			System.out.println("Deseja continuar? (S/N) ");
			continua = leia.next().toUpperCase().charAt(0);
			}while(!(continua == 'S') && !(continua == 'N'));
		}
		
		mediaIdades = somaIdades/totalRespostas;
		
		System.out.printf("\nTotal de pessoas que gostam de fut: %d", futebol);
		System.out.printf("\nTotal de pessoas que gostam de volei e tem mais de 18 anos: %d", voleiM18);
		System.out.printf("\nMédia das idades: %.2f", mediaIdades);

		
		leia.close();
	}

}
