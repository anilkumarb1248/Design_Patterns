package demos.dp.behavioral.command;

public class OpenFileCommand implements Command {

	private SystemFileReader systemFileReader;

	public OpenFileCommand(SystemFileReader systemFileReader) {
		this.systemFileReader = systemFileReader;
	}

	@Override
	public void execute() {
		// open command is forwarding request to openFile method
		systemFileReader.openFile();
	}

}
