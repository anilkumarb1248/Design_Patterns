package demos.dp.behavioral.observer;

public class ClientTest {

	public static void main(String[] args) {
		MessageSubscriberOne subscriberOne = new MessageSubscriberOne();
		MessageSubscriberTwo subscriberTwo = new MessageSubscriberTwo();
		MessageSubscriberThree subscriberThree = new MessageSubscriberThree();

		Subject publisher = new MessagePublisher();
		publisher.register(subscriberOne);
		publisher.register(subscriberTwo);

		publisher.notifyUpdate(new Message("First Message"));

		System.out.println("---------");
		publisher.unRegister(subscriberOne);
		publisher.register(subscriberThree);

		publisher.notifyUpdate(new Message("Second Message"));

	}

}
