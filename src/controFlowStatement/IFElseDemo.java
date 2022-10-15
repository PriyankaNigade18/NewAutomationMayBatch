package controFlowStatement;

import java.util.Scanner;

public class IFElseDemo {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Age is valid");
		}
		else
		{
			System.out.println("Age is not valid");
		}
		sc.close();

	}

}
