package oopsdemo3;
//Method Overriding
class Bank
{
	int getRateOfInterest()
	{
		return 0;
	}
	void display()
	{
		System.out.println("**************Welcome to Bank***************");
	}
}
class SBI extends Bank
{
	int getRateOfInterest() //overriden method
	{
		return 5;
	}
}
class ICICI extends Bank
{
	int getRateOfInterest() //Method overriden in child class
	{
		return 7;
	}
}
class Axis extends Bank
{
	int getRateOfInterest() //Method overriden in child class
	{
		return 6;
	}
}
public class MethodOverrideDemo {

	public static void main(String[] args) {

		SBI b1=new SBI();
		ICICI b2=new ICICI();
		Axis b3=new Axis();
		
		b1.display();
		System.out.println("The Interest Rate of SBI is :"+b1.getRateOfInterest()+"%");
		
		b2.display();
		System.out.println("The Interest Rate of ICICI is :"+b2.getRateOfInterest()+"%");
		
		b3.display();
		System.out.println("The Interest Rate of AXIS is :"+b3.getRateOfInterest()+"%");

	}

}
