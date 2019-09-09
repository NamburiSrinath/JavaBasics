import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {
		Person person1 = new Person(5,"anil");
		Person person2 = new Person(6,"Jadav");
		
		//We initialised person2 but didn't write it to file. 
		//Therefore it goes to exception in ReadObjects.java(line 19,21)
		
		System.out.println(person1);
		
		try(FileOutputStream fs = new FileOutputStream("people.bin"))
		{
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(person1);
			
			os.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
