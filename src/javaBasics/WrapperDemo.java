package javaBasics;

public class WrapperDemo {

	public static void main(String[] args)
	{
		//Object to primitive
		String s1="100";
		System.out.println(s1+500);//100500
		int num=Integer.parseInt(s1);//NumberFormatException
		System.out.println(num+500);//600
		
		String s2="89.77";
		System.out.println(s2+11.11);//89.7711.11
		double d1=Double.parseDouble(s2);
		System.out.println(d1+11.11);
		
		String s3="true";
		boolean status=Boolean.parseBoolean(s3);
		System.out.println(status);
		
		String s4="R";
		char c1=s4.charAt(0);
		System.out.println(c1);
		
		
		//Primitive to Object
		
		int n1=800;
		System.out.println(n1+100);//900
		String ss1=String.valueOf(n1);
		System.out.println(ss1+100);//800100
		
		
		
		
		float f1=67.89F;
		System.out.println(f1+10.11F);
		String ss2=String.valueOf(f1);
		System.out.println(ss2+10.11F);
		
		
				
				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		
		

	}

}
