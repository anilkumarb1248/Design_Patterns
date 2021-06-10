package demos.dp.structural.composite;

public class DepositAccount implements Account {

	private String accountNumber;
	private double accountBalance;

	public DepositAccount(String accountNumber, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}

	@Override
	public double getBalance() {
		return accountBalance;
	}

	@Override
	public AccountStatement getStatement() {
		return new AccountStatement("Deposit Account statment for:" + accountNumber);
	}

}
