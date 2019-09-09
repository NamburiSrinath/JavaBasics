import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person {
	private int a;
	private String name;

	public Person(int a, String name) {
		this.a = a;
		this.name = name;
	}

	public String toString() {
		return a + " " + name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (a != other.a)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

public class App {

	public static void main(String[] args) {

		// LinkedMaps --> Order in which we have inputted
		// HashMaps-->Random order
		// TreeMaps-->Natural order

		Person p1 = new Person(0, "Bob");
		Person p2 = new Person(1, "Kerry");
		Person p3 = new Person(2, "John");
		Person p4 = new Person(1, "Kerry");

		Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();

		// Using when the arguments are string and value
//		map.put("One", 1);
//		map.put("Two", 2);
//		map.put("Three", 3);
//		map.put("Four", 4);
//		// This one overwrites the previous value. Duplicates not allowed in maps
//		map.put("Four", 4);

		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3, 3);
		map.put(p4, 4);
		// This one overwrites the previous value. Duplicates not allowed in maps
		// map.put("Four", 4);

		for (Person key : map.keySet()) {
			// It gets repeated for Kerry as p2 and p4 are not same. Varies with address and
			// all. So, to avoid repetition, use hashcode and equals methods
			
			System.out.println(key + " " + map.get(key));

			// After using hashcode and equals, only the latest kerry will be shown i.e
			// replaced with the old key
		}

		
		//Similar things hold for sets as well
		Set<Person> set = new LinkedHashSet<Person>();

		set.add(p1);
		set.add(p2);
		set.add(p3);

		for (Person key : map.keySet()) {
			// It gets repeated for Kerry as p2 and p4 are not same. Varies with address and
			// all. So, to avoid repetition, use hashcode and equals methods
			
			System.out.println(key + " " + map.get(key));

			// After using hashcode and equals, only the latest kerry will be shown i.e
			// replaced with the old key
		}

	}

}
