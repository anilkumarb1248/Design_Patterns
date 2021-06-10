package demos.dp.behavioral.command;

public class CloseFileCommand implements Command {

	private SystemFileReader systemFileReader;

	public CloseFileCommand(SystemFileReader systemFileReader) {
		this.systemFileReader = systemFileReader;
	}

	@Override
	public void execute() {
		// close command is forwarding request to closeFile method
		systemFileReader.closeFile();
	}

}
