package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {

		List<String> animalTmp = new ArrayList<String>();
		animalTmp.add("Lion");
		animalTmp.add("Lion");
		animalTmp.add("Lion");
		animalTmp.add("Lion");
		animalTmp.add("Lion");
		animalTmp.add("Lion");

		List<String> animal = new ArrayList<String>() {{
			add("Lion");
			add("Tiger");
			add("Hippo");
			add("Wolf");
			add("Dog");
			add("Cat");
		}};

		List<String> list = Arrays.asList("Lion", "Tiger", "Hippo", "Wolf", "Dog", "Cat");

		for(int i = 0; i < animal.size(); i++){
			System.out.println(animal.get(i));
		}

		System.out.println("-------");

		for (String s : animal) {
			System.out.println(s);
		}

		System.out.println("---Java 8 ----");

		for (Iterator<String> i = animal.iterator(); i.hasNext();) {
			String s = (String) i.next();
			System.out.println(s);
		}

		animal.forEach(System.out::println);
	}
}
