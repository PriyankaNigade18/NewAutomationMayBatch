package controFlowStatement;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args)
	{
		
		
		//break---->we can use with switch and with loops
		
//		if(10>3)
//		{
//			break;
//		}
		
		
		//Switch we cant use with boolean
//		boolean flag=true;
//		switch(flag)
//		{
//		case true:
//			break;
//		}
		
		
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter character:");
			char ch=sc.nextLine().charAt(0);
			
			switch(ch)
			{
			case 'a':
				System.out.println("It is a vowel");
				break;
				
			case 'e':
				System.out.println("It is a vowel");
				break;
				
			case 'i':
				System.out.println("It is a vowel");
				break;
				
			case 'o':
				System.out.println("It is a vowel");
				break;
				
			case 'u':
				System.out.println("It is a vowel");
				break;
				default:
					System.out.println("It is not a vowel");
				
				
			}
			
			
			
			
			
//			System.out.println("Enter number between 0 to 5");
//			int num=sc.nextInt();
//			
//			switch (num) {
//			case 0:
//				System.out.println("zero");
//				break;
//			case 1:
//				System.out.println("One");
//				break;
//			case 2:
//				System.out.println("Two");
//				break;
//			case 3:
//				System.out.println("Three");
//				break;
//			case 4:
//				System.out.println("Four");
//				break;
//			case 5:
//				System.out.println("Five");
//				break;
//				
//
//			default:
//				System.out.println("Please Check number!");
//				break;
//			}
//			
			
			
			
			
			
			
			
			
//			System.out.println("Enter your browser name");
//			String bname=sc.nextLine();
//			
//			switch (bname.toLowerCase()) 
//			{
//			case "chrome":
//				System.out.println("Test Case is running on Chrome");
//				break;
//			case "firefox":
//				System.out.println("Test Case is running on Firefox");
//				break;
//			case "edge":
//				System.out.println("Test Case is running on Edge");
//				break;
//			default:
//				System.out.println("please Write appropriate browser name!");
//			}
			
			sc.close();
			
			
			
			
	}

}
