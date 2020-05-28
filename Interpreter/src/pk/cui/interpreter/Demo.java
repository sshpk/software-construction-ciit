package pk.cui.interpreter;

import java.util.ArrayList;
import java.util.Iterator;


public class Demo {

	public static void main(String[] args) {
		String roman = "MCMXXV";
		Context context = new Context(roman);

		// Build the 'parse tree' /AST
		ArrayList<Expression> tree = new ArrayList<Expression>();
		tree.add(new ThousandExpression());
		tree.add(new HundredExpression());
		tree.add(new TenExpression());
		tree.add(new UnitExpression());

		// Interpret 
		for (Iterator it = tree.iterator(); it.hasNext();)
		{
			Expression exp = (Expression)it.next();
			exp.interpret(context);
		}

		System.out.println(roman + " = " + Integer.toString(context.getOutput()));
	}

}

