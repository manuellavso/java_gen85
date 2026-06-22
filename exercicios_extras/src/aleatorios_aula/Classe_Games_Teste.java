package aleatorios_aula;

public class Classe_Games_Teste {
	
	public static void main(String[] args) {

		Classe_LojaGames game1 = new Classe_LojaGames("Fifa", 320.0f, 1, 3, 18, 2);
		game1.visualizar();
			
		Classe_LojaGames game2 = new Classe_LojaGames("Valorant", 150.0f, 2, 1, 18, 2);
		game2.visualizar();
		
		Classe_LojaGames game3 = new Classe_LojaGames("Mortal Kombat", 90.0f, 3, 3, 18, 2);
		game3.visualizar();
		
		
	}
}