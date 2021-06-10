package demos.dp.structural.proxy;

public class VeryExpensiveProcessImpl implements VeryExpensiveProcess {

	public VeryExpensiveProcessImpl() {
		heavyInitialConfigurationSetup();
	}

	@Override
	public void process() {
		System.out.println("Process is done");
	}

	public void heavyInitialConfigurationSetup() {
		System.out.println("Setting up initial configuration");
	}

}
