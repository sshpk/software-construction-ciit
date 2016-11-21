package pk.ciit.sc.ls2;

public class Demo {

	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		Command command = new NewDocumentCommand(editor);
		CommandInvoker invoker = new CommandInvoker(command);
		invoker.execute();
		
		command = new PrintDocumentCommand(editor);
		invoker = new CommandInvoker(command);
		invoker.execute();
		
		command = new ExitCommand(editor);
		invoker = new CommandInvoker(command);
		invoker.execute();
	}

}
