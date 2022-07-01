package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap<String, Integer>();
		scores.put("Kathy", 42);
		scores.put("Bert", 343);
		scores.put("Skyler", 420);
		scores.put("Bert", 235);
		System.out.println(scores);
		System.out.println(scores.get("Bert"));

		/*Properties capitals = new Properties();
		Set states;
		String str;

		capitals.put("Illinois", "Springfield");
		capitals.put("Missouri", "Jefferson City");
		capitals.put("Washington", "Olympia");
		capitals.put("California", "Sacramento");
		capitals.put("Indiana", "Indianapolis");

		// Show all states and capitals in hashtable.
		states = capitals.keySet(); // get set-view of keys
		Iterator itr = states.iterator();
		while (itr.hasNext()) {
			str = (String) itr.next();
			System.out.println("The capital of " + str + " is " + capitals.getProperty(str) + ".");
		}
		System.out.println();

		// look for state not in list -- specify default
		str = capitals.getProperty("Florida", "Not Found");
		System.out.println("The capital of Florida is " + str + ".");
*/
	}
}
