package exceptionsdemo;

import java.util.Scanner;

public class DivisionDemo {

	public static void main(String[] args) {
		 int a, b, result;  
         Scanner input = new Scanner(System.in);
          System.out.println("Input two integers");
          a = input.nextInt();
          b = input.nextInt();
          try //statements to be monitored which might throw exceptions
          {
        	  result = a / b; 
              System.out.println("Result = " + result);
          }
          catch(ArithmeticException e)//Exception thrown is handled in catch block
          {
        	  System.out.println("Divide by zero error");
        	  System.out.println("Exception :"+e.getMessage());
        	  System.out.println("Exception Name & Description :"+e.toString());
        	  //Details about exception name,description,line number of code which generated exception
        	  e.printStackTrace();
          }
          finally //for cleanup operations
          {
        	  input.close();
        	  System.out.println("In Finally Block- Program execution ended");
          }

	}

}
