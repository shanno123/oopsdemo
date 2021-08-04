package practise;

public class Student implements Comparable<Student> {

	 	int rollno,marks;
	 	String name,course;
	 	
	 	public Student(int rollno, int marks, String name, String course) {
	 		this.rollno = rollno;
	 		this.marks = marks;
	 		this.name = name;
	 		this.course = course;
	 	}

	public int getRollno() {
			return rollno;
		}

		public int getMarks() {
			return marks;
		}

		public String getName() {
			return name;
		}

		public String getCourse() {
			return course;
		}

	@Override
	public int compareTo(Student o) {

		if(marks==o.marks)
			return 0;
		else if(marks>o.marks)
			return 1;
		else 
			return -1;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + ", name=" + name + ", course=" + course + "]";
	}
	
	
}
