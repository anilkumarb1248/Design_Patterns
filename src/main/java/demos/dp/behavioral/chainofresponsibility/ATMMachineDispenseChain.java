package demos.dp.behavioral.chainofresponsibility;

public class ATMMachineDispenseChain {

	private MoneyDispenseChain moneyDispenseChain1;

	public ATMMachineDispenseChain() {
		// initialize the chain
		moneyDispenseChain1 = new Rupees2000NotesDispenser();
		MoneyDispenseChain moneyDispenseChain2 = new Rupees500NotesDispenser();
		MoneyDispenseChain moneyDispenseChain3 = new Rupees200NotesDispenser();
		MoneyDispenseChain moneyDispenseChain4 = new Rupees100NotesDispenser();

		// set the chain of responsibility
		moneyDispenseChain1.setNextChain(moneyDispenseChain2);
		moneyDispenseChain2.setNextChain(moneyDispenseChain3);
		moneyDispenseChain3.setNextChain(moneyDispenseChain4);

	}

	public MoneyDispenseChain getMoneyDispenseChain1() {
		return moneyDispenseChain1;
	}

}
