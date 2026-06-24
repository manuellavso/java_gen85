package aula_exceptions;

import java.util.Scanner;

public class ChecaIdadeThrow {//Throw

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade;
		
		System.out.print("Digite uma idade: ");
		idade = leia.nextInt();
	
	try {
		validarIdade(idade);
	}catch(DriverException error) {//2 Aqui ela vai ser tratada
		System.err.println("Erro: "+error); //Exibir mensagem de exceção | ex: para mim(desenvolvedor)
		System.err.println("A pessoa não está apta para dirigir");//Exibir uma mensagem personalizada | ex: para o usuário
		}
	}
	
	/*Por DriverException ser uma exceção personalizada, preciso indicar
	no próprio método que, o método validarIdade pode disparar essa exceção (throws) */
	public static void validarIdade(int idade) throws DriverException{
		
		if(idade >= 18)
			System.out.println("A Pessoa pode dirigir!!");
		else //1 Aqui a exceção vai ser lançada
			throw new DriverException("Pessoa menor de 18 anos!");
	}

}
