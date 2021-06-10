package demos.dp.creational.factory;

public class ComputerFactory {

	private ComputerFactory() {
	}

	public static Computer getComputer(ComputerType computerType, String ram, String hdd, String cpu,
			boolean isGraphicsEnabled, boolean isBluetoothEnabled) {

		switch (computerType) {
			case DESKTOP:
				return new Desktop(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
			case LAPTOP:
				return new Laptop(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
			case SERVER:
				return new Server(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
			default:
				throw new RuntimeException("Not a valid computer type!");
		}
	}
}
