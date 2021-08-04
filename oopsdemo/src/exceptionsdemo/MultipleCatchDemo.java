package exceptionsdemo;

public class MultipleCatchDemo {

	public static void main(String[] args) {

		 int num1 = 10;
	     int num2 = 0;
	     int result = 0;
	     int arr[] = new int[5];
	     try {// it will look for the first possible exception occuring, if it is correct then it will look for the second
	    	 arr[0] = 0;
	    	 arr[1] = 1;
	    	 arr[2] = 2;
	    	 arr[3] = 3;
	    	 arr[4] = 4;
	    	arr[5] = 5;
	    	 result = num1 / num2;
	    	 System.out.println("Result of Division : " + result);
	     }
	     catch(ArithmeticException e)
	     {
	    	 System.out.println("Error Divide by Zero :"+e);
	     }
	     catch(ArrayIndexOutOfBoundsException e)
	     {
	    	 System.out.println("Error Array Index out of bound");
	     }
	     catch(Exception e)
	     {
	    	 e.printStackTrace();
	     }

	}

}
