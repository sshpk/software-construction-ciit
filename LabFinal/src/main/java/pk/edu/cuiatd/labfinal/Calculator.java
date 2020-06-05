package pk.edu.cuiatd.labfinal;
public class Calculator {
	/***
	 * This method finds the maximum in three integers
	 * @param num1 the first integer
	 * @param num2 the second integer
	 * @param num3 the third integer
	 * @return maximum integer
	 */
	public int findMax(int num1, int num2, int num3) {
		int[] arr = { num1, num2, num3 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	/**
	 * This method calculates the square of a positive integer, which is less than 10
	 * @param the input integer
	 * @return the square of the input integer
	 * @throws IllegalArgumentException when the input integer is not between <code>0</code> and <code>10</code>
	 */
	public int square(int num) throws IllegalArgumentException {
		int result = 0;
		if (num > 0 && num < 10) {
			result = num * num;
		} else
			throw new IllegalArgumentException();
		return result;
	}
	/**
	 * This method calculates the cube of an integer
	 * @param num input integer
	 * @return the cube of the input integer
	 */
	public int cube(int num){
		return num*num*num;
	}
}