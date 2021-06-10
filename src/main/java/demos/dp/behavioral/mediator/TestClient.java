package demos.dp.behavioral.mediator;

public class TestClient {

	public static void main(String[] args) {

		ChatRoomMediator mediator = new ChatRoomMediatorImpl();

		User user1 = new UserImpl(mediator, "Anil");
		User user2 = new UserImpl(mediator, "Manu");
		User user3 = new UserImpl(mediator, "Pinkulu");
		User user4 = new UserImpl(mediator, "Sahanvi");
		User user5 = new UserImpl(mediator, "Jessi");

		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		mediator.addUser(user5);

		user1.sendMessage("Hi All");
		System.out.println("----------------");
		user4.sendMessage("Good Morning");
	}

}
