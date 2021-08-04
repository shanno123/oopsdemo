package oopsdemo2;
//single inheritance
public class Developer extends Employee //child class derived from parent class
{	
	String technology;
	
	public Developer(int empId, String name,String tech) {
		super(empId, name); //invoke base/parent class constructor
		this.technology=tech;
	}
	void diplay1()
	{
		System.out.println("Technology is :"+technology);
	}

}
