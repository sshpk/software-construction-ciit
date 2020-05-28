package pk.cui.sc.command;

import pk.ciit.command.Command;
import pk.ciit.command.FileSystemReceiver;

public class WriteFileCommand implements Command {
 
    private FileSystemReceiver fileSystem;
     
    public WriteFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }
 
}
