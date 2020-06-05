package pk.cui.sc.junit;

public class Calculator {
	int add(int num1, int num2){
		return num1+num2;
	}
	int subtract(int num1, int num2){
		return num1-num2;
	}
	int devide(int dividend, int devisor)throws IllegalArgumentException{
		if(devisor==0){
			IllegalArgumentException e = new IllegalArgumentException("Deviding by zero");
			throw e;
		}
		return dividend/devisor;
	}

}
