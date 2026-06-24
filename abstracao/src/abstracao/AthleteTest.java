package abstracao;

public class AthleteTest {//You will decide what you will implemente (depends of the necessity)

	public static void main(String[] args) {
		
		Triathlete a1 = new Triathlete("Manuella");
		a1.warmUp();
		a1.run();
		a1.swim();
		a1.pedal();
		a1.tired();
		
	}

}
