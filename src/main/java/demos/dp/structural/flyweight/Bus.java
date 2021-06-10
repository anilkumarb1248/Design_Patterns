package demos.dp.structural.flyweight;

public class Bus implements Vehicle {

	private String MAXSPEED = "40 km/hr"; // intrinsic property
	private String color = null; // extrinsic property - supplied by client

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void startEngine() {
		System.out.println(color + " colored Bus with max speed: " + MAXSPEED);
	}

}
