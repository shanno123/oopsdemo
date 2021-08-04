package newfeatures;
//short hand of lambda expression
interface hello
{
	void welcome();
}
public class MethodReferenceDemo {
	
	public static void display()
	{
		System.out.println("Hello from method reference");
	}
	MethodReferenceDemo() {
		System.out.println("In Constructor");
	}
	
	public void print()
	{
		System.out.println("Instance Mtehod call using Method Interface");
	}

	public static void main(String[] args) {
		
		//invoking FI
		hello h=MethodReferenceDemo::display;//invoke static method
		h.welcome();
		
		MethodReferenceDemo d1=new MethodReferenceDemo();
		hello h1=d1::print;//invoke instance method
		h1.welcome();
		
		hello h2=MethodReferenceDemo::new;//method reference to constructor
		h2.welcome();

	}

}
