package javaBasics;

public class ParameterPassingDemo1
{
	public void add()//0 parameter
	{
		int a=10,b=30;//local
		System.out.println("Addition is: "+(a+b));
	}

	public void sub(int a,int b)//2 parameters a=700,b=20
	{
		System.out.println("Subtraction is: "+(a-b));
	}
	
	
	public int mul(int a,int b)//2 parameter a=10 b=10
	{
		return a*b;
		//return keyword returns the value from method to calling function.
	}
	
	
	public String getInfo()
	{
		return "Hello All";
	}
	 
	public ParameterPassingDemo1 getObject()
	{
		return this;
	}
	
	
	
	
	public static void main(String[] args)
	{

		//calling
		ParameterPassingDemo1 p1=new ParameterPassingDemo1();
		p1.add();
		//Compile time parameter passing without return keyword
		p1.sub(700,20);
		//compile time parameter passing with return keyword
		int result=p1.mul(10,10);
		System.out.println("Multiplication result is: "+result);
		
		String msg=p1.getInfo();
		System.out.println(msg);
		
		p1.getObject().add();
		
		
		

	}

}
