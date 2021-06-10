package demos.dp.behavioral.strategy;

public class PaypalPaymentMethod implements PaymentMethod {

	private String email;
	private String password;

	public PaypalPaymentMethod(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Paying " + amount + " rupees using Paypal");
	}

	@Override
	public String toString() {
		return "PaypalPaymentMethod [email=" + email + ", password=" + password + "]";
	}

}
