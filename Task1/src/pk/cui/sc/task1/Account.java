package pk.cui.sc.task1;

public class Account {
	private String owner;
	private int balance;
	Account(String owner){
		this.owner=owner;
	}
	String getOwner(){
		return owner;
	}
	int getBalance(){
		return balance;
	}

}
