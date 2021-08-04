package exceptionsdemo;

import java.io.IOException;

public class OutOfMemoryErrorDemo {
	public void createArray(int size)
	{
	try
	{
		Integer[] a=new Integer[size];
	}
	catch(OutOfMemoryError e)
	{
		/*System.err is a PrintStream. System.err works like System.out except 
		it is normally only used to output error texts.
		Some programs (like Eclipse) will show the output to System.err in red text, 
		to make it more obvious that it is error text.*/
		System.err.println("Array size too large "+e);
		System.err.println("Max JVM memory :"+Runtime.getRuntime().maxMemory());
		System.out.println("Java Version :"+Runtime.version());
	}
	}
	public static void main(String[] args) 
	{
		OutOfMemoryErrorDemo d1=new OutOfMemoryErrorDemo();
		d1.createArray(1000*1000*1000);
		
		try {
			//get.Runtime() inbuilt method in Runtime class for running the application
			//.exec will execute the command
			//we should be knowing the exe file which we want to open
			Runtime.getRuntime().exec("mspaint");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
