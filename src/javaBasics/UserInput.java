package javaBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) throws IOException
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=sc.nextLine();
		System.out.println("Enter age:");
		int age=sc.nextInt();
		System.out.println("Enter character");
		char c=sc.nextLine().charAt(0);
		System.out.println(name);
		System.out.println(age);
		System.out.println(c);
				
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("Enter your age:");
//		InputStreamReader ir=new InputStreamReader(System.in);
//		BufferedReader br=new BufferedReader(ir);
//		String data=br.readLine();
//		int age=Integer.parseInt(data);
//		System.out.println("Hello ...Your age is: "+age);
		
		//1.
//		System.out.println("Enter your age");
//		int age=System.in.read();
//		System.out.println((char)age);
//		
		
		
//		char c1='r';
//		int num=c1;
//		System.out.println(num);
	}

}
