
public class App {
	//Can access it by App.ID [Classname.variablename] ---> 
	//because of static it is class dependent
	public static final int ID = 7;

	public static void main(String[] args) {
		Machine mach1 = new Machine(5);
		Person pers1 = new Person("Bob");
		//If I am calling a default class, then first 
		//it will call the DEFAULT Super constructor and then 
		//the DEFAULT sub constructor
		
		
		//UPCASTING--->POLYMORPHISM
		Person pers3 = new Person(); //{ //CALLING A METHOD BY ANONYMOUS CLASS 
		//--> WILL OVERRIDE GREET METHOD ONLY FOR PERS3
//			public void greet()
//			{
//				System.out.println("Calling from anonymous class");
//			}
//		};
		pers3.greet();
		Machine mach4 = pers3; 	
		
		//DOWNCASTING. NEED TO GIVE CONFIRMATION
		Machine mach5 = new Person(); 
		mach5.greet();
		//VERY VERY IMPORTANT. TO DOWNCAST, 
		//IT SHOULD REFER TO THE CHILD THOUGH VARIABLE TYPE IS PARENT ONE
		Person pers4 = (Person)mach5;
		
		pers4.greet();
		mach1.start();
		pers1.greet();
		
		//System.out.println(App.ID);

		// INTERFACES ==> Implements only those listed methods present in "Info"
		Info mach2 = new Machine(6);
		Info pers2 = pers1;
		// mach2, pers2 can't implement start(), greet() because these are Info objects
		mach2.showInfo();
		pers2.showInfo();
		//output(mach2);
		
		//Public ---> Access anywhere
		//Private ---> Within the same class
		//Protected ---> Different subclasses in same package(Children in same package)
		//No access modifier ---> Same package
		//ACCESS MODIFIERS ONLY FOR INSTANCE VARIABLES. NOT FOR CLASSES
		
		mach1.number = 8;
		System.out.println(mach1.number);

	}

	//PASSING INTERFACE VARIABLE 
//	private static void output(Info info) {
//		info.showInfo();
//	}

}
