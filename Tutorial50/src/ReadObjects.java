import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {

	public static void main(String[] args) {

		File file = new File("test.ser");
		try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream(file))) {

			// Downcasting of the array
			Person[] people = (Person[]) oi.readObject();

			//Downcasting of ArrayList
			ArrayList<Person> peopleList = (ArrayList<Person>) oi.readObject();

			// It prints hashcode and the type of class of that array
			System.out.println(people);

			// Print all the elements in people array
			for (Person person : people) {
				System.out.println(person);
			}
			
			//Printing by using ArrayList
			for (Person person : peopleList) {
				System.out.println(person);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
