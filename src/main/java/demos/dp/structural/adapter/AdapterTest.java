package demos.dp.structural.adapter;

public class AdapterTest {

	public static void main(String[] args) {
		WallSocket wallSocket = new WallSocketImpl();
		Volt v240 = wallSocket.getVolts();
		System.out.println(v240);

		MobileAdapter mobileAdapter = new MobileAdapterImpl(wallSocket);
		Volt v3 = mobileAdapter.get3Volts();
		System.out.println(v3);

	}

}
