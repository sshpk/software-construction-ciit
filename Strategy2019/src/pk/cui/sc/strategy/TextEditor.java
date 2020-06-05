package pk.cui.sc.strategy;

public class TextEditor {
	private final TextFormatter textFormatter;
	public TextEditor(TextFormatter textFormatter){
		this.textFormatter = textFormatter;
	}
	/**
	 * This method formats the text and publishes it.
	 * @param text the text, which needs formating
	 * @see <a href="http://www.google.com">google</a> 
	 * @see "The Java Programming Language" 
	*/
	public void publishText(String text){
		textFormatter.format(text);
	}
}
