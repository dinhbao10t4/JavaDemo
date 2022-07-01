package generics;

import java.util.ArrayList;
interface Pet{
	void play();
}
abstract class Animal {
	void eat() {
		System.out.println("Animal eat");
	}
}

class Dog extends Animal implements Pet{
	void bark() {

	}
	
	void eat() {
		System.out.println("Dog eat");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
}

class Cat extends Animal implements Pet {
	void meow() {

	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
}

public class GenericsDemo {
	public static void takeAnimals(ArrayList<? extends Animal> animals) {
		for (Animal a : animals) {
			a.eat();
		}
	}

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Dog());
		takeAnimals(animals);
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		dogs.add(new Dog());
		dogs.add(new Dog());
		takeAnimals(dogs);
	}

}
