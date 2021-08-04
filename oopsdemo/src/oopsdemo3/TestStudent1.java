package oopsdemo3;

//use of static methods and variables
public class TestStudent1 {

	public static void main(String[] args) {
		
		Student1.collegeChange(); //invoke static method even before creating object
		
		Student1 s1=new Student1(101,"Mike");
		Student1 s2=new Student1(102,"John");
		Student1 s3=new Student1(103,"Mary");
		
		s1.display();
		s2.display();
		s3.display();

	}

}
