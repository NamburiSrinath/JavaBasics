import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return id + " " + name;
	}
}

public class App {

	public static void main(String[] args) {

		/////////////////// Integer orderings////////////
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(2);
		numbers.add(5);
		numbers.add(3);
		numbers.add(7);

		System.out.println(numbers);
		// Normal Order
//		for(Integer x: numbers) {
//			System.out.println(x);
//		}

		// In natural order
		Collections.sort(numbers);
		System.out.println(numbers);

		// Can implement our own comparator and sort in our own wish. Can directly use
		// anonymous class
		Collections.sort(numbers, new Comparator<Integer>() {
			public int compare(Integer num1, Integer num2) {
				// Put - sign to get in reverse order
				return -num1.compareTo(num2);
			}
		});

		System.out.println(numbers);

		//////////////// String orderings////////////
		List<String> names = new ArrayList<String>();
		names.add("Bob");
		names.add("Perry");
		names.add("Ketty");
		names.add("Ant");
		names.add("And");
		names.add("Suse");

		System.out.println("Normal order: " + names);

		Collections.sort(names);
		System.out.println("Natural order: " + names);

		// Sorting in lexicographic order
		Collections.sort(names, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return -s1.compareTo(s2);
			}
		});

		System.out.println("Reverse lexicographic order: " + names);

		// In the order of length of the names
		Collections.sort(names, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if (s1.length() > s2.length()) {
					return 1;
				} else if (s1.length() < s2.length()) {
					return -1;
				}
				return 0;
			}

		});
		System.out.println("In the order of lengths: " + names);

///////////////////// Our own classes order//////////////////

		List<Person> people = new ArrayList<Person>();
		Person p1 = new Person(0, "nam");
		Person p2 = new Person(2, "bamiru");
		Person p3 = new Person(3, "camidaka");
		Person p4 = new Person(1, "damid");

		people.add(p1);
		people.add(p4);
		people.add(p3);
		people.add(p2);
		
		System.out.println(people);
		
		//COmparing and Sorting wit id field
		Collections.sort(people, new Comparator<Person>(){
			public int compare(Person per1, Person per2)
			{
				if(per1.getId() > per2.getId()) {
					return 1;
				}
				else if(per1.getId() < per2.getId()) {
					return -1;
				}
				return 0;
			}
		});
		System.out.println(people);
		
		//Comparing and sorting with name field in lexicographic order
		Collections.sort(people, new Comparator<Person>(){
			public int compare(Person per1, Person per2)
			{
				return per1.getName().compareTo(per2.getName());
			}
		});
		System.out.println(people);

	}

}
