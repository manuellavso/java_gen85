package aleatorios_aula;

public class Classe_LojaGames {
	//Atributos da Classe
	private String nomeJogo;
	private float preco; //
	private int categoria; //Tipos de jogo, terror, esporte, tiro...
	private int plataforma; //1 Pc, 2 celular ou 3 videogame
	private int faixaEtaria;
	private int recurso; 
	
	//Método construtor:
	public Classe_LojaGames(String nomeJogo, float preco, int categoria, int plataforma, int faixaEtaria,
			int recurso) {
		this.nomeJogo = nomeJogo;
		this.preco = preco;
		this.categoria = categoria;
		this.plataforma = plataforma;
		this.faixaEtaria = faixaEtaria;
		this.recurso = recurso;
	}

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(int plataforma) {
		this.plataforma = plataforma;
	}

	public int getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public int isRecurso() {
		return recurso;
	}

	public void setRecurso(int recurso) {
		this.recurso = recurso;
	}
	
	public void visualizar() {
		String tipo = "";
		switch(this.plataforma) {
		case 1:
			tipo = "Computador";
		break;
		case 2:
			tipo = "Celular";
		break;
		case 3:
			tipo = "Videogame";
		break;
		}
		
		String tipo2 = "";
		switch(this.categoria) {
		case 1:
			tipo2 = "Futebol";
		break;
		case 2:
			tipo2 = "Tiro";
		break;
		case 3:
			tipo2 = "Luta";
		break;
		}
		
		String tipo3 = "";
		switch(this.recurso) {
		case 1:
			tipo3 = "Solo";
		break;
		case 2:
			tipo3 = "Multijogador";
		break;
		}
		
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("│ ➤ D A D O S   D A   C O N T A	     ");
		System.out.println("┖━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");		
		System.out.printf("Nome do jogo: %s", this.nomeJogo);
		System.out.printf("%nPreço do jogo: R$%.2f", this.preco);
		System.out.printf("%nCategoria do jogo: %s", tipo2);
		System.out.printf("%nPlataforma que vai jogar: %s", tipo);
		System.out.printf("%nFaixa etária: %d", this.faixaEtaria);
		System.out.printf("%nRecurso (se é multiplayer ou não): %s", tipo3);
		System.out.println();
	}
}
