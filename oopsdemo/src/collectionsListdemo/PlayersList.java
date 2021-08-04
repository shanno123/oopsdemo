package collectionsListdemo;

import java.util.ArrayList;
import java.util.List;

public final class PlayersList {
	
	//non-generic Arraylist
	
	ArrayList playerArray;
	List subList;
	
	public PlayersList()
	{
		playerArray=new ArrayList();
		subList=new ArrayList();
	}
	
	void addPlayer()
	{
		for(int i=0;i<5;i++)
		{
			playerArray.add(i); //autoboxing
		}
		
		playerArray.add("Martina");
		playerArray.add("Serena");
		playerArray.add("Venus");
		playerArray.add("Serena");
		System.out.println();
	}
	
	void search() {
        System.out.println();
        System.out.println("************************************"
        + "***********************");
        System.out.println("Search for an object and return "
        + "the first and last position");
        System.out.println("*********************************"
        + "***************************");
        System.out.println();
        System.out.println("First occurance of the String"
        + " \"Serena\" is at position " + playerArray.indexOf("Serena")); //for searching starting value of arraylist
        System.out.println("Last occurance of the String"
        + " \"Serena\" is at position  " + playerArray.lastIndexOf("Serena")); //for searching last value of arraylist
        System.out.println();
    }
	
	void extract() {
        System.out.println("***************************"
        + "*********************");
        System.out.println("Extract a sublist and "
        + "then print the new List ");
        System.out.println("************************"
        + "*************************");
        System.out.println();
        subList = playerArray.subList(5, playerArray.size()); //for extraction
        System.out.println("New Sub-List from index 5 to "
        + playerArray.size() + " is : " + subList);
        System.out.println();
    }

	public static void main(String[] args) {

		PlayersList p1=new PlayersList();
		
		p1.addPlayer();
		p1.search();
		p1.extract();

	}

}
