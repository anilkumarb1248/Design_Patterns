package demos.dp.structural.bridge;

public class Rectangle extends Shape {

	public Rectangle(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.println("Rectangle is drawn:" + color.fill());
	}

}
