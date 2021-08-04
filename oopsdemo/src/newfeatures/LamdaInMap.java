package newfeatures;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LamdaInMap {

	public static void main(String[] args) {
		
		Map <String, String> books = new HashMap <>();
        books.put("Let Us C", "Yashwant Kanetkar");
        books.put("Object Oriented Programming using Java", "Simon Kendal");
        books.put("Java: Graphical User Interfaces", "David Etheridge");
        
        //advantage over simple for-each loop to traverse a map, only single line to traverse//feature of Java8
        books.forEach((key,value)->System.out.println("Book Name :"+key+" -Author :"+value));
        
        System.out.println("Normal way to traverse---------");// feature of Java5
        for(Entry<String, String> entry:books.entrySet())
        {
        	System.out.println(entry.getKey()+" "+entry.getValue());
        }

	}

}
