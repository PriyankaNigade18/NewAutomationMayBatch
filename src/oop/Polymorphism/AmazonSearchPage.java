package oop.Polymorphism;

public class AmazonSearchPage
{
	
	public void search(String pname)
	{
		System.out.println("Search by Product name: "+pname);
	}
	
	public void search(String bname,String pname)
	{
	System.out.println("Search by Product brand name: "+bname+" and Product name: "+pname);	
	}
	
	
	public void search(int price)
	{
		System.out.println("Search by Price: "+price);
	}
	
	
	
	
	
	
	

}
