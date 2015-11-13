package exceptions;

public class Calculator {
	public int divide(int numberToDivide, int numberToDivideBy)
			throws Exception{
		if(numberToDivideBy == 0){
			throw new Exception("Cannot divide by 0");
		}
		return numberToDivide / numberToDivideBy;
	}
	public double squareRoot(double param){
		return Math.sqrt(param);
	}
}
