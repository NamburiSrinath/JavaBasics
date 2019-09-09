import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String fileName = "C:/Users/ngnvvsatyasaisri/Desktop/example.txt";
		// CREATING A FILE OBJECT TO ACCESS FILES
		
		File textFile = new File(fileName);
		Scanner in = new Scanner(System.in); 
		//Will take input only if catch statement comes
		try {
			in = new Scanner(textFile);
		} 
		
		//CHILDREN CLASSES TO BE ON TOP OF PARENT CLASSES
		//i.e IOE(parent) can handle error if it comes 
		//though the error is specific to filenotfound(Polymorphism)
		
		catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println("Reached catch block");
			//e1.printStackTrace();
		}
		
		catch (IOException e)
		{
			System.out.println("In IOException block");
		}
		
		//Integer inn  =in.nextInt();
		
		String k = in.nextLine(); //nextInt only reads integer. Skips new line character
		//nextLine reads the complete line including newline character.
		in.nextLine();
		System.out.println(k);

		while (in.hasNextLine()) {
			String a = in.nextLine();
			System.out.println(a);
		}

		// System.out.println(in);

		in.close();

	}

}
