

public class Calculator {
	double squareRoot(double number) throws NegativeNumberException{
		if(number<0)
			throw new NegativeNumberException("number = "+number+", square root of negative numbers is not real");
		return Math.sqrt(number);
	}
}
