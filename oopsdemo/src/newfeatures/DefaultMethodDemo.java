package newfeatures;


//java8 feature to call default methods and static methods in interface
//before this we can only have abstract methods
import java.time.LocalDate;

interface MyInterface
{
	public void square(int a); //abstract method
	
	//default methods
	default void display(String a)
	{
		System.out.println("Hello "+a);
	}
	
	//static methods
	static void printDate()
	{
		System.out.println("Today's Date :"+LocalDate.now());
	}
	
}
public class DefaultMethodDemo implements MyInterface 
{
	@Override
	public void square(int a) {
		System.out.println("The Square of number is :"+(a*a));
		
	}

	public static void main(String[] args) {
		DefaultMethodDemo d1=new DefaultMethodDemo();
		
		//call abstract methods
		
		d1.square(5);
		
		//call default methods in interface
		
		d1.display("Default Method");
		
		//call static method in interface
		MyInterface.printDate();
	}



}
