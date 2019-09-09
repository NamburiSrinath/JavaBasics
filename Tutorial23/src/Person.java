
public class Person extends Machine implements Info {// INTERFACES...HAS COMMON METHODS NAME
	private static String name;

	public Person() {
		
		System.out.println("ANother sub constructor");
	}

	public Person(String name) {
		this.name = name;
	}

	public void greet() {
		System.out.println("Hi!!");
	}

	public void start() {
		System.out.println("Person starting");
	}

	public void showInfo() {
		System.out.println("This is " + name);
	}
}
