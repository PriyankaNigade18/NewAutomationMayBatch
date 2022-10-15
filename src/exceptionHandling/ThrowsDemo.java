package exceptionHandling;

public class ThrowsDemo
{
	
	public void m1()//throws ArithmeticException
	{
		m2();
	}
	
	public void m2()//throws ArithmeticException
	{
		m3();
	}

	public void m3() //throws ArithmeticException
	{
		try {
		System.out.println(9/0);
		}catch(ArithmeticException obj)
		{
			//Handling
			System.out.println("Use any other number than 0"+obj.getMessage());
			obj.printStackTrace();
		}
		
		
		try {
			
		} catch (Exception a) {
			// TODO: handle exception
		}
		
		
	}

	
	public static void main(String[] args)//throws ArithmeticException
	{
		ThrowsDemo t1=new ThrowsDemo();
		t1.m1();

	}

}
