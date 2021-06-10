package demos.dp.creational.abstract_factory;

public class ComputerFactory {

	private ComputerFactory() {
	}

	public static Computer getComputer(AbstractComputerFactory abstractComputerFactory) {
		return abstractComputerFactory.createComputer();

	}
}
