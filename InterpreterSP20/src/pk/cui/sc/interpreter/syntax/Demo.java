package pk.cui.sc.interpreter.syntax;

import java.util.HashMap;


public class Demo {
	
	

    public static void main(String[] args) {
        System.out.println("celsius * 9 / 5 + thirty");
        String postfix = Interpreter.convertToPostfix("celsius * 9 / 5 + thirty");
        System.out.println(postfix);
        Operand expr = Interpreter.buildSyntaxTree(postfix);
        expr.traverse(1);
        System.out.println();
        HashMap < String, Integer > map = new HashMap<>();
        map.put("thirty", 30);
        for (int i = 0; i <= 100; i += 10) {
            map.put("celsius", i);
            System.out.println("C is " + i + ",  F is " + expr.evaluate(map));
        }
    }
}
