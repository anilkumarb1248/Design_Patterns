package demos.dp.behavioral.strategy;

public class CreditCardPaymentMethod implements PaymentMethod {

	private String cardHolderName;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;

	public CreditCardPaymentMethod(String cardHolderName, String cardNumber, String cvv, String dateOfExpiry) {
		this.cardHolderName = cardHolderName;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}

	@Override
	public void pay(int amount) {
		// We need to write actual logic using the details
		System.out.println("Paying " + amount + " rupees using credit card: " + this);
	}

	@Override
	public String toString() {
		return "CreditCardPaymentMethod [cardHolderName=" + cardHolderName + ", cardNumber=" + cardNumber + ", cvv="
				+ cvv + ", dateOfExpiry=" + dateOfExpiry + "]";
	}

}
