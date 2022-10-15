package oop.Inheritance;


class A
{
	public void m1()
	{
		System.out.println("M1 is calling.....");
	}
}

class B extends A//A is parent and B is child of A Single level inheritance
{
	public void m2()
	{
		System.out.println("M2 is calling.....");
	}
}

class C extends B//B is parent for Child class C---Multilevel Inheritance
{
	public void m3()
	{
		System.out.println("M3 is calling.....");
	}
	
}

class D extends A
{
	public void m4()
	{
		System.out.println("M4 is calling");
	}
}

public class InheritanceDemo1 {

	public static void main(String[] args)
	{

		//Scenario1: Parent class ref and Parent class Obj
		
//		A a1=new A();
//		a1.m1();
		B b1=new B();
		b1.m1();
		b1.m2();
		
		//Scanario2: child class ref and Child class Obj
		
//		B b1=new B();
//		b1.m1();
//		b1.m2();
		
		C c1=new C();
		c1.m1();
		c1.m2();
		c1.m3();
		
		//Scenario3: Parent class ref and Child class Obj
		
//		A a2=new B();
//		a2.m1();
		
		B b2=new C();
		b2.m1();
		b2.m2();
		
		
		
		//Scenario4: Child class ref and Parent class Obj
		//Invalid 
		
		//B b2=new A();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
