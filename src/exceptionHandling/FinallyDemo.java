package exceptionHandling;

public class FinallyDemo {

	public static void main(String[] args) 
	{
		
		System.out.println(10+12);
		try {
			System.out.println(11/0);
		} catch(Exception e) {
			System.out.println("Please enter any number other than 0");
		}
		finally {
			// TODO: handle finally clause
			System.out.println("Program completed!");
		}
		
		

	}

}
