
public class App {

	public static void main(String[] args) {

		Robot robot = new Robot();
		robot.start();
		
		//Rarely used method to call like this. here brain is public
		//Robot.Brain brain = robot.new Brain();
		//brain.braintalk();
		
		
		
		//Frequently used. If want to have a class inside a class, 
		//make it static unless we need to access instance variables 
		//of the higher class(i.e robot in this eg)
		//here brain is static
		Robot.Brain brain = new Robot.Brain();
		brain.braintalk();
		
		
		
		//Can't access an inner class which is inside a method.
		//sayData ex = new sayData();
		//ex.speakID();
		
		
		

	}

}
