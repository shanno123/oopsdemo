package com.coforge.training.project;

class AlleghenyTollBooth implements ToolBooth
{
	int receipts,trucks;

	@Override
	public void calculateToll(Truck t) {
		
		int tollDue=(5*t.getAxle())+(t.getWeight()/500)*10;
		System.out.println("Truck Arrival- Axles: "+t.getAxle()+", Total weight :"+t.getWeight()
		+", Total due :$"+tollDue);
		receipts=receipts+tollDue;
		trucks=trucks+1;
	}

	@Override
	public void displayData() {
		System.out.println();
		System.out.println("*************Collecting Receipts***************");
		System.out.println("Total since the last collection - Receipts :$"
							+receipts+", Trucks :"+trucks);
		System.out.println();
	}
		
		public void reset()
		{
			receipts=0;
			trucks=0;
		}
		public void displayDataAfter() {
			System.out.println();
			System.out.println("------------Reset Receipts------------");
			System.out.println("Collection at- Receipts :$"
								+receipts+", Trucks :"+trucks);
			System.out.println();
		
	}
	
}
public class TestToolBooth {

	public static void main(String[] args) {

		ToolBooth Booth=new AlleghenyTollBooth();
		
		Truck ford=new Truck(5,12500);
		Truck nissan=new Truck(3,10000);
		Truck daewoo=new Truck(3,20000);
		
		System.out.println("WELCOME TO ALLEGHENEY TOOLBOOTH--------------------------");
		System.out.println("Arrival of Ford Truck :");
		System.out.println();
		Booth.calculateToll(ford);
		System.out.println("--------------------------------------------------------");
		System.out.println("Arrival of Nissan Truck :");
		System.out.println();
		Booth.calculateToll(nissan);
		System.out.println("--------------------------------------------------------");
		System.out.println("Arrival of Daewoo Truck :");
		System.out.println();
		Booth.calculateToll(daewoo);
		Booth.displayData();
		
		((AlleghenyTollBooth) Booth).reset();
		((AlleghenyTollBooth) Booth).displayDataAfter();
		

		

	}

}
