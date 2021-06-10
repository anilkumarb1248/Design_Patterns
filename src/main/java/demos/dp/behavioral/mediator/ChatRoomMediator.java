package demos.dp.behavioral.mediator;

public interface ChatRoomMediator {
	
	public void addUser(User user);
	
	public void sendMessage(String message, User user);

}
