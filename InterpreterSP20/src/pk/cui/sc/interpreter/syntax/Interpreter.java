package pk.cui.sc.interpreter.syntax;

import java.util.Stack;

public class Interpreter {
	public static boolean precedence(char a, char b) {
		String high = "*/", low = "+-";
		if (a == '(') {
			return false;
		}
		if (a == ')' && b == '(') {
			System.out.println(")-(");
			return false;
		}
		if (b == '(') {
			return false;
		}
		if (b == ')') {
			return true;
		}
		if (high.indexOf(a) >  - 1 && low.indexOf(b) >  - 1) {
			return true;
		}
		if (high.indexOf(a) >  - 1 && high.indexOf(b) >  - 1) {
			return true;
		}
		//noinspection RedundantIfStatement
		if (low.indexOf(a) >  - 1 && low.indexOf(b) >  - 1) {
			return true;
		}
		return false;
	}
	public static String convertToPostfix(String expr) {
		Stack<Character> operationsStack = new Stack<>();
        StringBuilder out = new StringBuilder();
        String operations = "+-*/()";
        char topSymbol = '+';
        boolean empty;
        String[] tokens = expr.split(" ");
        for (String token : tokens)
            if (operations.indexOf(token.charAt(0)) == -1) {
                out.append(token);
                out.append(' ');
            } else {
                while (!(empty = operationsStack.isEmpty()) && precedence(topSymbol =
                        operationsStack.pop(), token.charAt(0))) {
                    out.append(topSymbol);
                    out.append(' ');
                }
                if (!empty) {
                    operationsStack.push(topSymbol);
                }
                if (empty || token.charAt(0) != ')') {
                    operationsStack.push(token.charAt(0));
                } else {
                    topSymbol = operationsStack.pop();
                }
            }
        while (!operationsStack.isEmpty()) {
            out.append(operationsStack.pop());
            out.append(' ');
        }
        return out.toString();
    }

    public static Operand buildSyntaxTree(String tree) {
        Stack <Operand> stack = new Stack<>();
        String operations = "+-*/";
        String[] tokens = tree.split(" ");
        for (String token : tokens)
            if (operations.indexOf(token.charAt(0)) == -1) {
                Operand term;
                try {
                    term = new Number(Double.parseDouble(token));
                } catch (NumberFormatException ex) {
                    term = new Variable(token);
                }
                stack.push(term);

                // If token is an operator
            } else {
                Expression expr = new Expression(token.charAt(0));
                expr.right = stack.pop();
                expr.left = stack.pop();
                stack.push(expr);
            }
        return stack.pop();
    }

}
