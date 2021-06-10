package demos.dp.structural.composite;

public class CurrentAccount implements Account {

	private String accountNumber;
	private double accountBalance;

	public CurrentAccount(String accountNumber, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}

	@Override
	public double getBalance() {
		return accountBalance;
	}

	@Override
	public AccountStatement getStatement() {
		return new AccountStatement("Current Account statment for:" + accountNumber);
	}

}
