package pk.cui.sc.interpreter.numbers;

public abstract class NonTerminalExpression implements Expression{
	protected final Expression leftExpression;
	protected final Expression rightExpression;
	public NonTerminalExpression(Expression leftExpression,Expression rightExpression ){
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}
}
