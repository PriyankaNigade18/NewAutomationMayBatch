package oop.Polymorphism;

public class PolyDemo2 
{
	public PolyDemo2()
	{
		System.out.println("This is Default constructor");
	}

	public PolyDemo2(String name)
	{
		System.out.println("This is Parameterise constructor:Copy constructor: "+name);
	}
	
	public PolyDemo2(int id)
	{
		System.out.println("This is Parameterise constructor:Copy constructor: "+id);
	}
	public PolyDemo2(int id,String name)
	{
		System.out.println("This is Parameterise constructor:Copy constructor: "+id+" "+name);
	}
	public static void main(String[] args)
	{
		PolyDemo2 p1=new PolyDemo2();
		
		PolyDemo2 p2=new PolyDemo2("Testing");
	}

}
