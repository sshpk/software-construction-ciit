package pk.edu.ciit.calc;

/**
 * This is a comment for the Calculator class
 * This class provides the arithmetic operations
 */
public class Calculator {
	/**
	 * This method takes two integers as parameters
	 * and returns their sum
	 */
	public int add(int num1, int num2){
		return num1 + num2;
	}
	
	/**
	 * This method devides two integers and returns the quotient.
	 * 
	 * @param devidend is the first integer (dividend)
	 * @param devisor is the second integer (devisor)
	 * @return the quotient is returned
	 * @throws IllegalArgumentException when you try to devide by zero
	 */
	public int devide(int devidend, int devisor) throws IllegalArgumentException{
		int quotient = 0;
		if (devisor == 0){
			throw new IllegalArgumentException("can't devide by zero");
		}
		quotient = devidend/devisor;	
		return quotient;
		}
	}
