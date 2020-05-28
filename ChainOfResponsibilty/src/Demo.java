
import java.util.Scanner;

import pk.cui.sc.chain.Currency;

public class Demo {

	public static void main(String[] args) {
		DispenserChain atm = new DispenserChain();
		 
	    int amount = 0;
	    Scanner input= new Scanner(System.in);
	    while(amount != -1){
	    	System.out.println("Enter amount to dispense, -1 to quit");
	    	amount = input.nextInt();
	   		atm.dispense(new Currency(amount));
	    	
	    }
	    input.close();
	}

}

