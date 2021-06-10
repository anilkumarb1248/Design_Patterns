package demos.dp.behavioral.chainofresponsibility;

import java.util.Scanner;

public class TestClient {

	public static void main(String[] args) {

		ATMMachineDispenseChain atm = new ATMMachineDispenseChain();

		Scanner scanner = null;
		boolean flag = true;
		while (flag) {
			int amount = 0;
			System.out.println("Enter amount to withdraw");
			scanner = new Scanner(System.in);
			amount = scanner.nextInt();
			if (amount % 100 != 0) {
				System.out.println("Amount should be in multiple of 100s.");
				flag = false;
			}
			atm.getMoneyDispenseChain1().despense(new Currency(amount));
		}
		if (null != scanner) {
			scanner.close();
		}
	}

}
