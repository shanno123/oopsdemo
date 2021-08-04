package collectionsListdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterationDemo {

	public static void main(String[] args) {

		ArrayList<String> names=new ArrayList<String>();
		
		names.add("James");
		names.add("Michael");
		names.add("Andy");
		names.add("Jim");
		names.add("Robert");
		
		System.out.println(names);
		
		//Iterator Interface for traversing in forward direction only
		Iterator<String> itr=names.iterator(); //only 
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(names.get(1));
		
		names.add(3,"Raj"); //add element in specified index
		names.remove(0); //delete first element
		names.set(1, "Java"); //replace existing element
		
		System.out.println("****Display collection using for enhanced loop****");
		
		for(String i:names)
		{
			System.out.println(i);
		}
		
		ArrayList<Double> marks=new ArrayList<Double>();
		marks.add(999.45);
		marks.add(500.55);
		marks.add(865.23);
		marks.add(645.20);
		marks.add(700.90);
		
		System.out.println();
		for(Double i:marks)
		{
			System.out.println(i);
		}
	}

}
