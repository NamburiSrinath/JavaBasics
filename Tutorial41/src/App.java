import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		// Can't do this because Machine is abstract class
		// Machine mach1 = new Machine();

//		Camera cam1 = new Camera();
//		cam1.start();

		// TUTORIAL 42

		//Reading a file and printing
		File a = new File("test.txt");
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(a);
			br = new BufferedReader(fr);
			String line;

			while ((line = br.readLine()) != null)
			// Till it encounters null, print lines
			{
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("IO Exception");
		}

		try {
			br.close();
		} catch (NullPointerException x) {
			System.out.println("Just to check");
			// No need to write anything because br is never opened
			// if it comes to this loop
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
