package demos.dp.behavioral.observer;

public class MessageSubscriberTwo implements Observer {

	@Override
	public void update(Message message) {
		System.out.println("MessageSubscriberTwo notified :: " + message.getMessage());
	}

}
