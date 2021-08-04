package oopsdemo3;
// Dynamic Polymorphism
//Vehicle-->TestVehicle
public class Vehicle {
	
	void drive()
	{
		System.out.println("Driving Vehicle");
	}
}
	class Car extends Vehicle
	{

		@Override
		void drive() {
			System.out.println("Driving Car");
		}
		
	}
	class Truck extends Vehicle
	{

		@Override
		void drive() {
			System.out.println("Driving Truck");
		}
		void load()
		{
			System.out.println("Loading Truck");
		}
		
}
	