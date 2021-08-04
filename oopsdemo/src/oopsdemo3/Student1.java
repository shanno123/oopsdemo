package oopsdemo3;

// use of static methods and variables
//Student1-->TestStudent1
public class Student1 {
	
	private int rollNo;
	private String name;
	private static String college="SRM";
	
	static void collegeChange()
	{
		college="RVCE";
	}

	public Student1(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	void display()
	{
		System.out.println(rollNo+" "+name+" "+college);
	}

}
