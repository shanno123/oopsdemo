package newfeatures;

//lambda expression are instances of Functional interface
//lambda expression cannot be used without FI
@FunctionalInterface //optional
interface MyFunctionalInterface
{
	public String sayHello();
}
interface MyFunctionalInterface1
{
	public int incrementedByFive(int a);
}
interface StringConcat
{
	public String sconcat(String a,String b);
}
public class LambdaExpressionsDemo {

	public static void main(String[] args) {

		//Lambda expression with no parameter
		MyFunctionalInterface msg=()->{return "Hello from lambda expressions";};
		System.out.println(msg.sayHello());
		
		//Lambda expression with single parameter
		MyFunctionalInterface1 f=(num)-> num+5;
		System.out.println(f.incrementedByFive(20));
		
		//Lambda expression with multiple parameter
		StringConcat s=(str1,str2)-> str1+str2;
		System.out.println("String concat using lambda expression");
		System.out.println(s.sconcat("Hello"," Java-8"));			
	}
}
