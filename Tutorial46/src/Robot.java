//Though robot.start() is there in App.java, 
//we need to create an instance of sayData(as in line 12,13)
//to execute the codes present in that inner class

public class Robot {
	private int a = 7;

	public void start() {

		System.out.println("Starting ...");
		class sayData {
			String b = "Hello";

			public void speakID() {
				System.out.println("Can access private instance " + a);
				// It Can't access actually. But don't know how 
				//it can access without that final
				// keyword
				
//				StringBuilder c = new StringBuilder();
//				c.append("Hello buddy. ").append("This is Srinath");
//				System.out.println(c);
				
				System.out.println("Can't access local instance "
						+ "without FINAL KEYWORD " + b);
				System.out.println("Saying ID from sayData class "
						+ "which is present in Robot class");
			}
		}
		sayData ex = new sayData();
		ex.speakID();
	}

	static class Brain {
		public void braintalk() {
			System.out.println("Brain talking now...");
		}
	}
}
