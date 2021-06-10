package demos.dp.structural.flyweight;

public class Bike implements Vehicle {

	private String MAXSPEED = "60 km/hr"; // intrinsic property
	private String color = null; // extrinsic property - supplied by client

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void startEngine() {
		System.out.println(color + " colored Bike with max speed: " + MAXSPEED);
	}

}
