package demos.dp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {

	private List<Observer> observers = new ArrayList<>();

	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unRegister(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyUpdate(Message message) {
		observers.forEach(observer -> {
			observer.update(message);
		});
	}

}
