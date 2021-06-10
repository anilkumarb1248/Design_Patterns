package demos.dp.behavioral.mediator;

public class UserImpl extends User {

	public UserImpl(ChatRoomMediator chatRoom, String userName) {
		super(chatRoom, userName);
	}

	@Override
	public void sendMessage(String message) {
		System.out.println(userName + " sending message: " + message);
		chatRoom.sendMessage(message, this);
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println(userName + " received message: " + message);
	}

}
