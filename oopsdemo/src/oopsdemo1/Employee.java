package oopsdemo1;

class employee2
{
	String name;
	int yoj;
	String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYoj() {
		return yoj;
	}
	public void setYoj(int yoj) {
		this.yoj = yoj;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	}
public class Employee {

	public static void main(String[] args) {
		employee2 e1=new employee2();
		employee2 e2=new employee2();
		employee2 e3=new employee2();
		
		e1.setName("Robert");
		e1.setYoj(1994);
		e1.setAddress("64C-WallsStreet");
		
		e2.setName("Sam");
		e2.setYoj(2000);
		e2.setAddress("68D-WallsStreet");
		
		e3.setName("John");
		e3.setYoj(1999);
		e3.setAddress("26B-WallsStreet");
		
		System.out.println("Name\t\tYear of joining \tAddress");
		System.out.println(e1.getName()+"\t\t   "+e1.getYoj()+"\t\t   "+e1.getAddress());
		System.out.println(e2.getName()+"\t\t   "+e2.getYoj()+"\t\t   "+e2.getAddress());
		System.out.println(e3.getName()+"\t\t   "+e3.getYoj()+"\t\t   "+e3.getAddress());

	}

}
