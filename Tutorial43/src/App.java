import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Temp {
	private Integer a;
	private String b;

	public Temp(Integer a, String b) {
		this.a = a; // this.a ===> variable in line 10(private one)
		this.b = b; // a,b means local variables
	}

	@Override
	public String toString() {
		return "Temp [a=" + a + ", b=" + b + "]";
	}

	// This hashCode and equals methods are inbuilt in Java already
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
			//System.out.println(a);
			//System.out.println(obj.getClass()); ---> Of Class Temp
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Temp other = (Temp) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		return true;
	}

}

public class App {

	public static void main(String[] args) {

//		File file = new File("test.txt");
//
//		// Put the declaration in try. 
//		//It is AutoClosable i.e no need to do br.close() try block and all(like Tut41)
//		
//		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//			String line;
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
//
//		} catch (FileNotFoundException e) {
//			System.out.println("File not found " + file.toString());
//		} catch (IOException e) {
//			System.out.println("IO Exception " + file.toString());
//		}
//		
//		//Writing files. Use bufferedWriter and FileWriter
//		File file1 = new File("test1.txt");
//		try (BufferedWriter br = new BufferedWriter(new FileWriter(file1)))
//		{
//			br.write("Hello buddy");
//			br.newLine();
//			br.write("Cdef hello");
//		}
//		//There won't be filenotfoundexception because it creates file if it doesn't exist
//		catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// .EQUALS()

		String s1 = "Hello";
		String s2 = "Hello buddy".substring(0, 5);
		System.out.println(s1 == s2);

		System.out.println(s1.equals(s2));

		Temp temp1 = new Temp(5, "Cat");
		Temp temp2 = new Temp(5, "Cat");
		System.out.println(temp1 == temp2);
		//.equals() method inbuild in Java
		System.out.println(temp1.equals(temp2));
	}

}
