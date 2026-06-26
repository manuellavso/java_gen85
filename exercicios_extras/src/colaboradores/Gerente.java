package colaboradores;

public class Gerente extends Funcionarios{

	//ATRIBUTO DA CLASSE
	private double bonus; //PARÂMETRO DE GERENTE
	
	//MÉTODO CONTRUTOR
	public Gerente(String nome, String email, double salario, double bonus) {
		super(nome, email, salario);
		Validacao.validarBonus(bonus);
		this.bonus = bonus; //Adicionar o atributo de gerente
	}

	//MÉTODO GET E SET
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		Validacao.validarBonus(bonus);
		this.bonus = bonus;
	}

	//MÉTODO CALCULAR SALÁRIO
		@Override
		public double calcularSalario() {
			return this.getSalario() + this.getBonus();
		}
	
	//MÉTODO VISUALIZAR
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("\nBônus salarial: R$%.2f", this.bonus);
		System.out.printf("\nO salário do gerente %s é: R$%.2f", this.getNome(), calcularSalario());
	}
	
}
