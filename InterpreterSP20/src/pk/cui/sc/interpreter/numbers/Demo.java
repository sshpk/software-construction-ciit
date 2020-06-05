package pk.cui.sc.interpreter.numbers;

import java.util.Stack;

public class Demo {
	public static void main(String[] args) {
		String tokenString = "7 3 - 2 1 + *";
		Stack<Expression> stack = new Stack<>();
		String[] tokenArray = tokenString.split(" ");
		for (String s : tokenArray) {
			if (InterpreterUtil.isOperator(s)) {
				Expression rightExpression = stack.pop();
				Expression leftExpression = stack.pop();
				Expression operator = InterpreterUtil.getOperator(s,  leftExpression,rightExpression);
				int result = operator.interpret();
				stack.push(new TerminalExpression(result));
			} else {
				Expression i = new TerminalExpression(Integer.parseInt(s));
				stack.push(i);
			}
		}
		System.out.println("("+tokenString+"):"+stack.pop().interpret());
	}
}