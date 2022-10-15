package controFlowStatement;

import java.util.Scanner;

public class NestedIfElseDemo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character:");
		char ch=sc.nextLine().charAt(0);
		
		
		if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch+" is vowel");
		}else
		{
			System.out.println(ch+" is not vowel");
		}
		
//		if(ch=='a')
//		{
//			System.out.println(ch+ " is vowel" );
//		}else if(ch=='e')
//		{
//			System.out.println(ch+ " is vowel" );
//		}else if(ch=='i')
//		{
//			System.out.println(ch+ " is vowel" );
//		}else if(ch=='o')
//		{
//			System.out.println(ch+ " is vowel" );
//		}else if(ch=='u')
//		{
//			System.out.println(ch+ " is vowel" );
//		}else
//		{
//			System.out.println(ch+ " is not vowel" );
//		}
//		
//		
		
		
		
		
		
		
		
//		System.out.println("Enter 3 numbers:");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int c=sc.nextInt();
//		
//		if(a>b && a>c)
//		{
//			System.out.println(a+" is greater");
//		}
//		else if(b>a && b>c)
//		{
//		System.out.println(b+" is greater");	
//		}else
//		{
//			System.out.println(c+" is greater");
//		}
		sc.close();

	}

}
