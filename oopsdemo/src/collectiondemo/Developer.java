package collectiondemo;

//Developer-->ComparatorDemo
//use of Comparator interface----to sort user defined objects based on multiple fields(id,domain etc.)
import java.util.Comparator;

public class Developer{
	
	int id;
	String name,domain;
	
	public Developer(int id, String name, String domain) {
		this.id = id;
		this.name = name;
		this.domain = domain;
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDomain() {
		return domain;
	}
}

class IdComparator implements Comparator<Object>
{

	@Override
	public int compare(Object o1, Object o2) {
		Developer d1=(Developer) o1;//typecasting
		Developer d2=(Developer) o2;
		
		if(d1.id==d2.id)
			return 0;
		else if(d1.id>d2.id)
			return 1;
		else
		return -1;
	}
}
	class DomainComparator implements Comparator<Object>
	{

		@Override
		public int compare(Object o1, Object o2) {
			Developer d1=(Developer) o1;//typecasting
			Developer d2=(Developer) o2;
			
			return d1.domain.compareTo(d2.domain);// for comparing string this compareTo is different than the comparable one
			
		}
		
	}
	


