package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		ArrayList<Developer> a1=new ArrayList<Developer>();
		
		Developer d1=new Developer(103,"Mike","Java");
		Developer d2=new Developer(105,"Mary","Dot Net");
		Developer d3=new Developer(101,"Ravi","Angular");
		Developer d4=new Developer(102,"Hary","PHP");
		Developer d5=new Developer(104,"Navin","Oracle");
		
		a1.add(d1);a1.add(d2);a1.add(d3);a1.add(d4);a1.add(d5);
		
		System.out.println("---------------Unsorted---------------");
		
		for(Developer i:a1)
		{
			System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
		}
		
		System.out.println("---------------Sorted by ID---------------");
		
		Collections.sort(a1,new IdComparator());//invoke the compare method of IdComparator 
		for(Developer i:a1)
		{
			System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
		}
		
		System.out.println("---------------Sorted by Domain---------------");
		
		Collections.sort(a1,new DomainComparator());//invoke the compare method of DomainComparator
		for(Developer i:a1)
		{
			System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
		}
		
		

	}

}
