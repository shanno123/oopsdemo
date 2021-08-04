package oopsdemo2;

//Composition
class Honda extends Car
{
	public void hondaStart()
	{
		Engine heng=new Engine(); //Composition -Honda class fully dependent on Engine
		heng.startEngine();
	}
}
class Hyundai extends Car
{
	public void hondaStart()
	{
		Engine heng=new Engine(); //Composition -Honda class fully dependent on Engine
		heng.stopEngine();
	}
}

public class CompositionDemo {

	public static void main(String[] args) {
		
		Honda hondacity=new Honda();
		
		hondacity.setColor("Silver");
		hondacity.setMax_speed(180);
		
		System.out.println("********* Honda Car Details **********");
		System.out.println(hondacity.getColor()+" color");
		System.out.println(hondacity.getMax_speed()+" Speed");
		hondacity.hondaStart();
		
		Hyundai h=new Hyundai();
		
		h.setColor("Gold");
		h.setMax_speed(200);
		
		System.out.println("********* Honda Car Details **********");
		System.out.println(h.getColor()+" color");
		System.out.println(h.getMax_speed()+" Speed");
		h.hondaStart();
		
	}
}
