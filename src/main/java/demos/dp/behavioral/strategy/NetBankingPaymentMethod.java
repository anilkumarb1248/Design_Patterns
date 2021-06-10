package demos.dp.behavioral.strategy;

public class NetBankingPaymentMethod implements PaymentMethod {

	private String bankName;
	private String userName;
	private String password;

	public NetBankingPaymentMethod(String bankName, String userName, String password) {
		this.bankName = bankName;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Paying " + amount + " rupees using net banking: " + this);
	}

	@Override
	public String toString() {
		return "NetBankingPaymentMethod [bankName=" + bankName + ", userName=" + userName + ", password=" + password
				+ "]";
	}

}
