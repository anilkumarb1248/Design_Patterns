package demos.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeAccountService implements Account {

	List<Account> accountsList = new ArrayList<>();
	private double totalBalance;
	private AccountStatement statement;

	public void addAccount(Account account) {
		accountsList.add(account);
	}

	public void removeAccount(Account account) {
		accountsList.remove(account);
	}

	public void clearAccounts() {
		accountsList.clear();
	}

	@Override
	public double getBalance() {
		totalBalance = 0;
		accountsList.forEach(account -> totalBalance = totalBalance + account.getBalance());
		return totalBalance;
	}

	@Override
	public AccountStatement getStatement() {
		accountsList.forEach(account -> {
			if (null == statement) {
				statement = account.getStatement();
			} else {
				statement = statement.merge(account.getStatement());
			}
		});
		return statement;
	}

}
