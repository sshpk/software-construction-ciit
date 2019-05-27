package pk.cuiatd.command.task;

public class Application {
	public static void main(String[] args) {
		Editor editor = new Editor("Hello world");
		System.out.println("The current selection is "+editor.getSelection());
		
		Command copyCommand = new CopyCommand(editor);
		Button copyButton = new Button (copyCommand);
		
		
		Command pasteCommand = new PasteCommand(editor);
		Button pasteButton = new Button(pasteCommand);
		
		copyButton.execute("Salam");
		System.out.println("The current selection is "+editor.getSelection());
		
		pasteButton.execute("");
		System.out.println("The current selection is "+editor.getSelection());
		
		pasteButton.undo();
		System.out.println("The current selection is "+editor.getSelection());
	}

}
