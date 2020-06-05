package pk.cui.sc.interpreter.numbers;

public class InterpreterUtil {
	public static boolean isOperator(String s) {
		if (s.equals("+") || s.equals("-") || s.equals("*"))
			return true;
		else
			return false;
	}
	public static Expression getOperator(String s, Expression left, Expression right) {
		switch (s) {
		case "+":
			return new SumExpression(left, right);
		case "-":
			return new DifferenceExpression(left, right);
		case "*":
			return new ProductExpression(left, right);
		}
		return null;
	}
}
