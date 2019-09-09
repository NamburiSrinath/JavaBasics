import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//Implements comparable statement to be there for TreeSet to add, access 
//and manipulate our own objects BECAUSE treeset doesn't have a natural order. 
class Person implements Comparable<Person> {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	// This is the function which is responsible for showElements to work
	public int compareTo(Person person) {

		// Printing based on lengths of strings. For treeset, if 2 strings has same
		// length, it causes issue. So, overcomed in last else loop
		if (name.length() > person.name.length()) {
			return 1;
		} else if (name.length() < person.name.length()) {
			return -1;
		} else {
			return name.compareTo(person.getName());
		}
		// return 0; If we just write this, then if 2 strings have same length, due to
		// treeset properties, it will ignore one
	}

}

public class App {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<Person>();
		Set<Person> treelist = new TreeSet<Person>();

		addElements(list);
		addElements(treelist);

		showElements(list);
		System.out.println();
		showElements(treelist);

	}

	public static void addElements(Collection<Person> dummy) {
		dummy.add(new Person("Ramu"));
		dummy.add(new Person("Bhanu"));
		dummy.add(new Person("Ikin"));
		dummy.add(new Person("andrew"));
	}

	public static void showElements(Collection<Person> dummy) {

		for (Person dummy1 : dummy) {
			System.out.println(dummy1);
		}

	}
	
	//person.compareTo() 	

}
