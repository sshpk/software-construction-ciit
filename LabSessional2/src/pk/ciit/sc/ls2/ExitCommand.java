package pk.ciit.sc.ls2;

public class ExitCommand implements Command{
	TextEditor reciever;
	public ExitCommand(TextEditor ed) {
		reciever = ed;
	}

	@Override
	public void execute() {
		reciever.exit();		
	}
}
