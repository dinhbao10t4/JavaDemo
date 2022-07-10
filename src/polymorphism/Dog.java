package polymorphism;

public class Dog extends Canine{
	public void makeNoise() {

	}
	
	public void roam(){
		
	}

	public void eat() {
		super.eat();
		System.out.println("Dog eat");
	}

	@Override
	public String toString() {
		return "Dog toString()";
	}
}
