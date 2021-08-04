package oopsdemo3;

//use of Access Specifier
class Test
{
	int a; //default variable
	private int b; //private variable
	protected int c; //accessed in the sub class
	
	public Test(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void diplay() //public method
	{
		System.out.println("Private variable :"+b);
	}
}
class Test2 extends Test
{
	private int total;
	public Test2(int a, int b, int c) {
		super(a, b, c);
	}
	public void diplay() //public method
	{
		total=c+a;
		System.out.println("Protected variable :"+total);
	}
	
}
public class AccessSpecifiersDemo {

	public static void main(String[] args) {
		Test t1=new Test(100,200,300);
		t1.diplay();
		//t1.b=50; //compiler error...can't access private variable
		System.out.println("Default Variable :"+t1.a);
		
		Test2 t2=new Test2(100,200,300); //use of protected 
		t2.diplay();


	}

}
