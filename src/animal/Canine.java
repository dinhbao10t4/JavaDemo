package animal;

public abstract class Canine extends Animal{
	public abstract void roam();

	@Override
	public void eat() {
		System.out.println("abstract class Canine eat");
	}
}
