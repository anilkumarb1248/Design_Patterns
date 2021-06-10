package demos.dp.behavioral.command;

public class TestClient {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		System.out.println("Underlying OS is: " + osName);

		// Creating the receiver object
		SystemFileReader systemFileReader = null;
		if (osName.contains("Windows")) {
			systemFileReader = new WindowsSystemFileReader();
		} else {
			systemFileReader = new UnixSystemFileReader();
		}

		//creating command and associating with receiver
		Command openFileCommand = new OpenFileCommand(systemFileReader);
		//Creating invoker and associating with Command
		CommandInvoker openFileInvoker = new CommandInvoker(openFileCommand);
		//perform action on invoker object
		openFileInvoker.invoke();
		
		Command writeFileCommand = new WriteFileCommand(systemFileReader);
		CommandInvoker writeFileInvoker = new CommandInvoker(writeFileCommand);
		writeFileInvoker.invoke();
		
		Command closeFileCommand = new CloseFileCommand(systemFileReader);
		CommandInvoker closeFileInvoker = new CommandInvoker(closeFileCommand);
		closeFileInvoker.invoke();
	}

}
