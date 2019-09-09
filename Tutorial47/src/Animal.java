
public enum Animal {
CAT("Tom"), DOG("Bunty"), RAT("Jerry");
	//CAT, DOG and RAT are enum constants
	//Tom, Bunty, Jerry are variables assigned to it
	private String name;
	Animal(String name)
	{
		this.name = name;
	}
	public String toString()
	{
		return name;
	}
	
}
