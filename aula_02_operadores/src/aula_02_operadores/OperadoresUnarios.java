package aula_02_operadores;

public class OperadoresUnarios {
	
	public static void main(String[] args) {
		
		int contador = 1000;
		
		System.out.println("Valor inicial de contador: "+ contador);
		
		System.out.println("Valor Pré-Incrementado: "+ (++ contador));
		//No pré, a soma é feita na execução do comando..
		
		System.out.println("Valor Pós-Incremento: "+ (contador++));
		//Já no pós, o incremento é feito no próximo comando..
		
		System.out.println("Novo valor de contador: " + contador);
	}

}
