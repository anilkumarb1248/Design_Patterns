package demos.dp.behavioral.chainofresponsibility;

public class Rupees2000NotesDispenser implements MoneyDispenseChain {

	MoneyDispenseChain moneyDispenseChain = null;

	@Override
	public void setNextChain(MoneyDispenseChain moneyDispenseChain) {
		this.moneyDispenseChain = moneyDispenseChain;
	}

	@Override
	public void despense(Currency currency) {
		if (currency.getAmount() >= 2000) {
			int numberOfNotes = currency.getAmount() / 2000;
			int remainder = currency.getAmount() % 2000;
			System.out.println("Dispensing " + numberOfNotes + " Note(s) of Rs 2000");
			if (remainder != 0) {
				moneyDispenseChain.despense(new Currency(remainder));
			}
		} else {
			moneyDispenseChain.despense(currency);
		}
	}

}
