package controFlowStatement;

import java.util.Scanner;

public class SimpleIf {

	public static void main(String[] args) 
	{
		System.out.println("Program started.....");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		if(age>=18)//true
		{
			System.out.println("Valid age....");
		}
		System.out.println("Program ends!....");
		sc.close();
		
	}

}
