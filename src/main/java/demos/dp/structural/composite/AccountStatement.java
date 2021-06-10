package demos.dp.structural.composite;

public class AccountStatement {

	private String statement;

	public AccountStatement(String statement) {
		this.statement = statement;
	}

	public String getStatement() {
		return statement;
	}

	public AccountStatement merge(AccountStatement statement) {
		this.statement = this.statement + ", " + statement.getStatement();
		return this;
	}

}
