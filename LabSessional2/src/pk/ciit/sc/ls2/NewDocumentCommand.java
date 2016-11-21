package pk.ciit.sc.ls2;

public class NewDocumentCommand implements Command{
	TextEditor reciever;
	public NewDocumentCommand(TextEditor ed) {
		reciever = ed;
	}

	@Override
	public void execute() {
		reciever.newDocument();	
	}
}
