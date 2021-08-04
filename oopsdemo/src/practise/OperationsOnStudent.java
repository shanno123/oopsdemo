package practise;

import java.util.ArrayList;

public class OperationsOnStudent {

	public static void main(String[] args) {
		ArrayList<Student> a=new ArrayList<Student>();
		
		Student s1=new Student(101,75,"Robert","B.tech");
		Student s2=new Student(102,70,"John","M.tech");
		Student s3=new Student(103,80,"Shwan","MCA");
		Student s4=new Student(104,65,"Troy","BCA");
		Student s5=new Student(105,95,"Steve","MBA");
		
		//Adding objects to the student
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);
		
		System.out.println("After adding the values are------");
		
		for(Student s:a)
		{
		System.out.println(s.rollno+" "+s.marks+" "+s.name+" "+s.course);	
		}
		System.out.println();
		System.out.println("Total Student Details :"+a.size());
		
		System.out.println();
		System.out.println("Searching a Data------------");
		//String s="John";
		for(Student s:a)
		{
			if((s.name).contains("John"))
				System.out.println("Details of John Found");
		}
		System.out.println();
		System.out.println("Failed students---------------");
		for(Student s:a)
		{
			if(s.marks<90)
				System.out.println(s);
		}
			
		System.out.println();
		System.out.println("After Remmoving the desired student------------");
		a.remove(3);
		for(Student s:a)
		{
		System.out.println(s.rollno+" "+s.marks+" "+s.name+" "+s.course);	
		}
	}
}

