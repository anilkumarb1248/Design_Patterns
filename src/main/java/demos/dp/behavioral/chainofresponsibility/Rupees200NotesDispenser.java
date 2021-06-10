package demos.dp.behavioral.chainofresponsibility;

public class Rupees200NotesDispenser implements MoneyDispenseChain {

	MoneyDispenseChain moneyDispenseChain = null;

	@Override
	public void setNextChain(MoneyDispenseChain moneyDispenseChain) {
		this.moneyDispenseChain = moneyDispenseChain;
	}

	@Override
	public void despense(Currency currency) {
		if (currency.getAmount() >= 200) {
			int numberOfNotes = currency.getAmount() / 200;
			int remainder = currency.getAmount() % 200;
			System.out.println("Dispensing " + numberOfNotes + " Note(s) of Rs 200");
			if (remainder != 0) {
				moneyDispenseChain.despense(new Currency(remainder));
			}
		} else {
			moneyDispenseChain.despense(currency);
		}
	}

}
