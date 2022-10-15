package javaBasics;

public class College 
{
	int id;
	String name;
	
	//this keyword is used refer current class object.
	
	public College()
	{
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
	}
	
	public College(int i,String n)//parameter----i=101,n=VIT
	{
		this.id=i;
		this.name=n;
		System.out.println("College id is: "+this.id);
		System.out.println("College name is: "+this.name);
	}
	

	public static void main(String[] args)
	{//calling
		College c1=new College();//default
		College c2=new College(101,"VIT");//arguments-->Parameterized
		College c3=new College(102,"AISSPMS");
		


	}

}
