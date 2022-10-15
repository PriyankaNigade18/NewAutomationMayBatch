package javaBasics;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character");
		char c=sc.nextLine().charAt(0);
		System.out.println("Enter name:");
		String name=sc.nextLine();
		System.out.println("Enter age:");
		int age=sc.nextInt();
		System.out.println(c);
		System.out.println(name);
		System.out.println(age);
		
				
		sc.close();	}

}
