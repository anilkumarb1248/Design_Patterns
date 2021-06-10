package demos.dp.behavioral.command;

public class WriteFileCommand implements Command {

	private SystemFileReader systemFileReader;

	public WriteFileCommand(SystemFileReader systemFileReader) {
		this.systemFileReader = systemFileReader;
	}

	@Override
	public void execute() {
		// write command is forwarding request to writeFile method
		systemFileReader.writeFile();
	}

}
