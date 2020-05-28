package pk.cui.sc.command;

import pk.ciit.command.Command;
import pk.ciit.command.FileSystemReceiver;

public class CloseFileCommand implements Command {
 
    private FileSystemReceiver fileSystem;
     
    public CloseFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }
 
}
