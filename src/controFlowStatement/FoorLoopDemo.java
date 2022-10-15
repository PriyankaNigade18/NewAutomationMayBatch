package controFlowStatement;

import java.util.Scanner;

public class FoorLoopDemo {

	public static void main(String[] args)
	{
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter number");
//			int num=sc.nextInt();
//			
//			for(int i=1;i<=10;i++)
//			{
//				System.out.println(num*i);
//			}
//			
//			sc.close();
		
		
		
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
		
		System.out.println("*************************************");

		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("*************************************");
		
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
