package demos.dp.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoomMediatorImpl implements ChatRoomMediator {

	List<User> users = new ArrayList<>();

	@Override
	public void addUser(User user) {
		users.add(user);
	}

	@Override
	public void sendMessage(String message, User user) {
		users.forEach(u -> {
			if (!u.getUserName().equalsIgnoreCase(user.getUserName())) {
				u.receiveMessage(message);
			}
		});
	}

}
