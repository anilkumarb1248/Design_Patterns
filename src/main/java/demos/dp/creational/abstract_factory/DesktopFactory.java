package demos.dp.creational.abstract_factory;

public class DesktopFactory implements AbstractComputerFactory {

	private String ram;
	private String hdd;
	private String cpu;
	private boolean isGraphicsEnabled;
	private boolean isBluetoothEnabled;

	public DesktopFactory(String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.isGraphicsEnabled = isGraphicsEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

	@Override
	public Computer createComputer() {
		return new Desktop(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
	}

}
