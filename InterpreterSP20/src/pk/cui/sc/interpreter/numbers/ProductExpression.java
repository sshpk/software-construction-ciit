package pk.cui.sc.interpreter.numbers;

public class ProductExpression extends NonTerminalExpression{
	
	public ProductExpression(Expression leftExpression, Expression rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	public int interpret() {
		return leftExpression.interpret() * rightExpression.interpret();
	}
}
