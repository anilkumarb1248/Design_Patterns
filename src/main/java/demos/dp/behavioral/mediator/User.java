package demos.dp.behavioral.mediator;

public abstract class User {

	protected ChatRoomMediator chatRoom;
	protected String userName;

	public User(ChatRoomMediator chatRoom, String userName) {
		this.chatRoom = chatRoom;
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public abstract void sendMessage(String message);

	public abstract void receiveMessage(String message);

}
