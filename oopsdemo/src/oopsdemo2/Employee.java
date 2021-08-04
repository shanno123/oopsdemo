package oopsdemo2;
//single inheritance
public class Employee {//base/parent class
	int empId;
	String name;
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	void diplay()
	{
		System.out.println("************Employee Details*************");
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee name :"+name);
	}

}
