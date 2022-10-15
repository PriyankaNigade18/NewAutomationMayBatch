package oop.Inheritance;

class X
{
	public void color()
	{
		System.out.println("Red color");
	}
}

class Y extends X
{
	@Override
	public void color()
	{
		System.out.println("Yellow color");
	}
}

//child overrides parent method


public class MethodOverridingDemo {

	public static void main(String[] args)
	{
			X a1=new X();
			a1.color();//red
			
			Y y1=new Y();
			y1.color();
			
			X x1=new Y();
			x1.color();
			
			

	}

}
