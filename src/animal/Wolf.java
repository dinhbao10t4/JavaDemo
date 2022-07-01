package animal;

public class Wolf extends Canine {
	public void makeNoise() {

	}

	public void roam() {
	}

	public void eat() {
		super.eat();
		System.out.println("Wolf eat");
	}
}
