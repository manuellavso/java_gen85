package abstracao;

public abstract class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String name) {
		this.name = name;
	}
	
	public abstract void tired();
	
	
}
