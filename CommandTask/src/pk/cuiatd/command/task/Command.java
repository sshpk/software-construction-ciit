package pk.cuiatd.command.task;

public abstract class Command {
	Editor editor;
	String backup;
	public Command(Editor editor){
		this.editor = editor;
	}
	abstract void execute(String text);
	abstract void undo();
}

