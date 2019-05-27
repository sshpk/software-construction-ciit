package pk.cuiatd.command.task;

public class Button {
	Command command;
	public Button (Command command){
		this.command = command;
	}
	public void execute(String text){
		command.execute(text);
	}
	public void undo(){
		command.undo();
	}

}
