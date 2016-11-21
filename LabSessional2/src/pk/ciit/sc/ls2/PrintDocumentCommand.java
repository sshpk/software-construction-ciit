package pk.ciit.sc.ls2;

public class PrintDocumentCommand implements Command{
	TextEditor reciever;
	public PrintDocumentCommand(TextEditor ed) {
		reciever = ed;
	}

	@Override
	public void execute() {
		reciever.printDocument();		
	}
}
