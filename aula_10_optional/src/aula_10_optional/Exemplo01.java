package aula_10_optional;

import java.util.Optional;

public class Exemplo01 {

	public static void main(String[] args) {

		String palavras[] = new String[10];
		
		for(var palavra : palavras) {
			System.out.println(palavra);
		}
		//Optional que pode ser vazio ou não
		//Encapsula dentro de checaNulo a posição 5 do vetor palavras
		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);
		
		//Com o isPresent ele checa se é nulo, se for, aparece o sysout
		if(checaNulo.isPresent()) {
		String palavra = palavras[5].toLowerCase();
		System.out.println(palavra);
		}else {
			System.out.println("A palavra é nula.");
		}
		
		
	}

}
