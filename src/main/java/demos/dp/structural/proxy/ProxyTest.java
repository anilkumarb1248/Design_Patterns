package demos.dp.structural.proxy;

public class ProxyTest {

	public static void main(String[] args) {
		VeryExpensiveProcess veryExpensiveProcess = new VeryExpensiveProcessProxy();
		veryExpensiveProcess.process();
		veryExpensiveProcess.process();
		veryExpensiveProcess.process();

	}

}
