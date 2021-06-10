package demos.dp.structural.decorator;

public class DecoratorCleintTest {

	public static void main(String[] args) {

		System.out.println("----- Basic Car ---");
		Car car = new BasicCar();
		car.assemble();
		
		System.out.println("----- Luxury Car ---");
		Car luxuryCar = new LuxuryCar(new BasicCar());
		luxuryCar.assemble();
		
		System.out.println("----- Sports Car ---");
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		
		System.out.println("----- Luxury Sports Car ---");
		Car luxurySportsCar = new LuxuryCar(new SportsCar(new BasicCar()));
		luxurySportsCar.assemble();

	}

}
