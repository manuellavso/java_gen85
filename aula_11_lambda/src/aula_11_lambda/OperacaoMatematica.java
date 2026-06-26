package aula_11_lambda;

//INTERFACE QUE DEFINE UM MÉTODO ABSTRATO
@FunctionalInterface
public interface OperacaoMatematica {

	//MÉTODO ABSTRATO QUE SABE QUE PRECISA EXECUTAR ALGUMA COISA COM A E COM B
	public int executar(int a, int b);
	
}
