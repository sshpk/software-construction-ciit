package pk.cuiatd.sc.sp19.sessional1.lab.q2;

import java.util.List;

public class Demo {

	public static void main(String[] args) {
		ContactList contactList = new ContactListProxyImpl();
		Company company = new Company("ABC University", "Germany", "+49-011-28458965", contactList);
		System.out.println("Company Name: "+company.getName());
		System.out.println("Company Address: "+company.getAddress());
		System.out.println("Company Contact No.: "+company.getContactNo());
		System.out.println("Requesting for contact list");
		contactList = company.getContactList();
		List<Employee>empList = contactList.getEmployeeList();
		for(Employee emp : empList){
		System.out.println(emp);
		}

	}

}
