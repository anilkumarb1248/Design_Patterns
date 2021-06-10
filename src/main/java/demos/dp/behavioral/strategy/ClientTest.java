package demos.dp.behavioral.strategy;

public class ClientTest {

	public static void main(String[] args) {

		ShoppingCart cart = new ShoppingCart();

		System.out.println("---- Credit Card");

		Product p1 = new Product("phone", 1000);
		Product p2 = new Product("TV", 2000);

		cart.addProduct(p1);
		cart.addProduct(p2);

		PaymentMethod creditCardPayment = new CreditCardPaymentMethod("Anil", "413248743213", "321", "05/2030");
		cart.buy(creditCardPayment);

		System.out.println("---- Netbanking");

		Product p3 = new Product("Washing Machine", 3000);
		Product p4 = new Product("Refrigerator", 4000);

		cart.addProduct(p3);
		cart.addProduct(p4);

		PaymentMethod netBankingPayment = new NetBankingPaymentMethod("ICICI", "ABC", "1234");
		cart.buy(netBankingPayment);

	}

}
