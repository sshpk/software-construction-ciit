package pk.ciit.sc.ls2;

public class CommandInvoker {
	Command command;
	public CommandInvoker(Command cmd) {
		command = cmd;
	}
	void execute(){
		command.execute();
	}
}
