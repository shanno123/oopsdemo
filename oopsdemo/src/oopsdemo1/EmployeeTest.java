package oopsdemo1;

import java.util.Scanner;

class Employee1
{
	double salary=0.0;
	int noh;
	void getinfo(double s,int h)
	{
		salary=s;
		noh=h;
	}
	void Addsal()
	{
		if(salary<500)
		{
			salary=salary+10;
		}
	}
	void AddWork()
	{
		if(noh>6)
		{
			salary=salary+5;
		}
	}
	void finalsalary()
	{
		System.out.println("Total Salary= "+salary);
	}
	
}
public class EmployeeTest {

	public static void main(String[] args) {
		Employee1 e=new Employee1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary of the Employee");
		double salary=sc.nextDouble();
		System.out.println("Enter the number of hours of work per day of the Employee");
		int noh=sc.nextInt();
		e.getinfo(salary,noh);
		e.Addsal();
		e.AddWork();
		e.finalsalary();
		sc.close();
	}

}
