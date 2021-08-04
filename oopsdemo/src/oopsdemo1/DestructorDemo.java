package oopsdemo1;

class Test
{
	//syntax is same
	protected void finalize() //override finalize() of object class
	{
		System.out.println("Object Destroyed & Garbage collected");
	}
}

public class DestructorDemo {

	public static void main(String[] args) {
		Test t1=new Test(); //initialize object-- call default constructor
		Test t2=new Test();
		
		t1=null;//deallocate memory
		t2=null;
		
		System.gc();//invoke service method gc()--->invoke finalize()
		System.out.println("In main method");
	}

}
