package demos.dp.creational.builder;

public class BuilderTest {

	public static void main(String[] args) {
		// Creating the Laptop object with only mandatory attributes
		Laptop laptop = new Laptop.LaptopBuilder("8GB", "1TB", "2,23HGZ").build();
		System.out.println("Laptop Configy:" + laptop);

		// Creating the Laptop object with mandatory and optional attributes
		Laptop laptop2 = new Laptop.LaptopBuilder("8GB", "1TB", "2,23HGZ")
				.setBluetoothEnabled(true)
				.build();
		System.out.println("Laptop2 Configy:" + laptop2);

		Laptop laptop3 = new Laptop.LaptopBuilder("8GB", "1TB", "2,23HGZ")
				.setGraphicsEnabled(true)
				.build();
		System.out.println("Laptop3 Configy:" + laptop3);

		Laptop laptop4 = new Laptop.LaptopBuilder("8GB", "1TB", "2,23HGZ")
				.setBluetoothEnabled(true)
				.setGraphicsEnabled(true)
				.build();
		System.out.println("Laptop4 Configy:" + laptop4);

	}

}
