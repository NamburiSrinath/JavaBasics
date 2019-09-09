import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int a;
	private String b;

	public Person(int a, String b) {
		this.a = a;
		this.b = b;
	}

	public String toString() {
		return a + " " + b;
	}
}
