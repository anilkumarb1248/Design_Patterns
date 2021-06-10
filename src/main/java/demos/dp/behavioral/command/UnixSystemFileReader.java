package demos.dp.behavioral.command;

public class UnixSystemFileReader implements SystemFileReader {

	@Override
	public void openFile() {
		System.out.println("Opening file in Unix OS");
	}

	@Override
	public void writeFile() {
		System.out.println("Writing into file in Unix OS");
	}

	@Override
	public void closeFile() {
		System.out.println("Closing file in Unix OS");
	}

}
