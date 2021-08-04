package oopsdemo1;

import java.util.Scanner;

class AreaRectangle
{
	double length,breadth;
	double returnArea(double length,double breadth)
	{
		return length*breadth;
	}
}
public class Area {

	public static void main(String[] args) {
		AreaRectangle area=new AreaRectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breadth of Rectangle:");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.println("Area of Rectangle: "+String.format("%.2f",area.returnArea(l, b)));
		sc.close();
	}

}
