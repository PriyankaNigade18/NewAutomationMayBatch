package javaBasics;

public class AccessModifier
{
	int id=101;//default
	public String name="Smita";//public
	private int phno=98989898;//private
	
	

	public static void main(String[] args) 
	{
		AccessModifier a1=new AccessModifier();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);//Within class
	}

}
