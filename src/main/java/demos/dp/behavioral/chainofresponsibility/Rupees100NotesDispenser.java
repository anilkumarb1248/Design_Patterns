package demos.dp.behavioral.chainofresponsibility;

public class Rupees100NotesDispenser implements MoneyDispenseChain {

	MoneyDispenseChain moneyDispenseChain = null;

	@Override
	public void setNextChain(MoneyDispenseChain moneyDispenseChain) {
		this.moneyDispenseChain = moneyDispenseChain;
	}

	@Override
	public void despense(Currency currency) {
		if (currency.getAmount() >= 100) {
			int numberOfNotes = currency.getAmount() / 100;
			int remainder = currency.getAmount() % 100;
			System.out.println("Dispensing " + numberOfNotes + " Note(s) of Rs 100");
			if (remainder != 0) {
				moneyDispenseChain.despense(new Currency(remainder));
			}
		} else {
			moneyDispenseChain.despense(currency);
		}
	}

}
