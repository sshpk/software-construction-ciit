package pk.cui.sc.command;

public class OpenFileCommand implements Command{
	private FileSystemReciever reciever;
	
	public OpenFileCommand(FileSystemReciever reciever){
		this.reciever=reciever;
		
	}

	@Override
	public void execute() {
		
		reciever.openFile();
	}

}
