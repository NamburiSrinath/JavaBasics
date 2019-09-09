import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(1);
		numbers.add(2);

		// Retrieving numbers using get
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		// Retrieving numbers using another way
		for (Integer value : numbers) {
			System.out.println(value);
		}

		System.out.println(numbers);
		// Removing starting elements is slow. Advisable to remove last items
		numbers.remove(0);
		System.out.println(numbers);

		// List is an interface and ArrayList is a class in that interface. So, this
		// declaration is valid
		List<Integer> newnumbers = new ArrayList<Integer>();

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		// In order we have given
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		// In natural order
		TreeMap<Integer, String> treehashmap = new TreeMap<Integer, String>();

		map.put(1, "Bob");
		map.put(2, "Suse");
		map.put(4, "Bank");

		// Iterate through key
		for (Integer i : map.keySet()) {
			System.out.println(i);
			// To get values from key
			// System.out.println(map.get(i));
		}

		// Iterate through values
		for (String s : map.values()) {

			System.out.println(s);
		}

		// Iterate through Map.Entry to access both the values
		for (Map.Entry<Integer, String> dummymap : map.entrySet()) {
			System.out.println(dummymap.getValue() + " " + dummymap.getKey());
		}

		///////////////////////// SETS////////////////

		Set<String> newset = new HashSet<String>();
		Set<String> Lnewset = new LinkedHashSet<String>();
		Set<String> Tnewset = new TreeSet<String>();

		newset.add("John");
		newset.add("Jerry");
		newset.add("Baidu");
		newset.add("Andrew");

		// To know whether an element is there or not
		if (newset.contains("Srinath")) {
			System.out.println("I got u");
		} else {
			System.out.println("Sorry, couldn't catch u");
		}

		if (Lnewset.isEmpty()) {
			System.out.println("I am empty");
		}

		Set<String> newset2 = new HashSet<String>();
		newset2.add("John");
		newset2.add("Jerry");
		newset2.add("Jessy");
		newset2.add("Venky");

		// Copy newset to intersection
		Set<String> intersection = new HashSet<String>(newset);

		// As it is HashSet, no particular order in printing
		System.out.println(intersection);
		////// Intersection
		intersection.retainAll(newset2);

		System.out.println(intersection);

		////// Difference elements ///////

		// Copy newset to difference
		Set<String> difference = new HashSet<String>(newset);
		
		// Remove elements in difference and newset2 and the rest in difference will be
		// printed
		difference.removeAll(newset2);

		System.out.println(difference);

	}

}
