import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		ATMDispenserChain atm = new ATMDispenserChain();
		 
	    int amount = 0;
	    Scanner input= new Scanner(System.in);
	    while(amount != -1){
	    	System.out.println("Enter amount to dispense, -1 to quit");
	    	amount = input.nextInt();
	    	if (amount % 500 != 0) {
	    		System.out.println("Amount should be in multiple of 500s.");
	    	}
	    	else{
	    		// process the request
	    		atm.dispense(new Currency(amount));
	    	}
	    }
	    input.close();
	}

}

