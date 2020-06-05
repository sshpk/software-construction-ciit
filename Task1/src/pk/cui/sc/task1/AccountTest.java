package pk.cui.sc.task1;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account("Sajid");
		System.out.println("Owner: "+account.getOwner());
		System.out.println("Balance: "+account.getBalance());
	}

}
