package aula_05_array;

import java.util.Scanner;

public class Exercicio_03 {//Matrizes

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int matrizInteiros[][]= new int[3][3];
		int somaPrincipal = 0, somaSecundaria = 0, valor1 = 0, valor2 = 0, valor3 = 0;
		
		//Escrever os valores da matriz:
		for(int linha = 0; linha < matrizInteiros.length; linha++) {
			for(int coluna = 0; coluna < matrizInteiros[linha].length; coluna++) {
				System.out.printf("Digite um número para a posição [%d][%d]: ", linha, coluna);
				matrizInteiros[linha][coluna] = leia.nextInt();
			}
		}
		
		//Valores da diagonal principal:
		for(int indice = 0; indice < matrizInteiros.length; indice++) {
			System.out.printf("\nElementos da Diagonal Prncipal [%d][%d}: %d", indice, indice, matrizInteiros[indice][indice]);
			
			//Soma dos elementos da diagonal principal:
			somaPrincipal += matrizInteiros[indice][indice];	
		}	
			
		
		//Valores da diagonal secundária:
		for(int indiceLinha = 0; indiceLinha < matrizInteiros.length; indiceLinha++) {
			for(int indiceColuna = 0; indiceColuna < matrizInteiros.length; indiceColuna++) {
			
				if(indiceLinha == indiceColuna && indiceLinha == 1) {
					System.out.printf("\nElementos da Diagonal Secundária [%d][%d}: %d", indiceLinha, indiceColuna, matrizInteiros[indiceLinha][indiceColuna]);
				
				}else if(indiceLinha == 0 && indiceColuna == 2) {
					System.out.printf("\nElementos da Diagonal Secundária [%d][%d}: %d", indiceLinha, indiceColuna, matrizInteiros[indiceLinha][indiceColuna]);
					
				}else if(indiceLinha == 2 && indiceColuna == 0) {
					System.out.printf("\nElementos da Diagonal Secundária [%d][%d}: %d", indiceLinha, indiceColuna, matrizInteiros[indiceLinha][indiceColuna]);
				}
				
				//Atribuindo valores as váriaveis(valor1,2,3) para somar a diagonal secundária:
				if (indiceLinha == indiceColuna && indiceLinha == 1)
					valor1 = matrizInteiros[indiceLinha][indiceColuna];
				
				if (indiceLinha == 0 && indiceColuna == 2)
					valor2 = matrizInteiros[indiceLinha][indiceColuna];
				
				if (indiceLinha == 2 && indiceColuna == 0)
					valor3 = matrizInteiros[indiceLinha][indiceColuna];
				
				//Soma dos elementos da diagonal secundária:
				somaSecundaria = (valor1+valor2+valor3);
				
			}
		}	
		
		System.out.printf("\nA soma dos elementos da diagonal principal é: %d", somaPrincipal);
		System.out.printf("\nA soma dos elementos da diagonal secundária é: %d", somaSecundaria);
		
		
		leia.close();
	}

}
