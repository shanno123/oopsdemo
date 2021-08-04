package exceptionsdemo;

public class ThrowExample {

	public static void checkEligibility(int age,int weight)
	{
		if(age<12 && weight<40)
		{
			//we should mention the exception name by judging the program what exception might return
			//normal Exception name will not work
			throw new NullPointerException("Student is not eligible for registration");
		}
		else
		{
			System.out.println("Student with age :"+age+ " and "+weight+" is eligible");
		}
	}
	public static void main(String[] args) {

		System.out.println("Welcome to Sports Eligibility Process..");
		checkEligibility(20,45);
		System.out.println("Thank you");
		checkEligibility(10,39);

	}

}
