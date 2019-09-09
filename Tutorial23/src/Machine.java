
public class Machine implements Info{

	protected int number;
	
	public Machine()
	{
		System.out.println("I am default super constructor in Machine");
	}
	
	public Machine(int number)
	{
		this.number = number;
	}

	public void start() {
		System.out.println("I am ready");
	}

	public void showInfo() {
		System.out.println("My number is " + number);
	}
	public void sound()
	{
		System.out.println("TickTok");
	}
	public void greet()
	{
		System.out.println("Machine greet");
	}

}
