package demos.dp.behavioral.command;

public class CommandInvoker {

	private Command command;

	public CommandInvoker(Command command) {
		this.command = command;
	}

	public void invoke() {
		command.execute();
	}

}
