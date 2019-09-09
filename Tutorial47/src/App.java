
public class App {
	public static final int a = 1; // final --> can't change
	// static --> linked with class. can't instantiate with objects

	public static void main(String[] args) {
		//Enum classes can't be instantiated like this
		//Animal animal = new Animal(); ---> Wrong way to instantiate enum class
		
		Animal animal = Animal.CAT;
		
		switch(animal) {
		case CAT:
			System.out.println("This is cat");
			System.out.println(animal.toString());
			break;
		case DOG:
			System.out.println("THis is DOg");
			break;
		case RAT:
			System.out.println("Com'on rat");
		}
		
		System.out.println(Animal.CAT);
		System.out.println(animal);
		System.out.println(Animal.CAT.getClass());
	}

}
