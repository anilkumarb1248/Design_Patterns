package demos.dp.structural.adapter;

public class MobileAdapterImpl implements MobileAdapter {

	private WallSocket wallSocket;

	public MobileAdapterImpl(WallSocket wallSocket) {
		this.wallSocket = wallSocket;
	}

	@Override
	public Volt get3Volts() {
		Volt v240 = wallSocket.getVolts();
		int v3 = v240.getVolt() / 80;
		return new Volt(v3);
	}

}
