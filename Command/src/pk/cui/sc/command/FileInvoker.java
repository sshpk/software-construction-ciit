package pk.cui.sc.command;

import pk.ciit.command.Command;

public class FileInvoker {
	public Command command;
    
    public FileInvoker(Command c){
        this.command=c;
    }
     
    public void execute(){
        this.command.execute();
    }
}
