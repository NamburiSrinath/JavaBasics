import java.io.Serializable;
//Need to import this one to make sure the specific class can be serialisable
//Serialisable used to export/retrieve data in various formats

public class Person implements Serializable{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//To make a class serializable and unique as in if we change the value, 
	//then it can't read/write the same file though it has same name
	private int number;
	private String name;

	public Person(int number, String name) {
		this.number = number;
		this.name = name;

	}

	@Override
	//Used to print in a nice format
	public String toString() {
		return "Person [number=" + number + ", name=" + name + "]";
	}
	

}
