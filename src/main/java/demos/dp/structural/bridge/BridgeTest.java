package demos.dp.structural.bridge;

public class BridgeTest {

	public static void main(String[] args) {
		Shape traingle = new Triangle(new RedColor());
		traingle.draw();

		Shape rectangle = new Rectangle(new BlueColor());
		rectangle.draw();
	}

}
