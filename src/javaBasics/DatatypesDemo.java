package javaBasics;

public class DatatypesDemo {

	public static void main(String[] args)
	{
		//Primitive
		//boolean true/false   1bit
		
		boolean status=true;
		System.out.println("Boolean type data is: "+status);
		status=false;
		System.out.println("Updated boolean data is: "+status);
		boolean newstatus=false;
		System.out.println("New status is: "+newstatus);
		
		System.out.println("**********************************");
		//Numeric
		//character      //Integral ----integer floating point
		//character----single character 2byte
		char c1='A';
		System.out.println("Character data is: "+c1);
		char c2='#';//special character
		System.out.println("Special Character data is: "+c2);
		char c3=97;//accept ASCII value
		System.out.println("Character value for ASCII number 97: "+c3);
		char c4=127;
		System.out.println(c4);
		
		
		//A- Z  65  to 90
		//a-z   97 to 122
		//0-9   48 to 57
		
		
		System.out.println("****************************");
		//Integer 
		//byte 1byte   -128 to 127
		
		byte b1=120;
		System.out.println("Byte data is: "+b1);
		byte b2=-126;
		System.out.println("Byte data is: "+b2);
		//byte b3=150;
		
		//short 2byte -32768 to 32767
		short s1=150;
		System.out.println("Short data is: "+s1);
		
		short s2=30000;
		System.out.println("short data is: "+s2);
	
		//short s3=50000;
		
		//int 4byte 
		int i1=50000;
		System.out.println("Integer data is: "+i1);
		
		//int i2=9898989898; 
		
		//long 8byte
		long l1=9898989898L;
		System.out.println("Long data is: "+l1);
		long l2=9898L;
		System.out.println("Long data is: "+l2);
		
		//Floating point data type
		//1.float 4byte  7 to 8digit       
		//2.double(default) 8 byte 15 to 16 digit
		
		double d1=89.78;
		System.out.println("Double type data is: "+d1);
		
		float f1=56.89F;
		System.out.println("Float data is: "+f1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
