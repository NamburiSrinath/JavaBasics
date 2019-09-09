import reptiles.IndianFrog;//Importing from another package. 
//Rewrites if u have with same name
class Frog{
	public static String name;
	public Frog(String name)
	{
		this.name = name; //this will differentiate between the same variable names
	}
	public String toString()
	{
		StringBuilder a = new StringBuilder();
		a.append("Hello buddy ").append("This is " + name);
		return a.toString();
	}
}
public class App {

	public static void main(String[] args) {
//		StringBuilder one = new StringBuilder();
//		one.append("Hello");
//		one.append(" This is Srinath");
//		System.out.println(one.toString()); //Print the string present in that object
		Frog frog1 = new Frog("Jonny");
		System.out.println(frog1);
		IndianFrog f1 = new IndianFrog();//Creates from PACKAGE ONE AS WE HAVE IMPORTED
		UKFrog f2 = new UKFrog();//Though UK is inherited one...it has 2 shouts(Ind/UK)
		//we have overwritten the shout method.
		f1.shout();
		f2.shout();
		

	}

}
