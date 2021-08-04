package collectionsSetdemo;

//it will be in sorted order, and duplicate values will not be allowed
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		// Creating a TreeSet
        TreeSet<String> fruits = new TreeSet<>();

        // Adding new elements to a TreeSet
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        System.out.println("Fruits Set : " + fruits);

        // Duplicate elements are ignored
        fruits.add("Apple");
        System.out.println("After adding duplicate element \"Apple\" : " + fruits);

        // This will be allowed because it's in lowercase.
        fruits.add("banana");
        
      //it will show a null pointer exception at runtime because treeset doesn't contain null value
        //fruits.add(null);  
        System.out.println("After adding \"banana\" : " + fruits);
        
        // TreeSet of Integer Type
        TreeSet<Integer> tset2 = new TreeSet<Integer>();

        // Adding elements to TreeSet<Integer>
        tset2.add(88);
        tset2.add(7);
        tset2.add(101);
        tset2.add(0);
        tset2.add(3);
        tset2.add(222);
        System.out.println("For Integer type :"+tset2); 
        
        //treeset with custom comparator
        TreeSet<Integer> tset3 = new TreeSet<Integer>(Comparator.reverseOrder());
        
        tset3.add(88);
        tset3.add(7);
        tset3.add(101);
        tset3.add(0);
        tset3.add(3);
        tset3.add(222);
        System.out.println("For Integer type in reverse order using Comparator :"+tset3);

	}

}
