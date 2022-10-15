package controFlowStatement;

public class BranchingStatement
{
	public String getInfo(String msg)
	{
		return msg;
	}
	
	

	public static void main(String[] args)
	{
		
		BranchingStatement b1=new BranchingStatement();
		String res=b1.getInfo("Hello");
		System.out.println(res);
		
		

		for(int i=1;i<=10;i++)
		{
			if(i>=5)
			{
				//break;//pause the execution
				continue;//skip the portion of code
			}else
			{
				System.out.println(i);
			}
		}
		System.out.println("Program completed!");
		
	}

}
