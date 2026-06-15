package aula_03_condicional;

public class CondicionalVF {

	public static void main(String[] args) {

		int idade = 15;
		
		if(idade > 18) { //Obs: se for só uma instrução, não precisa colocar o escopo
			System.out.println("O participante é maior de idade");
		}else {
			System.out.println("O participante é menor de idade");
		}
		
	}
	
}
