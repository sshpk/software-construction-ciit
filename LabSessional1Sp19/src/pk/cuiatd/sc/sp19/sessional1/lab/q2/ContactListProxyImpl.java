package pk.cuiatd.sc.sp19.sessional1.lab.q2;

import java.util.List;

public class ContactListProxyImpl implements ContactList{
	private ContactListImpl contactList;
	@Override
	public List<Employee> getEmployeeList() {
		if(contactList == null){
			System.out.println("Creating contact list and fetching list of employees...");
			contactList = new ContactListImpl();
		}
		return contactList.getEmployeeList();
	}
}
