package demos.dp.creational.factory;

public class Server implements Computer {

	private String ram;
	private String hdd;
	private String cpu;
	private boolean isGraphicsEnabled;
	private boolean isBluetoothEnabled;

	public Server(String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.isGraphicsEnabled = isGraphicsEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

	@Override
	public String ram() {
		return ram;
	}

	@Override
	public String hdd() {
		return hdd;
	}

	@Override
	public String cpu() {
		return cpu;
	}

	@Override
	public boolean isGraphicsEnabled() {
		return isGraphicsEnabled;
	}

	@Override
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	@Override
	public String toString() {
		return "Server [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicsEnabled=" + isGraphicsEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}

}
