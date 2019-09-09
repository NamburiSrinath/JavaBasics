import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

	public static void main(String[] args) {

		Person person1 = new Person(22, "Srinath");
		
		Person[] people = {new Person(21, "Bob"), new Person(20, "Cat")};
		
		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
		File file = new File("test.ser");

		try (ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(file))) {
			
			//Use writeObject to write your own classes in the file
			//Serialising an object
			//oo.writeObject(person1); 
			
			//Can serialise the entire array as long as the 
			//individual elements can be serialisable
			
			//Serialising Array
			oo.writeObject(people);
			
			//Serialising arrayList
			oo.writeObject(peopleList);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
