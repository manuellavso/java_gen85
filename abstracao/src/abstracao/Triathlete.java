package abstracao;

public class Triathlete extends Person implements Swimmer, Cyclist, Runner{

	public Triathlete(String name) {
		super(name);
	}

	@Override
	public void warmUp() {
		System.out.println("Warming up!");
	}

	@Override
	public void run() {
		System.out.println("Running...!");

	}

	@Override
	public void pedal() {
		System.out.println("I'm doing... I'm pedalling!");
	}

	@Override
	public void swim() {
		System.out.println("Swimming!");
	}

	@Override
	public void tired() {
		System.out.println("The athlete is tired!");
	}

}
