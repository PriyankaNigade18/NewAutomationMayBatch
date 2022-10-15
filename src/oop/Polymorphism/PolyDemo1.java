package oop.Polymorphism;

public class PolyDemo1
{
	
	public void add()//o parameter
	{
		int a=10,b=10;
		System.out.println("Addition is: "+(a+b));
		
	}
	//1.different number of arguments
	public void add(int a,int b)//two int
	{
	System.out.println("Addition is: "+(a+b));	
	}
	
	public void add(int a,int b,int c)//int,double
	{
		System.out.println("Addition is: "+(a+b+c));
	}
	
	//2.different types of arguments
	
	public void add(double r,int d)
	{
		System.out.println("Addition is: "+(r+d));
	}
	
	//3.change the order of arguments
	
	public void add(int a,double b)
	{
	System.out.println("Addition is: "+(a+b));	
	}

	public static void main(String[] args) 
	{
		PolyDemo1 p1=new PolyDemo1();
		p1.add();
		p1.add(100,200);
		p1.add(100,100.11);
		p1.add(10,10,10);
		

	}

}
