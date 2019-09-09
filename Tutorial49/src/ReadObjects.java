import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("Reading objects...");

		// Try with resources used to avoid closing fi error

		try (FileInputStream fi = new FileInputStream("people.bin")) {
			ObjectInputStream oi = new ObjectInputStream(fi);

			//DOWNCASTING ---> Uses ClassNotFoundException
			Person person1 = (Person) oi.readObject();
			Person person2 = (Person) oi.readObject();
			System.out.println(person1);
			System.out.println(person2);

			oi.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("Doesn't exist");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
