package colaboradores;

//ABSTRATO PORQUE É GENÉRICO, NÃO TEM OBJETOS DE FUNCIONÁRIOS
public abstract class Funcionarios {
	
	//ATRIBUTOS DA CLASSE
	private String nome;
	private String email;
	private double salario;
	
	//MÉTODO CONSTRUTOR
	public Funcionarios(String nome, String email, double salario) {
		Validacao.validarNome(nome); //Precisa validar antes de pedir
		Validacao.validarEmail(email);
		Validacao.validarSalario(salario);
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}
	
	
	//MÉTODOS GET E SET 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		Validacao.validarNome(nome);
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		Validacao.validarEmail(email);
		this.email = email;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		Validacao.validarSalario(salario);
		this.salario = salario;
	}
	
	//MÉTODO VISUALIZAR
	public void visualizar() {
		System.out.printf("\nNome: %s ", this.nome);
		System.out.printf("\nE-mail: %s ", this.email);
		System.out.printf("\nSalário: R$%.2f ", this.salario);
	}
	
	//MÉTODO ABSTRATO (Obrigatório ser usado na subclasse)
	public abstract double calcularSalario();
	
}
