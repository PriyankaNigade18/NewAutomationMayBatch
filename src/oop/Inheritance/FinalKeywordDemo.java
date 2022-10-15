package oop.Inheritance;

//final class Demo
class Demo
{
	final int x=100;
	
	public final void display()
	{
		System.out.println("This is Dispaly method");
		System.out.println("X data is: "+x);
	}
	
	
}

public class FinalKeywordDemo extends Demo
{
//	@Override
//	public void display()
//	{
//		System.out.println("This is Updated method");
//		System.out.println("X data is: "+x);
//	}
//	

	public static void main(String[] args) 
	{
		Demo d1=new Demo();
		//d1.x=200;
		d1.display();
		
		Demo d2=new FinalKeywordDemo();
		d2.display();

	}

}
