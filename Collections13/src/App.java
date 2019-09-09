import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		String[] vehicles = { "Ambulance", "Helicopter", "Car" };
		String[][] drivers = { { "Ram", "Sekhar", "Kishore" }, { "Raja", "Murali", "Pavan", "Venkat" }, { "Srinu" } };

		Map<String, Set<String>> personnel = new HashMap<String, Set<String>>();
		for (int i = 0; i < vehicles.length; i++) {
			
			String vehicle = vehicles[i];
			String[] driversList = drivers[i];
			
			Set<String> driverSet = new LinkedHashSet<>();
			for(String driver: driversList) {
				driverSet.add(driver);
			}
			personnel.put(vehicle, driverSet);
		}
		System.out.println(personnel);
		
		//System.out.println(person);
		for(String driver: personnel.get("Helicopter")) {
			System.out.println(driver);
			
		}
		

	}

}
