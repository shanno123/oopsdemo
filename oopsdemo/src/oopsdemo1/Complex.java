// program to calculate the addition of two complex nos.
package oopsdemo1;

public class Complex {
	
	double real;
	double imaginary;
	
	Complex(double r,double i)
	{
		real=r;
		imaginary=i;
	}
	void add(Complex obj)//we can pass objects as an argument
	{
		this.real+=obj.real; // c1=c1+c2
		this.imaginary+=obj.imaginary; // c1=c1+c2
	}
	void display()
	{
		System.out.println("r"+this.real+"+i"+this.imaginary);
	}
	
}
