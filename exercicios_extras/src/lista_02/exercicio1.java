package lista_02;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio1 {//ArrayList

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<String>();
		int opcao;
		char continua = 'S';
		
		while(continua == 'S') {
		System.out.println();
		System.out.println("			M E N U:	");  
		System.out.println("________________________________");  
		System.out.println("1 - Adicionar produtos;");  
		System.out.println("2 - Remover produtos; ");  
		System.out.println("3 - Listar todos os produtos;");  
		System.out.println("4 - Verificar se há produto;");  
		System.out.println("0 - Sair");  
		System.out.println();  
		System.out.print("Digite a opção desejada: ");  
		opcao = leia.nextInt();		
		
		switch(opcao) {
		case 1:
			System.out.print("Digite o nome do produto: ");
			lista.add(leia.next());
			
			System.out.println("Produto adicionado!");
		break;
		case 2:
			System.out.println("Digite qual produto deseja excluir?");
			String buscarProduto = leia.next();
			boolean encontrado = false;
			
				for (int i = 0; i < lista.size(); i++) {
					if(lista.get(i).equalsIgnoreCase(buscarProduto)) {
						lista.remove(i);
						System.out.println("Produto removido!");
						encontrado = true;
						break;
					}
				}
				if(!encontrado) {
					System.out.println("Produto não encontrado!");
		}
		break;
		case 3:
			if(lista.isEmpty()) {
				System.out.println("Não há produtos na lista");
			}else if (!lista.isEmpty()) {
				System.out.println("Os produtos são: ");
				for(var listaProdutos : lista) {
					System.out.println(listaProdutos);
				}
			}
		break;
		case 4:
			System.out.println("Digite o produto que está procurando?");
			String buscarProduto2 = leia.next();
			
					if(lista.contains(buscarProduto2)) {
						System.out.println("Produto existe na lista!");
			}else {
				System.out.println("Produto não encontrado!");
			}
		break;
		case 0:
			encerrar();
			
		break;
		default:
			System.out.println("Erro.");
		}
		do {
			System.out.println("➤ Deseja continuar? (S/0) ");
			continua = leia.next().toUpperCase().charAt(0);
			}while(!(continua == 'S') && !(continua == '0'));
			if ((continua == '0')) {
				encerrar();
			}
		} 
		leia.close();
	}

	public static void encerrar() {
		System.out.println("Programa finalizado!");
		System.exit(0);
	}
	
	
}
