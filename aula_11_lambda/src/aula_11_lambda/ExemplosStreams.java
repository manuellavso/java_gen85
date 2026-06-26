package aula_11_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ExemplosStreams {

	public static void main(String[] args) {

		//Collections
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> numerosDesordenados = Arrays.asList(6,7,8,1,4,5,9,10,2,3);
		 
		List<String> estados = Arrays.asList("São Paulo", "Santa Catarina", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 
		"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro", "Rio Grande do Sul");
		
		
		//USAR OS NUMEROS
		List<Integer> numerosPares = numeros.stream() //CRIA UMA LIST COM OS VALORES DE NUMERO
				.filter(numero -> numero % 2 == 0) //FILTRA OS DADOS DA COLEÇÃO
				.collect(Collectors.toList()); //PEGA O RESULTADO, TRANSFORMA OS DADOS EM UMA COLEÇÃO(nesse caso, List) E GUARDA EM 'numerosPares'
		
		//Lista filtrada:
		numerosPares.forEach(numero -> System.out.println(numero));
		
		
		//USAR OS ESTADOS
		estados.stream()
			.filter(estado -> estado.toUpperCase().startsWith("R")) //FILTRAGEM, PEGA OS QUE COMEÇAM COM 'R'
			.distinct() //NÃO REPETE DADOS
			.forEach(System.out::println); //ABREVIAÇÃO PRINTLN, ESCREVE POR REFERÊNCIA
		
		
		//ELEVAR OS NÚMEROSAO CUBO
		List<Integer> numerosAoCubo = numeros.stream()
				.map(numero -> (int) Math.pow(numero, 3)) //MAP PERMITE MODIFICAR OS NÚMEROS ORIGINAIS, MAS MODIFICA NA NOVA COLEÇÃO (cópia)
				.collect(Collectors.toList());
		
		System.out.println("Números ao cubo: " + numerosAoCubo);
				
		
		//ORDENAR OS NÚMEROS DESORDENADOS
		numerosDesordenados.stream()
			.sorted() //ORDENA A COLEÇÃO
			.forEach(System.out::println);
		
		
		//CONTAGEM
		long estadosIniciandoEmS = estados.stream()
				.filter(estado -> estado.toUpperCase().startsWith("S"))
				.distinct()
				.count();
				
			System.out.println("Total de estados iniciando com a letra S: " +estadosIniciandoEmS);
				
	}

}
