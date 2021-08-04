/* Java program to perform addition of 2 times
 * t1-->12:45:55
 * t2-->10:30:30
 * 
 * t1+t2
 * if sec>=60..mins should be incremented & sec -60,,
 * if min>=60..hrs. should be incremented & min -60.
 */
package oopsdemo1;

public class Time {
	
	int hrs,min,sec;

	Time(int h,int m,int s)
	{
		hrs=h;
		min=m;
		sec=s;
	}
	void add(Time t)
	{
		System.out.println("First time :"+this.hrs+":"+this.min+":"+this.sec);
		System.out.println("Second time :"+t.hrs+":"+t.min+":"+t.sec);
		this.hrs+=t.hrs;
		this.sec+=t.sec;
		this.min+=t.min;
		if(this.sec>=60)
		{
			this.min+=1;
			this.sec=this.sec-60;
		}
		if(this.min>=60)
		{
			this.hrs+=1;
			this.min=this.min-60;
		}
	}
	void diplay()
	{
		System.out.println("Total time :"+this.hrs+":"+this.min+":"+this.sec);
	}

}
