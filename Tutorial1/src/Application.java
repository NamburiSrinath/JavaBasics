import java.util.Scanner;


// * EXAMPLE CLASS
class cat{
	private int age;
	private String name;
	public static String say;
	public static int count;
	public int id;
	
	public cat() {
//		this("Bunty"); //Calling constructors from another constructor
//		System.out.println("1");
//		System.out.println(say);
		id = count;
		count++;
		}
	
	
//	public cat(String name) { EXAMPLE OF ANOTHER CONSTRUCTOR
//		//this();
//		System.out.println(name + " 2");
//		this.name = name;
//	}
	
	
	public static void example()
	{
		//System.out.println(age); // Cannot do because age is instance variable
		//System.out.println(say);
		System.out.println(count);
	}
	
	
	void speak()
	{
		System.out.println("Hello " + name + " Your age is " + age);
	}
}


public class Application {

	/*
	 * 
	 * TO TAKE INPUTS AND PRINT IN VARIOUS FORMATS
	private static Scanner third;
	private static Scanner second;
	private static Scanner first;

	public static void main(String[] args) {
		first = new Scanner(System.in);
		second = new Scanner(System.in);
		third = new Scanner(System.in);

		// Waiting to click enter button and UNBOXING
		int firstt = first.nextInt();
		String secondd = second.nextLine();
		double thirdd = third.nextDouble();

		System.out.println(firstt);
		System.out.println(secondd);
		System.out.println(thirdd);
		*/

	public static void main(String[] args) {

		/*
		 * DO WHILE
		Scanner value = new Scanner(System.in);
		int a = 0;

		do {
			System.out.println("enter");
			a = value.nextInt();

		} while (a != 9);
		System.out.println("Done");
	*/
		
		
		/*
		 * SWITCH CASE
		Scanner value = new Scanner(System.in);
		String text = value.nextLine();

		switch (text) {
		case "hello":
			System.out.println("Hi!!");
			break;

		case "bye":
			System.out.println("Bye!!");
			break;

		default:
			System.out.println("Out of conversation");

		}
		*/
		
		
		/*WORKING WITH ARRAYS
		 * 
		int[] values; // ARRAY DECLARATION
		int size;
		Scanner input = new Scanner(System.in);
		size = input.nextInt();
		values = new int[size]; //ARRAY SIZE

		for (int i = 0; i < values.length; i++) {
			Scanner variable = new Scanner(System.in);
			values[i] = variable.nextInt();
			System.out.println(values[i]);
		}
		*/
		
		/*ITERATING IN AN ARRAY. DIFFERENT METHOD
		String[] fruits = { "Apple", "Mango" };

		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		*/
		
		/*
		 * MULTIDIMENSIONAL ARRAYS
		String[][] alphabets = new String[3][2];
		for(int row = 0; row<alphabets.length; row++) {
			for(int col = 0; col<alphabets[row].length; col++) {
				Scanner variable = new Scanner(System.in);
				alphabets[row][col] = variable.nextLine();
			}
		}
		
		for(int row = 0; row<alphabets.length; row++) {
			for(int col = 0; col<alphabets[row].length; col++) {
				System.out.print(alphabets[row][col] + " ");
			}
			System.out.println();
		}
		*/
		
		
		
		
		//ACCESSING FROM DIFFERENT CLASSES
		cat.say = "Hello buddy";//INITIALISING STATIC VARIABLE
		cat.example();//CALLING STATIC CLASS
		cat eg1 = new cat();
		cat eg2 = new cat();
		//eg1.name = "Tony";
		//eg1.age = 12;
		//eg1.speak();
		//Frog frog1 = new Frog();
		
		
		
	}
	

		
	
	

}



