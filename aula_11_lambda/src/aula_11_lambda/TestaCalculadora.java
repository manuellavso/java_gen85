package aula_11_lambda;

public class TestaCalculadora {
	
	//MÉTODO					Objeto de OperaçãoMatemática
	public static int calcular(OperacaoMatematica om, int numero1, int numero2) {
		return om.executar(numero1, numero2);
	}
	
	public static void main(String[] args) {

		
		int numero1 = 10;
		int numero2 = 2;
		
		//EXPRESSÃO LAMBDA DEFINE O QUE VAI SER FEITO:
		System.out.println("Soma: " + calcular((a,b) -> a+b, numero1, numero2));
		System.out.println("Subtração: " + calcular((a,b) -> a-b, numero1, numero2));
		System.out.println("Multiplicação: " + calcular((a,b) -> a*b, numero1, numero2));
		System.out.println("Divisão: " + calcular((a,b) -> a/b, numero1, numero2));

		
		
	}

}
