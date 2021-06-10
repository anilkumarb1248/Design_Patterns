package demos.dp.behavioral.state;

public class ClientTest {

	public static void main(String[] args) {
		TVContext tvContext = new TVContext();
		tvContext.clickButton();
		tvContext.clickButton();
		tvContext.clickButton();
		tvContext.clickButton();
	}
}
