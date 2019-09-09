
public class App {

	public static void main(String[] args) {
		App app = new App();
		int value = 5;

		System.out.println("1. Value " + value);
		app.show(value);
		System.out.println("4. Value " + value);
		System.out.println();

		String name = "Hello";
		System.out.println("1. Name " + name);
		app.show(name);
		System.out.println("4. Name " + name);
		System.out.println();

		Person person = new Person("Bob");
		System.out.println("1. Name " + person);
		app.show(person);
		System.out.println("4. Name " + person);

	}

	public void show(int value) {
		System.out.println("2. Value " + value);
		value--;
		System.out.println("3. Value " + value);
	}

	public void show(String name) {
		System.out.println("2. Name " + name);
		name = "Shyam";

		System.out.println("3. Name " + name);

	}

	// When passing non primitive type, the address is what gets passed to the
	// method
	public void show(Person person) {
		// Here actually person address comes from outside and gets assigned to this new
		// local variable
		System.out.println("2. Name " + person);

		// Changes in the original person(outside the show) as it is accessing the
		// address
		person.setName("Sue");

		// creates a new local object with Katy(different from Bob one). Different
		// address, a new address in this person now
		person = new Person("Katy");

		// This one changes the new person created one. i.e Katy ---> Sue
		person.setName("Sue");

		System.out.println("3. Name " + person);
	}

}
