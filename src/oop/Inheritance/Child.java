package oop.Inheritance;

public class Child extends Parent
{
	int cid=201;
	
	public void childIncome()
	{	System.out.println("Parent id is: "+super.pid);
		super.parentIncome();
		System.out.println("child id:"+ cid);
		System.out.println("Child income is $9000");
	}
	
	Child()
	{
		super();//super constructor
		System.out.println("This is child constructor");
	}
	
	
	public static void main(String[] args)
	{
		Child c1=new Child();
		c1.childIncome();

	}

}
