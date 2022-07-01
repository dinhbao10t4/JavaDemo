package study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		List<String> animal = new ArrayList<String>();
		animal.add("Lion");
		animal.add("Tiger");
		animal.add("Hippo");
		animal.add("Wolf");
		animal.add("Dog");
		animal.add("Cat");
		
		for(int i = 0; i < animal.size(); i++){
			System.out.println(animal.get(i));
		}

		System.out.println("-------");

		for (String s : animal) {
			System.out.println(s);
		}

		System.out.println("-------");

		for (Iterator<String> i = animal.iterator(); i.hasNext();) {
			String s = (String) i.next();
			System.out.println(s);
		}
	}
}
