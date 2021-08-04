package oopsdemo3;
// Method Overloading
//Addition-->MethodOverloadDemo
public class Addition {
	
	void add()
	{
		System.out.println("Method Overloading Demo");
	}
	
	 // If this add() is not used type promotion will take place
	// i.e the next method with same parameters will do the operation.
	void add(int a,int b)  
	{
		System.out.println("The Addition of 2 nos. is :"+(a+b));
	}
	void add(float a,float b)
	{
		System.out.println("The Addition of 2 nos. is :"+(a+b));
	}
	void add(int a,int b,int c)
	{
		System.out.println("The Addition of 3 nos. is :"+(a+b+c));
	}
	void add(String s1,String s2)
	{
		System.out.println("The addition of 2 Strings is :"+(s1+s2));
	}
	
}
