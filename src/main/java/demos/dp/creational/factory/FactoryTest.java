package demos.dp.creational.factory;

public class FactoryTest{

	public static void main(String[] args) {

		Computer desktop = ComputerFactory.getComputer(ComputerType.DESKTOP, "8GB", "500GB", "2,23HGZ", true, false);
		System.out.println("Desktop Config: " + desktop);

		Computer laptop = ComputerFactory.getComputer(ComputerType.LAPTOP, "16GB", "1TB", "2,26HGZ", true, true);
		System.out.println("Laptop Config: " + laptop);

		Computer server = ComputerFactory.getComputer(ComputerType.SERVER, "100GB", "1000TB", "2,29HGZ", false, false);
		System.out.println("Server Config: " + server);

	}

}
