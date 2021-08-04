package oopsdemo3;

//demonstration of Abstraction
public class TestBikeAbstraction {

	public static void main(String[] args) {
		Bike obj=new Honda(); //upcasting...cause we cannot instantiate for the parent class in abstraction
		obj.run();
		obj.changeGear();
	}

}
