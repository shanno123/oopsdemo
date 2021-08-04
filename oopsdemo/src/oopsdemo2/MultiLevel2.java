package oopsdemo2;

// All of them will have salary
class Staff // Staff will have hra,gross
{
	private int empId;
	private String name;
	private float gross;
	protected float salary,hra;
	
	public Staff(int empId, String name, float salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	void getHRA()
	{
		hra=(salary*60)/100;
		System.out.println("HRA :"+hra);
	}
	void getGROSS()
	{
		gross=salary+hra;
		System.out.println("Gross Salary of Staff :"+gross);
	}
	void display()
	{
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee name :"+name);
		System.out.println("Employee salary :"+salary);
	}
}
class Manager extends Staff // manager will have hra,da,gross
{
	protected float da;
	private float gross;
	public Manager(int empId, String name, float salary) {
		super(empId, name, salary);
	}
	 void getDA()
	 {
		 da=(salary*80)/100;
		 System.out.println("DA :"+da);
	 }
		void getGROSS()
		{
			gross=salary+hra+da;
			System.out.println("Gross Salary of Manager :"+gross);
		}
}
// Staff-->manager-->Director
class Director extends Manager // manager will have hra,da,ta,gross
{
	private float ta, gross;
	public Director(int empId, String name, float salary) {
		super(empId, name, salary);
	}
	void getTA()
	{
		ta=(salary*30)/100;
		System.out.println("TA :"+ta);
	}
	void getGROSS()
	{
		gross=salary+hra+da+ta;
		System.out.println("Gross Salary of Director :"+gross);
	}
	
}
public class MultiLevel2 {

	public static void main(String[] args) {

		Director d1=new Director(101,"Keane",5000);
		System.out.println("*********** Director details***********");
		d1.display();//invoke staff
		d1.getHRA();//invoke staff
		d1.getDA();//invoke manager
		d1.getTA();//invoke director
		d1.getGROSS();// invoke director
		
		Manager m1=new Manager(201,"Mary",4000);
		System.out.println();
		System.out.println("*********** Manager details***********");
		m1.display();//invoke staff
		m1.getHRA();//invoke staff
		m1.getDA();//invoke manager
		//m1.getTA();//invoke director
		m1.getGROSS();// invoke director
		
		Staff s1=new Staff(201,"Mary",4000);
		System.out.println();
		System.out.println("*********** Staff details***********");
		s1.display();//invoke staff
		s1.getHRA();//invoke staff
		//s1.getDA();//invoke manager
		//s1.getTA();//invoke director
		s1.getGROSS();// invoke director
		
	}

}
