package pk.cui.sc.command;

import pk.ciit.command.FileSystemReceiver;
import pk.ciit.command.OpenFileCommand;
import pk.ciit.command.WindowsFileSystemReceiver;

public class Demo {
	public static void main(String[] args) {
		//Creating the receiver object
		FileSystemReceiver fs = new WindowsFileSystemReceiver();

		//creating command and associating with receiver
		OpenFileCommand openFileCommand = new OpenFileCommand(fs);
		//Creating invoker and associating with Command
		FileInvoker invoker = new FileInvoker(openFileCommand);

		//perform action on invoker object
		invoker.execute();

		WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
		invoker = new FileInvoker(writeFileCommand);
		invoker.execute();

		CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
		invoker = new FileInvoker(closeFileCommand);
		invoker.execute();

		fs = new UnixFileSystemReceiver();

		openFileCommand = new OpenFileCommand(fs);
		invoker = new FileInvoker(openFileCommand);
		invoker.execute();

		writeFileCommand = new WriteFileCommand(fs);
		invoker = new FileInvoker(writeFileCommand);
		invoker.execute();

		closeFileCommand = new CloseFileCommand(fs);
		invoker = new FileInvoker(closeFileCommand);
		invoker.execute();
		
	}
}
