package demos.dp.structural.composite;

public class SavingAccount implements Account {

	private String accountNumber;
	private double accountBalance;

	public SavingAccount(String accountNumber, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}

	@Override
	public double getBalance() {
		return accountBalance;
	}

	@Override
	public AccountStatement getStatement() {
		return new AccountStatement("Saving Account statment for:" + accountNumber);
	}

}
