package pk.cui.sc.command;

public class WindowsFileSystemReciever implements FileSystemReciever{

	@Override
	public void openFile() {
		System.out.println("Windows is opening the File");
		
	}

	@Override
	public void closeFile() {
		System.out.println("Windows is closing the File");
		
	}

	@Override
	public void writeFile() {
		System.out.println("Windows is writing the File");
		
	}

}
