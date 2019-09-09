import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();

		list.add("John");
		list.add("Bun");
		list.add("Junnu");
		Iterator<String> it = list.iterator();

		// Checks till the last element is there in Iterator
		while (it.hasNext()) {
			// It points to next item while giving the current item
			String value = it.next();

			// Can remove some element by comparing
			// Strings...so can use either == or .equals().
			// For our own objects, should use .equals() as they point to different
			// addresses though the content is same
			if (value == "Bun") {
				it.remove();
			}
			System.out.println(value);

		}
		System.out.println(list);

	}

}
