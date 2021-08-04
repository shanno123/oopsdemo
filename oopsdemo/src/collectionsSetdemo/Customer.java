package collectionsSetdemo;

//Customer-->HashSetDemoUserDefined
import java.util.Objects;

public class Customer {
	
	private long id;
	private String name;
	private String city;
	
	public Customer(long id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, id, name);
	}

	
	//this method is not mandatory for generating...only for knowledge
	@Override //if that particular customer exist or not
	public boolean equals(Object obj) {
		if (this == obj)//this refers to current object
			return true;// it tells it is existing
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;// if we are returning any other object
		Customer other = (Customer) obj; //then it will be converted into that Customer object
		return Objects.equals(city, other.city) && id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}
	
	

}
