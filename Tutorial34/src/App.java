import java.util.ArrayList;

class cat {
	private String name;

//	public cat(String name) {
//		this.name = name;
//	}

	public String shout() {
		// System.out.println("Shouting");
		return "Shouting";
	}

	public String toString() {
		return "Welcome";
	}

}

public class App {

	public static void main(String[] args) {

		// OLD STYLE
		ArrayList list = new ArrayList();
		list.add("Hello");
		list.add("Namma");
		String fruit = (String) list.get(1); // Converting object to string(DOWNCASTING)
		// System.out.println(fruit);

		// GENERICS FOR KNOWING THE DATATYPE INITIALLY. <DATA-TYPE>
		ArrayList<String> newlist = new ArrayList<>();
		// System.out.println(newlist);
		newlist.add("Bangalore");
		String output = newlist.get(0);
		System.out.println(output);

		// How to use generics in this case? WILDCARDS AND TUTORIAL34
		ArrayList<cat> classlist = new ArrayList<>();
		classlist.add(new cat());
		classlist.add(new cat());

		showList(classlist);

	}
//<? extends cat> ===> we know that the object can be of type cat
//cat value: list ===> we can use the methods present in cat class

//<?> and Object value: list means we don't know anything about list
	public static void showList(ArrayList<? extends cat> list) {
		for (cat value : list) { 
			//Iterate through list. each variable value is of type cat
			System.out.println(value.shout());
		}
	}

}
