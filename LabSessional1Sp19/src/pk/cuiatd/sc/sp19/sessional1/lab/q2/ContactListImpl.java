package pk.cuiatd.sc.sp19.sessional1.lab.q2;

import java.util.ArrayList;
import java.util.List;

public class ContactListImpl implements ContactList{
	List<Employee> empList;
	@Override
	public List<Employee> getEmployeeList() {
		return getEmpList();
	}
	private List<Employee>getEmpList(){
		empList = new ArrayList<Employee>(5);
		empList.add(new Employee("Employee A", 2565.55, "Lecturer"));
		empList.add(new Employee("Employee B", 22574, "Director"));
		empList.add(new Employee("Employee C", 3256.77, "Assistant Professor"));
		empList.add(new Employee("Employee D", 4875.54, "Associate Professor"));
		empList.add(new Employee("Employee E", 2847.01, "Assistant Professor"));
		return empList;
	}

}
