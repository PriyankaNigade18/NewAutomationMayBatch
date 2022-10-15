package exceptionHandling;

import java.util.Scanner;

public class ExceptionDemo
{
	int id=100;

	public static void main(String[] args)
	{
		ExceptionDemo e1=null;
		try {
			System.out.println(e1.id);//NullPointerException
		} catch ( NullPointerException e) {
			// TODO: handle exception
			System.out.println("Check Object because it is null"+e.getMessage());
		}
		
		
		

		
		
		
		
		
		//Example 3
		String s1="999AB";
		try {
			int num=Integer.parseInt(s1);//NumberFormatException
			System.out.println(num);
		} catch (Exception e) {
			System.out.println("Write correct integer number");
		}
		
		
		
		
		
		
		
		
		/*
		//Example 2
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter valid index between 0 to 4");
		int index=sc.nextInt();
		
		int arr[]= {10,20,30,40,50};
		try {
			System.out.println(arr[index]);
		} catch (Exception e) {
			System.out.println("Please pass valid index");
		}
		sc.close();
		*/		
		
		
		
		
		
		
		
		
		
		
		
		
		//Example 1:
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Addition is: "+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		try {
			System.out.println("Division is: "+(a/b));//ArithmeticException
		} catch (Exception e) {
			System.out.println("Use ant number other than 0");
		}
		
		System.out.println("Multiplication is: "+(a*b));
		sc.close();
		
	}

}
