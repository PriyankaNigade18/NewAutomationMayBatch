package javaBasics;

import java.util.Scanner;

public class Assignment5
{
	
	public void add(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	

	public static void main(String[] args)
	{
		Assignment5 a1=new Assignment5();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a1.add(a, b);
		sc.close();
	}

}
