package demos.dp.behavioral.chainofresponsibility;

public interface MoneyDispenseChain {

	public void setNextChain(MoneyDispenseChain moneyDispenseChain);

	public void despense(Currency currency);

}
