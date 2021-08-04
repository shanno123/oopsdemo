package oopsdemo1;

public class ConstructorDemo {
	int id;
	String name;
	float salary;
	ConstructorDemo()//Implicit or non parameterized constructor
	{
		System.out.println("I am Default Constructor");
		id=0;
		name="";
		salary=5000.00f;
	}
	void dsiplay()
	{
		System.out.println(salary);
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args) {
		ConstructorDemo cd1=new ConstructorDemo(); //invoke Implicit constructor
		ConstructorDemo cd2=new ConstructorDemo();
		ConstructorDemo cd3=new ConstructorDemo();
		
		cd1.dsiplay();

	}

}
