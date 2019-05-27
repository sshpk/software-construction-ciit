package pk.cuiatd.command.task;

public class PasteCommand extends Command{

	public PasteCommand(Editor editor) {
		super(editor);
	}

	@Override
	void execute(String text) {
		backup = editor.getSelection();
		String copiedText=editor.getCopiedText();
		editor.replaceSelection(copiedText);
		
	}

	@Override
	void undo() {
		editor.replaceSelection(backup);
		
	}

}
