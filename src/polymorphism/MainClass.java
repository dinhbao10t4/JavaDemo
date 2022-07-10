package polymorphism;

public class MainClass {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Object object = dog;
		System.out.println(object.toString());
		
		System.out.println("-----DOG EAT----");
		dog.eat();
		
		Wolf wolf = new Wolf();
		System.out.println("-----WOLF EAT----");
		wolf.eat();
	}
}
