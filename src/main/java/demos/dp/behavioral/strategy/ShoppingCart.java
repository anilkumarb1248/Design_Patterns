package demos.dp.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCart {

	List<Product> products = new ArrayList<>();

	public void addProduct(Product product) {
		products.add(product);
	}

	public void removeProduct(Product product) {
		products.remove(product);
	}

	public void clearProducts() {
		products.clear();
	}
	
	public int calculateTotalPrice() {
//		return products.stream().mapToInt(product -> product.getPrice()).sum();
//		return products.stream().mapToInt(Product::getPrice).sum();
//		return products.stream().map(Product::getPrice).reduce(0, Integer::sum);
		return products.stream().collect(Collectors.summingInt(Product::getPrice));
	}

	public void buy(PaymentMethod paymentMethod) {
		paymentMethod.pay(calculateTotalPrice());
		clearProducts();
	}

}
