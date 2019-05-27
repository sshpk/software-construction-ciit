package pk.cuiatd.command.task;

public class Editor {
	private String text;
	private String copiedText;
	public Editor(String text) {
		this.text=text;
	}
	public String getSelection(){
		return text;
	}
	public void replaceSelection(String text){
		System.out.println("the selected text: "+this.text+
				" is now replaced with: "+text);
		this.text = text;
	}
	public void deleteSelection(){
		System.out.println("the selected text: "+this.text+
				"is now deleted");
		text="";
	}
	public void setSelection(String text) {
		this.text = text;
		
	}
	public void setCopiedText(String copiedText) {
		this.copiedText = copiedText;
	}
	public String getCopiedText(){
		return copiedText;
	}

}
