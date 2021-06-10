package demos.dp.structural.flyweight;

public class ClientTest {

	public static void main(String[] args) {
		Vehicle car = VehicleFactory.getVehicle("car");
		car.setColor("Black");
		car.startEngine();

		car.setColor("Red");
		car.startEngine();

		Vehicle bike = VehicleFactory.getVehicle("bike");
		bike.setColor("Blue");
		bike.startEngine();

		bike.setColor("Gray");
		bike.startEngine();
		
		Vehicle bus = VehicleFactory.getVehicle("bus");
		bus.setColor("Green");
		bus.startEngine();
	}

}
