package javaBasics;

public class MethodCallingDemo2 
{
	
	public void m1()
	{
		System.out.println("M1 is Calling.....");
		m2();
		
	}
	
	public void m2()
	{
		System.out.println("M2 is calling.....");
		m3();
	}
	
	
	public void m3()
	{
		System.out.println("M3 is calling.....");
	}

	public static void main(String[] args)
	{

		MethodCallingDemo2 md=new MethodCallingDemo2();
		md.m1();

	}

}
