package oopsdemo2;
//single inheritance
public class Accountant extends Employee{// child class derived from parent class
	
	String task,tech;
	
	public Accountant(int empId, String name,String t1,String t2) {
		super(empId, name);// invoke base/parent class constructor
		this.task=t1;
		this.tech=t2;
	}
	void display()
	{
		super.diplay();//invokes base display() method from Employee
		System.out.println("Accountant task :"+task);
		System.out.println("Software used :"+tech);
	}

}
