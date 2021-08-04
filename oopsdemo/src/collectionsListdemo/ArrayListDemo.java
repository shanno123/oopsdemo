package collectionsListdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//generic arraylist
		ArrayList<String> a1=new ArrayList<String>();
		
		//add elements to arraylist
		a1.add("Java");
		a1.add("Perl");
		a1.add("C++");
		a1.add("C# 5.0");
		
		System.out.println(a1);
		
		//get elements by index
		System.out.println("Element at index 1 : "+a1.get(1));
		
		//check whether the list contains the element or not
		System.out.println("Does list contains element ?: "+a1.contains("Java"));
		
		//add elements at specific index also
		a1.add(2,"Oracle");
		System.out.println(a1);
		
		System.out.println("Is ArrayList Empty ? : "+a1.isEmpty());
		System.out.println("Index of perl : "+a1.indexOf("Perl"));
		System.out.println("Size of ArrayList : "+a1.size());
		
		Collections.sort(a1);
		System.out.println("Array List after sorting : "+a1);
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		
		a2.add(100);
		a2.add(500);
		a2.add(73);
		a2.add(66);
		a2.add(350);
		
		System.out.println(a2);
		System.out.println("Size : "+a2.size());
		
	}

}
