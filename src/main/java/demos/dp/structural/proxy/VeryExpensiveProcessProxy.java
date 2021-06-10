package demos.dp.structural.proxy;

public class VeryExpensiveProcessProxy implements VeryExpensiveProcess {

	private VeryExpensiveProcess veryExpensiveProcessObject = null;

	@Override
	public void process() {
		if (null == veryExpensiveProcessObject) {
			veryExpensiveProcessObject = new VeryExpensiveProcessImpl();
		}
		veryExpensiveProcessObject.process();
	}

}
