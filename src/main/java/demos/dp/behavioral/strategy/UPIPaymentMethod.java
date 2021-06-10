package demos.dp.behavioral.strategy;

public class UPIPaymentMethod implements PaymentMethod {

	private String upiId;

	public UPIPaymentMethod(String upiId) {
		super();
		this.upiId = upiId;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Paying " + amount + " rupees using UPI: " + upiId);
	}

}
