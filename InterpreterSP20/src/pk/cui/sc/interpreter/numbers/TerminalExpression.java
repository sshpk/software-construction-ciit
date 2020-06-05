package pk.cui.sc.interpreter.numbers;

public class TerminalExpression implements Expression{
	private final int number;
	public TerminalExpression(int number){
		this.number = number;
	}
	@Override
	public int interpret() {
		return number;
	}
}
