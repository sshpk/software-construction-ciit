
public class Test {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		try{
			double sqrt = calc.squareRoot(-2);
			System.out.println("sqrt = "+sqrt);
		}
		catch(NegativeNumberException e){
			ExceptionReporter.getInstance().report("Test", "main", e);
		}	

	}

}
