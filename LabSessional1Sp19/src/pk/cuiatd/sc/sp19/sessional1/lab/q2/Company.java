package pk.cuiatd.sc.sp19.sessional1.lab.q2;

public class Company {
	private String name;
	private String address;
	private String contactNo;
	private ContactList contactList ;
	public Company(String name,String address, String contactNo, ContactList contactList){
		this.name = name;
		this.address = address;
		this.contactNo = contactNo;
		this.contactList = contactList;
		System.out.println("Company object created...");
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getContactNo() {
		return contactNo;
	}
	public ContactList getContactList(){
		return contactList;
	}
}
