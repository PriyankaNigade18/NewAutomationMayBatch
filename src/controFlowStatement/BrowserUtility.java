package controFlowStatement;

import java.util.Scanner;

public class BrowserUtility {

	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your browser name");
			String bname=sc.nextLine();
			if(bname.equalsIgnoreCase("Chrome"))
			{
				System.out.println("Test case is running on "+bname);
			}
			else if(bname.equalsIgnoreCase("Firefox"))
			{
				System.out.println("Test case is running on "+bname);
			}
			else if(bname.equalsIgnoreCase("Edge"))
			{
				System.out.println("Test case is running on "+bname);
			}
			else
			{
				System.out.println("Please write apporopriate browser name");
			}
			sc.close();
	}

}
