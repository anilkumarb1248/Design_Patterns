package demos.dp.creational.abstract_factory;

public class FactoryTest {

	public static void main(String[] args) {

		Computer desktop = ComputerFactory.getComputer(new DesktopFactory("8GB", "500GB", "2,23HGZ", true, false));
		System.out.println("Desktop Config: " + desktop);

		Computer laptop = ComputerFactory.getComputer(new LaptopFactory("16GB", "1TB", "2,26HGZ", true, true));
		System.out.println("Laptop Config: " + laptop);

		Computer server = ComputerFactory.getComputer(new ServerFactory("100GB", "1000TB", "2,29HGZ", false, false));
		System.out.println("Server Config: " + server);

	}

}
