package practise;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {

	public static void main(String[] args) {

		ArrayList<Student> a=new ArrayList<Student>();
		
		Student s1=new Student(101,75,"Robert","B.tech");
		Student s2=new Student(102,70,"John","M.tech");
		Student s3=new Student(103,80,"Shwan","MCA");
		Student s4=new Student(104,65,"Troy","BCA");
		Student s5=new Student(105,95,"Steve","MBA");
		
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);
		
		Collections.sort(a);
		
		System.out.println("*******SORTED LIST BASED ON MARKS********");
		
		for(Student s:a)
		{
		System.out.println(s.rollno+" "+s.marks+" "+s.name+" "+s.course);	
		}
		

	}

}
