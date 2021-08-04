package oopsdemo2;
//Aggregation
public class AggregationDemo {

	public static void main(String[] args) {

		Address ad1=new Address("Ranchi","Jharkhand","India",834001);
		Address ad2=new Address("Prague","Austin","Czech Republic",77777);
		
		Student s1=new Student(101,"Shantonu",ad1);
		Student s2=new Student(102,"Mike",ad2);
		
		s1.display();
		s2.display();

	}

}
