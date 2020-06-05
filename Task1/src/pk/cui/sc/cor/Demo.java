package pk.cui.sc.cor;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		ATMDispenserChain atm = new ATMDispenserChain();
		 
	    int amount = 0;
	    Scanner input= new Scanner(System.in);
	    while(amount != -1){
	    	System.out.println("Enter amount to dispense, -1 to quit");
	    	amount = input.nextInt();
	    	if (amount % 500 == 0) {
	    		// process the request
	    		atm.pay(new Currency(amount));
	    	}
	    	else{
	    		System.out.println("Amount should be in multiple of 500s.");
	    	}
	    }
	    input.close();
	}

}

