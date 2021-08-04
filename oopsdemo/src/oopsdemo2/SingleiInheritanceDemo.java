package oopsdemo2;
//Single Inheritance
public class SingleiInheritanceDemo {

	public static void main(String[] args) {
		Developer d1=new Developer(101,"James Gosling","JDBC");
		Developer d2=new Developer(105,"Ryan Gosling","Spring Framework");
		
		Accountant a1=new Accountant(201,"Gaurav Sharma","Process salary of employee","SAP");
		Accountant a2=new Accountant(205,"Mary John","Payment to vendors","Tally");
		
		d1.diplay();//child class object invokes parent class method
		d1.diplay1();//child class object invokes child class method
		
		d2.diplay();
		d2.diplay1();
		
		//invoke Accountant class methods
		a1.display();
		a2.display();
	
	}

}
