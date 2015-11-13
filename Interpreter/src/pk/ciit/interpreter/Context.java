package pk.ciit.interpreter;

public class Context {
	String input;
	int output;
	public Context(String input) {
		setInput(input);
	}
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public int getOutput() {
		return output;
	}
	public void setOutput(int output) {
		this.output = output;
	}
}
