package demos.dp.behavioral.command;

public class WindowsSystemFileReader implements SystemFileReader {

	@Override
	public void openFile() {
		System.out.println("Opening file in Window OS");
	}

	@Override
	public void writeFile() {
		System.out.println("Writing into file in Window OS");
	}

	@Override
	public void closeFile() {
		System.out.println("Closing file in Window OS");
	}

}
