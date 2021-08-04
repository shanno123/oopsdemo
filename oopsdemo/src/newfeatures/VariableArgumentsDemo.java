package newfeatures;

public class VariableArgumentsDemo {

	//takes string as 1st input parameter &followed by variable arguments
	/*in this case it has more benefit than method overloading as we
	don't need to create multiple methods for passing multiple arguments.*/
	
	static void fun(String s,int ...a)
	{
		System.out.println("String Passed :"+s);
		System.out.println("No. of Arguments passed :"+a.length);
		
		//for each loop to display var_args
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		fun("JDBC",100,200);
		fun("Swings",1,2,3,4,5,6,7);
		fun("MySQL");
	}

}
