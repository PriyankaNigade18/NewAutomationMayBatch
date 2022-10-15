package javaBasics;

public class TypeCasting {

	public static void main(String[] args) 
	{
		//Implicit type casting(Automatic)
		//(smaller to larger)
		int i1=989898988;
		long l1=i1;//l1 store as long
		System.out.println("Int to long type casting: "+l1);
		
		char c1='A';
		int i3=c1;
		System.out.println("Char to int type casting: "+i3);
		
		int i5=899;
		float f1=i5;
		System.out.println("int to float type casting: "+f1);
		
		
		
		System.out.println("******************************************");
		
		//Explicit type casting
		int i2=(int) l1;
		System.out.println("Long to int type casting: "+i2);
		
		int i4=90;
		char c2=(char)i4;
		System.out.println("int to char type casting: "+c2);
		
		
		float f2=897.56F;
		int i6=(int)f2;
		System.out.println("float to int conversion: "+i6);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
