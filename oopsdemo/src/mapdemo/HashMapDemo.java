package mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//hashmap declaration with key-value pairs
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		
		//add elements to hash map
		hmap.put(12, "Ravi");
		hmap.put(2, "Rahul");
		hmap.put(7, "Singh");
		hmap.put(49, "Annie");
		hmap.put(3, "Amit");
		
		//Display the content using iterator
		Set s=hmap.entrySet(); //return entry values from hmap
		System.out.println(s);
		System.out.println("***********Entry Set***********");
		Iterator itr=s.iterator();
		while(itr.hasNext())//display using iterator
		{
			Map.Entry mentry=(Map.Entry) itr.next();
			System.out.println(mentry.getKey()+"-->"+mentry.getValue());
		}
		
		System.out.println("***********Key set***********");
		Set s1=hmap.keySet();
		Iterator itr1=s1.iterator();
		while(itr1.hasNext())//display using iterator
		{
			Integer key=(Integer) itr1.next();
			String value=hmap.get(key);
			System.out.println(key+"-->"+value);
		}
		
		//get values based on key
		System.out.println("The name with key 49 is :"+hmap.get(49));
		
		//remove values based on key
		hmap.remove(2);
		System.out.println(hmap);
		
	}

}
