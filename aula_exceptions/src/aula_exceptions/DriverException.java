package aula_exceptions;

public class DriverException extends Exception{

	/**
	 serialVersionID: vem da interface Serializable 
	 Basicamente: indica que o objeto pode ser serializado
	 Ele converte o objeto em uma sequência de bytes que podem ser salvo no disco ou ir para a rede
	 Depois esse número vai ser usado para deserializar o objeto
	 */
	private static final long serialVersionUID = 1L; //Tipo padrão

	//Criou um método construtor (vazio, para não mandar mensagem nenhuma)
	public DriverException() {}

	
	//Método de sobrecarga - outro construtor (com mensagem)
	public DriverException(String mensagem) {
		super(mensagem);
	}
	
}
