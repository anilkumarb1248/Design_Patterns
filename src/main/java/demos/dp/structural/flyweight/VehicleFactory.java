package demos.dp.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

	private static Map<String, Vehicle> vehiclesMap = new HashMap<>();

	public static Vehicle getVehicle(String type) {
		Vehicle vehicle = null;
		if (vehiclesMap.containsKey(type)) {
			vehicle = vehiclesMap.get(type);
		} else {
			switch (type) {
			case "car":
				System.out.println("Car is created");
				vehicle = new Car();
				break;
			case "bike":
				System.out.println("Bike is created");
				vehicle = new Bike();
				break;
			case "bus":
				System.out.println("Bus is created");
				vehicle = new Bus();
				break;
			default:
				throw new RuntimeException("Incorrect Vehicle type");
			}
			vehiclesMap.put(type, vehicle);
		}
		return vehicle;
	}

}
