package exceptionHandling;

public class ThrowDemo {

	public static void main(String[] args)
	{
		String data=null;
		if(data==null)
		{
			try {
			throw new Exception("Data is Null");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
