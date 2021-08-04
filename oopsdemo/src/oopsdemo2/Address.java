package oopsdemo2;

// Use of Aggregation
//Aggregation-->Student-->AggregationDemo
public class Address {
	
	String city,state,country;
	int pincode;
	
	public Address(String city, String state, String country, int pincode) {
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}	
	// Not mandatory to declare functions
	// Only initialization is mandatory.
}
