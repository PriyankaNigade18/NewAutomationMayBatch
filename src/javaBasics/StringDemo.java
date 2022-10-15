package javaBasics;

public class StringDemo {

	public static void main(String[] args)
	{

		//String is immutable class 
		//literal way
		String s1="Hello";
		String s2="Hello";
		System.out.println(s1==s2);
		s1=s1+"Hi";
		System.out.println(s1==s2);
		
		//using new( 2 times object will create inside heap area of jvm
		String s3=new String("Hello");
		System.out.println(s2==s3);
		
		//String methods
		//length()
		System.out.println("Length of s1 String: "+s1.length());
		
		//charAt(index)
		System.out.println("Character at index 4 is: "+s1.charAt(4));
		
		//convert---->1.toUpperCase()    2.toLowerCase()
		System.out.println("UpperCase String is: "+s1.toUpperCase());
		System.out.println("LowerCase String is: "+s1.toLowerCase());
		
		//contains()
		String info="Selenium WebDriver is WebUI automation tool";
		System.out.println("Check String contains Selenium?: "+info.contains("Selenium"));
		System.out.println("check String contains QTP?: "+info.contains("QTP"));
		
		//concat()
		System.out.println(s2.concat(" "+info));
		
		//equality of Strings....
		///1.equals()---Case sensitive & it will perform Exact matching
		//2.equalsIgnoreCase()------not case sensitive
		
		String s4="Welcome to learn automation";
		String s5="Welcome to learn automation testing";
		
		System.out.println("Equals(): "+s4.equals(s5));//t--false
		System.out.println("EqualsIgnoreCase(): "+s4.equalsIgnoreCase(s5));//t
		
		//trim() ignore white space before and after string 
		String s6="      Welcome All     ";
		System.out.println(s6);
		System.out.println(s6.trim());
		
		//starts-With(prefix)      ends-With(suffix)
		String s7="Xpath is Dynamic locator in Selenium";

		System.out.println("Check String starts with X: "+s7.startsWith("Xpath"));
		System.out.println("check String is ends with m: "+s7.endsWith("Selenium"));
		
		System.out.println(s7.startsWith("Selenium"));
		System.out.println(s7.endsWith("Xpath"));
		
		//split()
		String tools="HpQTP Selenium JMeter Jira Maven";
		String arr[]=tools.split(" ");
		for(String i: arr)
		{
			System.out.println(i);
		}
		System.out.println("******************************************");
		//StringBuffer and StringBuilder
		
		StringBuilder builder=new StringBuilder("Hello");
		System.out.println(builder);
		builder.append("All");
		System.out.println(builder);
		System.out.println(builder.reverse());
		
		StringBuffer sb=new StringBuffer("Welcome");
		System.out.println(sb.reverse());
		String ss1=sb.toString();
		System.out.println(ss1);
		
		
		
		//reverse string
		
		String plang="Java-Selenium";
		int ui=plang.length()-1;
		String res="";
		for(int i=ui;i>=0;i--)
		{
			res=res+plang.charAt(i);
		}
		
		System.out.println("Reverse of String "+plang+" is "+res);
		
		
		
		//StringBuilder ssb="Hello";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
