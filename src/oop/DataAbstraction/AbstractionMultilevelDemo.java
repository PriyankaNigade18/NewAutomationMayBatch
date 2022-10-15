package oop.DataAbstraction;

abstract class A
{
	public abstract void show();
	public abstract void display();

}

class B extends A
{
	public void m1()
	{
		System.out.println("This is m1");
	}

	@Override
	public void show() {
		System.out.println("This is show from B");
		
	}

	@Override
	public void display() {
		System.out.println("this is display from b");
		
	}
}

class C extends B
{
	public void m2()
	{
		System.out.println("This is m2()");
	}

//	@Override
//	public void show() {
//		System.out.println("This is updated method");
//		
//	}
}




public class AbstractionMultilevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
