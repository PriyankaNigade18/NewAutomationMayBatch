package javaBasics;

public class ArrayDemo1 {

	public static void main(String[] args)
	{

		//new keyword
		int sid[]=new int[3];
		sid[0]=101;
		sid[1]=102;
		sid[2]=103;
		
		//access
		System.out.println(sid[1]);//102
		System.out.println(sid[2]);//103
		//ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		//System.out.println(sid[3]);
		//System.out.println(sid[-1]);
		
		//length variable
		System.out.println("Length of Array: "+sid.length );
		
		System.out.println("***********************************");
		//Iterate Array----1.for loop  2.for each loop(group of elements) array+collection
		
		//for loop
		for(int i=0;i<sid.length;i++)
		{
			System.out.println(sid[i]);
		}
		System.out.println("*****************************************");
		
		//for-each loop
		
		for(int i:sid)
		{
			System.out.println(i);
		}
		
		System.out.println("************************************************");
		//literal way
		
		int age[]={10,11,12,13};
		System.out.println(age[3]);//13
		//System.out.println(age[4]);//ArrayIndexOutOfBoundExpection
		
		System.out.println("Size of array: "+age.length);
		
		for(int i:age)
		{
			System.out.println(i);
		}
		
		System.out.println("******************************************");
		double d1[]= {10.23,45.67,12.89,34.67};
		System.out.println("Length of Array: "+d1.length);
		for(double i:d1)
		{
			System.out.println(i);
		}
		
		System.out.println("***************************************");
		
		
		String arr[]= {"Sarang","Vidya","Nikhita"};
		System.out.println("Length of array is: "+arr.length);
		
		for(String i:arr)
		{
			System.out.println(i);
		}
		
		System.out.println("**********************************************");
		
		Object data[]= {"Sarang",30,'M',"Pune",89.77};
		System.out.println("Length of array is: "+data.length);
		for(Object i:data)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
