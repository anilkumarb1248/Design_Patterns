package demos.dp.structural.flyweight;

public class Car implements Vehicle {

	private String MAXSPEED = "120 km/hr"; // intrinsic property
	private String color = null; // extrinsic property - supplied by client

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void startEngine() {
		System.out.println(color + " colored Car with max speed: " + MAXSPEED);
	}

}
