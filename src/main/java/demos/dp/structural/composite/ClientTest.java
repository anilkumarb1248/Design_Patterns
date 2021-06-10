package demos.dp.structural.composite;

public class ClientTest {

	public static void main(String[] args) {

		// Creating a component tree
		CompositeAccountService accountService = new CompositeAccountService();

		// Adding all accounts of a customer to component
		accountService.addAccount(new SavingAccount("1A0B", 1000));
		accountService.addAccount(new CurrentAccount("5X8H", 2500));
		accountService.addAccount(new DepositAccount("9Y6J", 9500));

		// getting all accounts total balance
		double totalBalance = accountService.getBalance();
		System.out.println("Total Balance: " + totalBalance);

		// getting all accounts merged statement
		AccountStatement mergedStatement = accountService.getStatement();
		System.out.println(mergedStatement.getStatement());
	}

}
