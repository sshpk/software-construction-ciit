package pk.ciit.JunitMaven;

public interface ICalculator {
	int add(int num1, int num2);
	int subtract(int num1, int num2);
	int multiply(int num1, int num2);
	int devide(int num1, int num2) throws ArithmeticException;
}