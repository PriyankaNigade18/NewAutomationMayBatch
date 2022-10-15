package javaBasics;

public class MethodDemo
{
	//Instance method called through Object only
	public void accept()
	{
		System.out.println("This is instance method");
	}
	
	//Static method you can call directly by with or without class name
	public static void display()
	{
		System.out.println("This is static method");
	}
	
	
	

	public static void main(String[] args)
	{
		//calling
		display();
		MethodDemo.display();
		MethodDemo m1=new MethodDemo();
		m1.accept();
		//m1.display();
		
		
		
		
		

	}

}
