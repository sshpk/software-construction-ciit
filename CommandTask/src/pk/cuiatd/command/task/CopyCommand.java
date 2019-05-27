package pk.cuiatd.command.task;

public class CopyCommand extends Command{
	
	public CopyCommand(Editor editor) {
		super(editor);
	}
	@Override
	void execute(String text) {
		backup =editor.getCopiedText();
		editor.setCopiedText(text);
		
	}
	@Override
	void undo() {
		editor.setCopiedText(backup);
		
	}

}
