package pk.cuiatd.sc.sp19.sessional1.lab.q2;

public class Employee {
	private String name;
	private double salary;
	private String designation;
	public Employee(String name,double salary,String designation){		
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public String getdesignation() {
		return designation;
	}
	public String toString(){
		return "Employee Name: "+name+", Designation: "+  
				designation+", Salary: "+salary;
	}
}
