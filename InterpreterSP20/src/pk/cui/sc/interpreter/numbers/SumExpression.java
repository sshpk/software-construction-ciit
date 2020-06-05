package pk.cui.sc.interpreter.numbers;

public class SumExpression extends NonTerminalExpression{

	public SumExpression(Expression leftExpression,Expression rightExpression ){
		super(leftExpression, rightExpression);
	}
	@Override
	public int interpret() {
		return leftExpression.interpret() + rightExpression.interpret();
	}
}
