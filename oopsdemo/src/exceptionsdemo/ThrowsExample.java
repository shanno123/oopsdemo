package exceptionsdemo;

import java.io.IOException;

public class ThrowsExample {
	
	void myMethod(int a) throws IOException,ArithmeticException
	{
		if(a==1)
			throw new IOException("IO Exception Ocuured");
			else
				throw new IOException("Arithmetic Exception");
	}

	public static void main(String[] args) {

		ThrowsExample t=new ThrowsExample();
		try
		{
			t.myMethod(1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			t.myMethod(0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
